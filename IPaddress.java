import java.util.Scanner;

public class IPaddress {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IP Address:-");
        String ip = sc.nextLine();

        // Extract the first octet

        String firstoctet = ip.substring(0,ip.indexOf('.'));
        int firstoctet1 = Integer.parseInt(firstoctet);

        if(firstoctet1 >=0 && firstoctet1 <=127)
        {
            System.out.println("Class A");

        }else if(firstoctet1 >= 128 && firstoctet1 <=191)
        {
            System.out.println("Class B");

        }else if(firstoctet1 >= 192 && firstoctet1 <=223)
        {
            System.out.println("Class C");

        }else if(firstoctet1 >= 224 && firstoctet1 <=239)
        {
            System.out.println("Class D");

        }else if(firstoctet1 >= 240 && firstoctet1 <=255)
        {
            System.out.println("Class E");

        }else{
            System.out.println("Invalid IP address");
        }

        sc.close();
        



    }
    
}
