import java.util.Scanner;

public class SW_2043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int k = input.nextInt();
        int count =0;
        for(int i=k; i<=p; i++){
            count++;
        }
        System.out.println(count);
    }
}
