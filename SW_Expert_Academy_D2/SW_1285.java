import java.util.Scanner;

public class SW_1285 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            int throw_num = input.nextInt();
            int min = 100001;
            int num = 0;
            int[] people = new int[throw_num];
            for(int j=0; j<throw_num; j++){
                people[j] = input.nextInt();
                if(min > Math.abs(people[j]))
                    min = Math.abs(people[j]);
            }
            for(int k=0; k<throw_num; k++){
                if(min == Math.abs(people[k]))
                    num++;
            }
            System.out.println("#" + i + " " + min + " " + num);
        }
    }
}
