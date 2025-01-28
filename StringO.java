import java.util.Scanner;

public class StringO{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String uppercaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseStr);
        int length = str.length();
        System.out.println("Length of the string: " + length);
        System.out.println("Enter a character to replace:");
        char charToReplace = scanner.next().charAt(0);
        System.out.println("Enter a replacement character:");
        char replacementChar = scanner.next().charAt(0);
        String replacedStr = str.replace(String.valueOf(charToReplace), String.valueOf(replacementChar));
        System.out.println("String after replacement: " + replacedStr);
        System.out.println("Enter the starting index of the substring:");
        int startIndex = scanner.nextInt();
        System.out.println("Enter the ending index of the substring:");
        int endIndex = scanner.nextInt();
        String substring = str.substring(startIndex, endIndex);
        System.out.println("Extracted substring: " + substring);
    }
}



