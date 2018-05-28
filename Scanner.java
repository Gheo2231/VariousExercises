import java.util.Scanner;
class Scanner {
    public static void main(String[ ] args) {
    Scanner keyboardScan = new Scanner(System.in)
       System.out.println("Enter name, please:");
       String name = keyboardScan.nextLine();
        System.out.printf("Hello %s!", name);
    }
}
