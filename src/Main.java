void main() {
        Thread t1 = new Thread(new Runnable() {
           @Override
            public void run(){
               System.out.print("Hello from t1\n");
           }
    });
        t1.start();
        Thread t2 = new Thread(()->
                System.out.println("Hello from t2\n"));
        t2.start();
        new Thread(()->
                System.out.println("Hello from anonymous thread\n")).start(); //Because the thread is anonymous it needs to be run at the same line
    }
