import java.util.Arrays;
import java.util.Scanner;

public class SW_1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=10; i++){
            int num = sc.nextInt();
            int[] box = new int[100];
            for(int j=0; j<box.length; j++){
                box[j] = sc.nextInt();
            }

            for(int j=0; j<num; j++){
                box[99]--;
                box[0]++;
                Arrays.sort(box);
            }
            int result = box[99] - box[0];
            System.out.println("#" + i + " " + result);
        }
    }
}
