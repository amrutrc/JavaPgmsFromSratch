package StringPgms;

public class pgm01 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello from pgm01!");
        String actualWord = "Java"; 
        System.out.println("The word is: " + actualWord);
        String reversedWord = "";
        char[] charArray = actualWord.toCharArray();
        for(int i = charArray.length-1 ; i >= 0 ; i--)
        {
            reversedWord = reversedWord+charArray[i];
        }
        System.out.println("The reversed word is: " + reversedWord);
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