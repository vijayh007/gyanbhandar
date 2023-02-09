package JavaBaiscs;

public class ImmutableDemo {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(10);
        System.out.println(immutableClass.getA());
        int b = immutableClass.getA();
        System.out.println(b);
    }
}
