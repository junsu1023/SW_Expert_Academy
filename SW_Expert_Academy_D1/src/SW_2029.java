import java.util.Scanner;

public class SW_2029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1; i<=num; i++) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("#" + i + " " + num1 / num2 + " " + num1 % num2);
        }
    }
}
