import java.util.Scanner;

public class stringorbuffer {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String og = sc.nextLine();

        StringBuffer sb = new StringBuffer(og);
        String reversed = sb.reverse().toString();

        if(og.equals(reversed))
        {
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
        sc.close();
    
    }    
}
