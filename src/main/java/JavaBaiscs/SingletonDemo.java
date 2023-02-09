package JavaBaiscs;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj = Singleton.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj = Singleton.getInstance();
            }
        });
        t1.start();
        t2.start();

    }
}
