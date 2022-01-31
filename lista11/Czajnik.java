public class Czajnik extends Thread{
    private int woda;

    public Czajnik() {
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
    }

    public void release() throws InterruptedException {
    }
}
