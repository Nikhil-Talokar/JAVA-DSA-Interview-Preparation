package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Nikhil";
        char target = 'k';

        System.out.println(searchInString(name, target));

//        System.out.println(Arrays.toString(name.toCharArray()));

    }

    //2. enhanced for loop to iterate over a string
    static boolean searchInString2(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        //enhanced for loop requires a collection like array so string is converted into character array using toCharArray()
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }


    //1. foreach loop to iterate over a string
    static boolean searchInString(String str, char target){
        if(str.length() == 0) {
            return false ;
        }

        //iterate over a string
        for (int i=0; i<str.length(); i++){
            //if we want character at any particular index in a string then use chatAt()
            if(target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}
