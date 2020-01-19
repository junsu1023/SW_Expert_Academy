import java.util.Scanner;

public class SW_5601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            int num = sc.nextInt();
            System.out.print("#" + tc + " ");
            for(int i=0; i<num; i++){
                System.out.print("1/" + num + " ");
            }
            System.out.println("");
        }
    }
}
