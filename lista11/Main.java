import java.util.concurrent.Semaphore;
import java.util.Random;

public class Main {
    private static final int liczbaDomownikow = 4;

    private static Czajnik czajnik = new CzajnikSem();
    //private static Czajnik czajnik = new Czajnik();
    //private static Czajnik czajnik = new CzajnikMon();


    public static void main(String[] args) throws Exception {
        Domownik[] domownicy = new Domownik[liczbaDomownikow];
        for (int i = 0; i < liczbaDomownikow; i++) {
            Random r = new Random();
            domownicy[i] = new Domownik(r.nextInt(9), i);
            domownicy[i].start();
        }
    }
    static class Domownik extends Thread{
        private final int naczynieSize;

        Domownik(int naczynieSize, int number) throws Exception {
            super("Domownik nr. " + number);
            //bo czajnik ma wielkość 10
            if (naczynieSize > 10) throw new Exception("Illegal size!");
            this.naczynieSize = naczynieSize;
        }
        void pij() throws InterruptedException {
            System.out.println(getName() + " pije napitek");
            //różne prędkości picia - element losowości
            Random random = new Random();
            sleep(random.nextInt(10000));
            System.out.println(getName() + " skończył pić");
            przygotuj();
        }

        void przygotuj() throws InterruptedException {
            czajnik.take();

            if (czajnik.getWoda() >= naczynieSize)  // jeżeli starczy wody
            {
                System.out.println(getName() + " napełnia swoje naczynie");
                czajnik.wylej(naczynieSize);
                czajnik.release();
                pij();
            }
            else
            {
                System.out.println(getName() + " gotuje wodę");
                czajnik.fill();
                czajnik.wylej(naczynieSize);
                czajnik.release();
                pij();
            }
        }
        @Override
        public void run() {
            try {
                pij();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
