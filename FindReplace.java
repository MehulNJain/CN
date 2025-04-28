package JavaPOE;

import java.io.*;
import java.util.Scanner;

public class FindReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter the word to find: ");
        String wordToFind = sc.nextLine();

        System.out.print("Enter the word to replace with: ");
        String wordToReplace = sc.nextLine();

        String content = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null) {
                content += line + "\n";
            }
            reader.close();
        } catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        int count = 0;
        int index = 0;
        while((index = content.indexOf(wordToFind, index)) != -1) {
            count++;
            index += wordToFind.length();
        }

        System.out.println("The word '" + wordToFind + "' occurred " + count + " times.");

        content = content.replace(wordToFind, wordToReplace);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.close();
            System.out.println("All occurrences replaced successfully.");
        } catch(IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
