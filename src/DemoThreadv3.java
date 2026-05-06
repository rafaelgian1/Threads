import java.util.concurrent.Semaphore;

public class DemoThreadv3 {
    static Semaphore semaphore = new Semaphore(2); //locks 2 Each time
    public static void main(String[] args) {
        new Thread(()->{
            try {
                printChar('A');
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(()->{
            try {
                printChar('B');
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        new Thread(()->{
            try {
                printChar('C');
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
    static  void printChar(char ch) throws InterruptedException{
        semaphore.acquire();
        for(int i=0; i<100;i++){
            System.out.println(ch);
        }
        semaphore.release();
    }
}
/*semaphore works as a lock principle. In this example it locks 2 threads at the same time,
when one thread is finished and therefore released, another thread comes in. Something like
a queue in a barbershop
 */
