import java.util.Scanner;

public class SW_2019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int mul = 1;
        for(int i=0; i<=num; i++) {
            System.out.print(mul + " ");
            mul*=2;
        }
    }
}
