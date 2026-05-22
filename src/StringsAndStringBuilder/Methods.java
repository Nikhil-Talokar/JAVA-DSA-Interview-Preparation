package StringsAndStringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name  = "Nikhil Talokar Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.trim());
        System.out.println(name.contains("T"));
        System.out.println(name.indexOf('i'));
        System.out.println("    Nikhil    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
