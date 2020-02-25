import java.util.Scanner;

public class SW_1284 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int p, q, r, s, w, A, B;
        for(int i=1; i<=num; i++){
            p = input.nextInt();
            q = input.nextInt();
            r = input.nextInt();
            s = input.nextInt();
            w = input.nextInt();
            A  = p*w;
            if(w<r)
                B = q;
            else
                B = q+(w-r)*s;
            int result = A<B ? A:B;
            System.out.println("#" + i + " " + result);
        }
    }
}
