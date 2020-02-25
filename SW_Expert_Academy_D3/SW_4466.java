import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SW_4466 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            int exam_num = sc.nextInt();
            int sum_num = sc.nextInt();
            for(int i=0; i<exam_num; i++) list.add(sc.nextInt());
            Collections.sort(list, Collections.reverseOrder());
            int result = 0;
            for(int i=0; i<sum_num; i++) result += list.get(i);
            list.clear();
            System.out.println("#" + tc + " " + result);
        }
    }
}
