public class Company {

    int n;
    Boolean producerChance = true;
    synchronized public void produce_item(int n) throws InterruptedException {
        if(!producerChance){
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        producerChance = false;
        notify();
    }

    synchronized public void consume_item() throws InterruptedException {
        if(producerChance){
            wait();
        }
        System.out.println("Consumed : " + this.n);
        producerChance = true;
        notify();
    }
}
