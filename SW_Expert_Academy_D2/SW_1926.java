import java.util.Scanner;

public class SW_1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if(i<=10){
                if(i%3==0){
                    System.out.print("- ");
                    continue;
                }
            }
            else if(i<=100){
                int ten1 = i/10;
                int one1 = i%10;
                if(ten1%3==0 && (one1%3==0 && one1!=0)) {
                    System.out.print("-- ");
                    continue;
                }
                else if(ten1%3==0 || (one1%3==0 && one1!=0)){
                    System.out.print("- ");
                    continue;
                }
            }
            else{
                int hundred = i/100;
                int ten2 = i/10%10;
                int one2 = i%10;
                if(hundred%3==0 && (ten2%3==0 && ten2!=0) && (one2%3==0 && one2!=0)){
                    System.out.print("--- ");
                    continue;
                }
                else if((hundred%3==0 && (ten2%3==0 && ten2!=0)) || (hundred%3==0 && (one2%3==0 && one2!=0))
                        || ((ten2%3==0 && ten2!=0) && (one2%3==0 && one2!=0))) {
                    System.out.print("-- ");
                    continue;
                }
                else if(hundred%3==0 || ten2%3==0 || one2%3==0) {
                    System.out.print("- ");
                    continue;
                }
            }
            System.out.print(i + " ");
        }
    }
}
