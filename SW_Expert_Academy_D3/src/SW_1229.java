import java.util.LinkedList;
import java.util.Scanner;

public class SW_1229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            LinkedList<Integer> list = new LinkedList<>();
            int origin_length = sc.nextInt();
            for(int i=0; i<origin_length; i++)
                list.add(sc.nextInt());
            int order = sc.nextInt();
            for(int i=0; i<order; i++){
                String st = sc.next();
                if(st.equals("I")) {
                    int where = sc.nextInt();
                    int many = sc.nextInt();
                    for (int j = 0; j < many; j++) {
                        list.add(where, sc.nextInt());
                        where++;
                    }
                }
                else if(st.equals("D")){
                    int where = sc.nextInt();
                    int many = sc.nextInt();
                    for(int j=0; j<many; j++) {
                        list.remove(where);
                    }
                }
            }
            System.out.print("#" + tc + " ");
            for(int i=0; i<10; i++)
                System.out.print(list.poll() + " ");
            System.out.println();
        }
    }
}
