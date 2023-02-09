package JavaBaiscs;

public class Singleton {
    private Singleton(){
        System.out.println("Object Created");
    }
    public static  Singleton obj = null;

    public static Singleton getInstance(){
        if(obj == null) {
            synchronized (Singleton.class) {
                if (obj == null)
                    obj = new Singleton();
            }
        }
        return obj;
    }

}
