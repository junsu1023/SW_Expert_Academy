import java.util.Scanner;

public class SW_2071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;

        for(int i=0; i<num; i++){
            for(int j=0; j<10; j++){
                int n = input.nextInt();
                sum += n;
            }
            System.out.println("#" + (i+1) + " " + Math.round((sum/10.0)));
            sum=0;
        }
    }
}
