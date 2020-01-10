import java.util.Scanner;

public class SW_2068 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int max = 0;

        for(int i=1; i<=num; i++){
            for(int j=0; j<10; j++){
                int n = input.nextInt();
                if(n > max) max = n;
            }
            System.out.println("#" + i + " " + max);
            max = 0;
        }
    }
}
