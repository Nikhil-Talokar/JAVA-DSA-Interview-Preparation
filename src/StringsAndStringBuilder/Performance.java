package StringsAndStringBuilder;

public class Performance {
    public static void main(String[] args) {

        String series = "";
        for (int i=0; i<26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; //series += ch
        }
        System.out.println(series);
    }
    // there is one problem over here every time creating the new object, coping the old oen and appending the new changes
    //every time chars are getting add like 1 + 2 + 3 + 4 ...+ N. N(N+1)/2 ==> (N^2 +N)/2 ==> O(N^2)
}
