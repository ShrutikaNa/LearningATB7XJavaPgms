package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        long phone_no = 8329622812L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);
        // JVM - GC -

    }
}
