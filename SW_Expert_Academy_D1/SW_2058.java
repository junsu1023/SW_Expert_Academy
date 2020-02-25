import java.util.Scanner;

public class SW_2058 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;

        while(num>0){
            int rest = num%10;
            sum += rest;
            num/=10;
        }
        System.out.println(sum);
    }
}
