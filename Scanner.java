import java.util.Scanner;

public class Scanner{
    public static void main(String[] args){
        Scanner keyboardScan = new Scanner(System.in);

        System.out.println("Enter your name:" );
        String name = keyboardScan.nextLine();
        
        System.out.printf("Hello %s!", name);

    }
}
