import java.util.Scanner;

public class SW_1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            char[] memory = sc.next().toCharArray();
            int cnt = 0;
            char location = '0';

            for(char i:memory){
                if(i != location){
                    cnt++;
                    location = i;
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }
}
