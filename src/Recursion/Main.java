package Recursion;

public class Main {
    public static void main(String[] args) {
        //print the message Hello world
//        helloWorld();

        //print the message Hellow world 5 times without modifying the function and without calling it 5 times. Don't add Hello World 5 times in one function.
        helloWorld();
    }

    static void helloWorld() {
        System.out.println("Hello World");
        helloWorld1();
    }

    static void helloWorld1() {
        System.out.println("Hello World");
        helloWorld2();
    }

    static void helloWorld2() {
        System.out.println("Hello World");
        helloWorld3();
    }

    static void helloWorld3() {
        System.out.println("Hello World");
        hellowWorld4();
    }

    static void hellowWorld4() {
        System.out.println("Hello World");
    }
}
