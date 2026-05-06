public class DemoThread2 {
    static int count = 0;
    static void main(String[] args) {
        new Thread(()->{simpleLoop();}).start();
        new Thread(()->{simpleLoop();}).start();
        new Thread(()->{simpleLoop();}).start();
    }

    static void simpleLoop(){
        int i=0;
        count=0;
        for(;count<20; count++){
            i=count;
            System.out.println("i="+i+", ");
        }
        System.out.println("count= "+ count);
    }
}
/*3 threads enter simultaneously in the loop when the loop for instance
has values like 19, and the program bypass easily the check statement for count to be
 less than 20. Count 22 did the sum but did not reach the print statement before the printed count=21 that comes in the following line.
 (Each run count results may different, I just described what happens in my current run)
 */