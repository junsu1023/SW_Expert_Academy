import java.util.Scanner;

public class SW_5549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            String input = sc.next();
            int once_pos = Integer.parseInt(input.substring(input.length()-1));
            if(once_pos%2 == 1) System.out.println("#" + tc + " " + "Odd");
            else System.out.println("#" + tc + " " + "Even");
        }
    }
}
