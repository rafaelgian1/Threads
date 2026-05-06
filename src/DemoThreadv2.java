public class DemoThreadv2 {
    public static void main(String[] args) {
        new Thread(()->{printChar('A');}).start();
        new Thread(()->{printChar('B');}).start();
        new Thread(()->{printChar('C');}).start();
    }
    static synchronized void printChar(char ch){
        for(int i=0; i<100;i++){
            System.out.println(ch);
        }
    }
}
/*with synchronized modifier the program prints serialized.
Basically we did nothing because the other methods are in hold
so parallel programming is not achieved with synchronized modifier*/