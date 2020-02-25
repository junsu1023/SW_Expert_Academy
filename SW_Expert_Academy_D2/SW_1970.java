import java.util.Scanner;

public class SW_1970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            int price = sc.nextInt();
            int[] cnt = new int[8];
            int save = price;

            if(save>=50000){
                cnt[0] = save/50000;
                save%=50000;
            }

            price = save;
            if(save>=10000){
                cnt[1] = save/10000;
                save%=10000;
            }

            price = save;
            if(save>=5000){
                cnt[2] = save/5000;
                save%=5000;
            }

            price = save;
            if(save>=1000){
                cnt[3] = save/1000;
                save%=1000;
            }

            price = save;
            if(save>=500){
                cnt[4] = save/500;
                save%=500;
            }

            price = save;
            if(save>=100){
                cnt[5] = save/100;
                save%=100;
            }

            price = save;
            if(save>=50){
                cnt[6] = save/50;
                save%=50;
            }

            price = save;
            if(save>=10){
                cnt[7] = save/10;
                save%=10;
            }

            System.out.println("#" + i + "\n" + cnt[0] + " " + cnt[1] + " " + cnt[2] + " " + cnt[3] + " " + cnt[4] + " " + cnt[5]
                    + " " + cnt[6] + " " + cnt[7]);
        }
    }
}
