import java.util.Scanner;

public class SW_2072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;

        for(int i=0; i<num; i++){
            for(int j=0; j<10; j++){
                int n = input.nextInt();
                if(n%2==1)
                    sum+=n;
            }
            System.out.println("#" + (i+1) + " " + sum);
            sum = 0;
        }
    }
}
