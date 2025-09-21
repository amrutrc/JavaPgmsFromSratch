/* Java pgm to check whether the string is palindrome using built-in(reverse) libaray methods */

package StringPgms;

public class pgm01_B 
{
public static void main(String[] args) 
    {
        String actualWord = "MOM"; 
        String reversedWord = "";
        System.out.println("The actaulWord is ::" +actualWord);
        StringBuffer sb = new StringBuffer(actualWord); 
        reversedWord = reversedWord+sb.reverse();
        System.out.println("Reversed Word is :: " +reversedWord);
        if(actualWord.equals(reversedWord))
        {
            System.out.println("The word is a palindrome");
        }
        else
        {
            System.out.println("The word is not a palindrome");
        }
    }
}
