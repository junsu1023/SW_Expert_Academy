import java.util.Scanner;

public class SW_5603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            int num = sc.nextInt();
            int[] hay = new int[num];
            int sum = 0;
            int avg = 0;
            for(int i=0; i<num; i++){
                hay[i] = sc.nextInt();
                sum += hay[i];
                avg = sum/num;
            }
            int rest = 0;
            for(int i=0; i<num; i++){
                if(hay[i] < avg) {
                    rest += avg - hay[i];
                }
            }
            System.out.println("#" + tc + " " + rest);
        }
    }
}
