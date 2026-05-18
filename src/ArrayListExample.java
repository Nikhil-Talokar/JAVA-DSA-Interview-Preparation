import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Arrays have a fixed size whereas ArrayList has no fixed size we can add any number of elements in it.
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(12);
//        list.add(142);
//        list.add(17);
//        list.add(89);
//        list.add(56);
//
//        System.out.println(list);
//        System.out.println(list.contains(17));
//        list.set(0,99);
//        System.out.println(list);

        //input
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i)); //pass an index here. list[index] won't work
        }

//        System.out.println(list);
    }
}
