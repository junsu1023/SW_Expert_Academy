import java.util.Scanner;

public class SW_1948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            int[] month = new int[2];
            int[] day = new int[2];
            int range = 0;
            for (int j = 0; j < 2; j++) {
                month[j] = sc.nextInt();
                day[j] = sc.nextInt();
            }
            range = day[1]-day[0]+1;
            for(int k=month[0]; k<month[1]; k++)
                range += days[k-1];
            System.out.println("#" + i + " " + range);
        }
    }
}
