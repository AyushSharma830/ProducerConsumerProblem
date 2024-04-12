public class Consumer extends Thread{

    Company c;

    Consumer(Company c){
        this.c = c;
    }

    public void run(){
        while(true){
            try {
                c.consume_item();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
