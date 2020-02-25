import java.util.Arrays;
import java.util.Scanner;

public class SW_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=10; i++){
            int num = sc.nextInt();
            int result = 0;
            int[] building = new int[num];
            for(int j=0; j<building.length; j++){
                building[j] = sc.nextInt();
            }
            for(int j=2; j<building.length-2; j++){
                int[] near = new int[4];
                near[0] = building[j] - building[j-1];
                near[1] = building[j] - building[j-2];
                near[2] = building[j] - building[j+1];
                near[3] = building[j] - building[j+2];

                if( near[0]<0 || near[1]<0 || near[2]<0 || near[3]<0 ) continue;
                else {
                    Arrays.sort(near);
                    result += near[0];
                }
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
