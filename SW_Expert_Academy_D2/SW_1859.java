import java.util.Scanner;

public class SW_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            int day = sc.nextInt();
            int[] price = new int[day];
            for(int j=0; j<day; j++)
                price[j] = sc.nextInt();
            long sum = 0;
            int max = price[day-1];
            for(int j=day-2; j>=0; j--){
                if(price[j] > max) max = price[j];
                else sum += max - price[j];
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
