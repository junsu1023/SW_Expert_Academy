import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SW_1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

        for(int i=1; i<=num; i++){
            int res = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<res; j++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            System.out.print("#" + i + " ");

            for(int j=0; j<list.size(); j++){
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }
}
