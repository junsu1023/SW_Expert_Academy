import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SW_6730 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            int num = sc.nextInt();
            int[] obstacle = new int[num];
            for(int i=0; i<num; i++){
                obstacle[i] = sc.nextInt();
            }
            for(int i=0; i<num-1; i++){
                if(obstacle[i]-obstacle[i+1]>0) positive.add(obstacle[i]-obstacle[i+1]);
                else if(obstacle[i]-obstacle[i+1]<0) negative.add(obstacle[i]-obstacle[i+1]);
            }
            Collections.sort(positive, Collections.reverseOrder());
            Collections.sort(negative);
            if(positive.size()==0 && negative.size()==0) System.out.println("#" + tc + " " + "0" + " " + "0");
            else if(positive.size()!=0 && negative.size()==0) System.out.println("#" + tc + " " + "0" + " " + positive.get(0));
            else if(positive.size()==0 && negative.size()!=0) System.out.println("#" + tc + " " + (-negative.get(0)) + " " + "0");
            else System.out.println("#" + tc + " " + (-negative.get(0)) + " " + positive.get(0));
            positive.clear();
            negative.clear();
        }
    }
}
