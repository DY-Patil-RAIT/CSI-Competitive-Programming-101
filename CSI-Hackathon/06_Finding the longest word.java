import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String s = sc.nextLine();

        
        String[] words = s.split(" ");

        String longestWord = "";
        int maxLength = 0;

       
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        
        System.out.println(longestWord);

        sc.close();
    }
}
