import java.util.concurrent.Semaphore;

public class CzajnikSem extends Czajnik{
    private final Semaphore free = new Semaphore(1, true);
    private int woda;

    public CzajnikSem() {
        this.woda = 10;
    }

    void fill() throws InterruptedException {
        woda = 10;
        sleep(1000);
    }
    void wylej(int wylanaWoda){
        if (wylanaWoda <= 10)
        {
            woda -= wylanaWoda;
            if (woda < 0) woda = 0;
        }
    }

    public int getWoda() {
        return woda;
    }

    public void take() throws InterruptedException {
        free.acquire();
    }

    public void release() {
        free.release();
    }

}
