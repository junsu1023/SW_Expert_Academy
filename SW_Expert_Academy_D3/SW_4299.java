import java.util.Scanner;

public class SW_4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            int day = sc.nextInt();
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int byetime = (day*24)*60 + (hour*60) + minute;
            int happytime = (11*24)*60 + 11*60 + 11;
            int result = byetime - happytime;
            if(result < 0) result = -1;
            System.out.println("#" + tc + " " + result);
        }
    }
}
