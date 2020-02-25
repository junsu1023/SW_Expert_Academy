import java.util.Scanner;

public class SW_2050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alpha = input.nextLine();
        for(int i=0; i<alpha.length(); i++){
            System.out.print(alpha.charAt(i)-'A'+1);
            System.out.print(" ");
        }
    }
}
