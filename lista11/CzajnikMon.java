
public class CzajnikMon extends Czajnik{

    private int woda;
    private boolean isOcc = true;

    public CzajnikMon() {
        this.woda = 10;
    }

    void fill() throws InterruptedException {

        woda = 10;
        sleep(1000);

    }
    public synchronized void wylej(int wylanaWoda){
        while(isOcc) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (wylanaWoda <= 10)
        {
            woda -= wylanaWoda;
            if (woda < 0) woda = 0;
        }
        isOcc = true;
        notifyAll();
    }

    public synchronized int getWoda() {
        while (!isOcc) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOcc = false;
        notifyAll();
        return woda;
    }

    public void take() throws InterruptedException {

    }


    public void release() throws InterruptedException {

    }

}
