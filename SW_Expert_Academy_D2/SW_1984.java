import java.util.Scanner;

public class SW_1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int max = -1;
            int min = 10001;
            double sum = 0;
            int n = 0;
            for(int j=0; j<10; j++){
                n = sc.nextInt();
                if(n > max) max = n;
                if(n < min) min = n;
                sum += n;
            }
            sum-=max;
            sum-=min;
            System.out.println("#" + (i+1) + " " + Math.round(sum/8));
        }
    }
}
