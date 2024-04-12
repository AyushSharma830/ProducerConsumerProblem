public class Producer extends Thread{

    Company c;

    Producer(Company c){
        this.c = c;
    }

    public void run(){
        int n=1;
        while(true){
            try {
                c.produce_item(n);
                Thread.sleep(1000);
                n++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
