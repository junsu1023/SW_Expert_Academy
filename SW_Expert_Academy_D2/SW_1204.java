import java.util.Scanner;

public class SW_1204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i=1; i<=num; i++){
            int tc = input.nextInt();
            int maxScore = 0;
            int[] scores = new int[1000];
            int[] count = new int[101];
            for(int j=0; j<1000; j++){
                scores[j] = input.nextInt();
                count[scores[j]]++;
            }
            for(int k=0; k<count.length-1; k++){
                if(count[maxScore]<=count[k])
                    maxScore = k;
            }
            System.out.println("#" + tc + " " + maxScore);
        }
    }
}
