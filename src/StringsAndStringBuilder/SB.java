package StringsAndStringBuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }

    //Difference is that it is not creating a new object evert time. Every time it is changing in original object. This is not immutable.
    //Just like array we can change same here we can change.
}
