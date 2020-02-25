import java.util.Scanner;

public class SW_2056 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] DOM = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i=1; i<=num; i++){
            String date = input.next();
            int month = Integer.valueOf(date.substring(4,6));
            int day = Integer.valueOf(date.substring(6,8));
            String check = "-1";
            if(month>=1 && month <=12 && day >= 1 && day <= DOM[month-1]) {
                check = String.format("%s/%s/%s", date.substring(0, 4), date.substring(4, 6), date.substring(6, 8));
            }
            System.out.println("#" + i + " " + check);
        }
    }
}
