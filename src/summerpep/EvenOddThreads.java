package summerpep;



public class EvenOddThreads {
    public static void main(String[] args) {

        
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Even: " + i);
                    }
                }
            }
        });

       
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 != 0) {
                        System.out.println("Odd: " + i);
                    }
                }
            }
        });

        
        t1.start();
        t2.start();
    }
}
