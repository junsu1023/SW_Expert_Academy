import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SW_2063 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = input.nextInt();
        int[] n = new int[num];

        for(int i=0; i<num; i++){
            n[i] = input.nextInt();
            list.add(n[i]);
        }

        Collections.sort(list);
        System.out.println(list.get(list.size()/2));
    }
}
