import java.util.Scanner;

public class SW_3314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            int[] exam = new int[5];
            int sum = 0;
            int avg = 0;
            for(int i=0; i<5; i++){
                exam[i] = sc.nextInt();
                if(exam[i] < 40) exam[i] = 40;
                sum += exam[i];
                avg = sum/5;
            }
            System.out.println("#" + tc + " " + avg);
        }
    }
}
