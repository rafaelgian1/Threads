public class DemoThread {
    public static void main(String[] args) {
        new Thread(()->{printChar('A');}).start();
        new Thread(()->{printChar('B');}).start();
        new Thread(()->{printChar('C');}).start();
    }
    static void printChar(char ch){
        for(int i=0; i<100;i++){
            System.out.println(ch);
        }
    }
}
/*The 3 threads run simultaneously so the output will be random between a-c*/


