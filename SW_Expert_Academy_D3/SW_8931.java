import java.util.Scanner;
import java.util.Stack;

public class SW_8931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int test_case = sc.nextInt();
        for(int tc=1; tc<=test_case; tc++){
            int num = sc.nextInt();
            int input = 0;
            int sum = 0;
            for(int i=0; i<num; i++){
                input = sc.nextInt();
                if(input != 0) stack.add(input);
                else stack.pop();
            }
            for(int i:stack) sum += i;
            System.out.println("#" + tc + " " + sum);
            stack.clear();
        }
    }
}
