import java.util.Scanner;

public class SW_1945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            int a=0, b=0, c=0, d=0, e=0;
            int input = sc.nextInt();
            int temp = input;

            while(temp%2==0){
                a++;
                temp/=2;
            }
            temp = input;
            while(temp%3==0){
                b++;
                temp/=3;
            }
            temp = input;
            while(temp%5==0){
                c++;
                temp/=5;
            }
            temp = input;
            while(temp%7==0){
                d++;
                temp/=7;
            }
            temp = input;
            while(temp%11==0){
                e++;
                temp/=11;
            }
            System.out.println("#" + i + " " + a + " " + b + " " + c + " " + d + " " + e);
        }
    }
}
