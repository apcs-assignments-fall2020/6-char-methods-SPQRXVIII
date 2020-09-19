import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        int c = ch;
        c+= 32;
        ch = (char) c;
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String a = "";
        for(int i = 0; i < str.length(); i++){
            int ch = str.charAt(i);
            if( (ch <= 90) && (ch >= 65)){
                ch+=32;
            }
            a += (char) ch;
        }
        return a;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        int c = ch;
        c-= 32;
        ch = (char) c;
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String a = "";
        for(int i = 0; i < str.length(); i++){
            int ch = str.charAt(i);
            if( (ch <= 122) && (ch >= 97)){
                ch-=32;
            }
            a += (char) ch;
        }
        return a;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String str = scan.nextLine();
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String str_1 = scan.nextLine();
        if( str_1.equals("lowercase")){
            System.out.println("Here is your string in lowercase: "+ myToLowerCase(str));
        }
        else{ System.out.println("Here is your string in uppercase: "+ myToUpperCase(str));}
        scan.close();
    }
}
