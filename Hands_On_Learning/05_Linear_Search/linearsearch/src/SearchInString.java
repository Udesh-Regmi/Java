import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        String userInput = new Scanner(System.in).nextLine();
        char targetCharacter = new Scanner(System.in).next().charAt(0);

       boolean isInString=  searchInStringUsingForEach(userInput, targetCharacter);
        System.out.println("The character is " + isInString + " at the string");

    }
    static  boolean searchInString(String str, char target){
        if(str.length() == 0 ){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean searchInStringUsingForEach(String str, char target){
        if(str.length() == 0 ){
            return false;
        }
        // Here changing the string into array of characters with .toCharArray() function
       for(char ch : str.toCharArray()){
           if(ch == target){
               return true;
           }
       }
        return false;
    }
}
