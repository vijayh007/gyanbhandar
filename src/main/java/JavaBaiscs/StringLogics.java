package JavaBaiscs;

public class StringLogics {
    public static void main(String[] args) {
        String s1 = "Vijay";
        String s2 = "Vijay";

        String s3  = new String("Vijay");
        String s4 = new String("Vijay");

        String s5 = s1;
        String s6 = s3;

        System.out.println(s1 == s2); //true
        System.out.println(s2 == s3); //false
        System.out.println(s3 == s4); //false
        System.out.println(s5 == s1); //true
        System.out.println(s5 == s2); //true
        System.out.println(s6 == s3); //true
        System.out.println(s6 == s4); //false

        System.out.println("---------------------------------------");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s5.equals(s1));
        System.out.println(s5.equals(s2));
        System.out.println(s6.equals(s3));
        System.out.println(s6.equals(s4));

    }
}
