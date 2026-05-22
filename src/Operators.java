import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b');

        System.out.println("a" + "b");

        System.out.println('a' + 3);

        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        //integer will convert into Integer that will call toString()
        //this is same as after a few step : "a" + "1"

        System.out.println("Nikhil" + new ArrayList<>());

        System.out.println("Nikhil" + new Integer(56));

        String ans = "Nikhil" + "" + new ArrayList<>();

        System.out.println(ans);
    }
}
