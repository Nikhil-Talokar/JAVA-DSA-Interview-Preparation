package StringsAndStringBuilder;

public class Comparisons {
    public static void main(String[] args) {
        String a = "Nikhil";
        String b = "Nikhil";
        String c = a;

        // == comparator operator ==> checks the reference variables pointing to the same memory location
        System.out.println(a == b);

        System.out.println(c == a);

        String name1 = new String("Nikhil");
        String name2 = new String("Nikhil");

        System.out.println(name1 == name2);

        // .equals() ==> checks the content or value of the reference variables
        System.out.println(name1.equals(name2));

//        System.out.println(name1[0]); ❌❌
        System.out.println(name1.charAt(0));  //✅ passed the index
    }
}
