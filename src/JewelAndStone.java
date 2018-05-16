import java.util.Scanner;

public class JewelAndStone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String J = sc.next();
        String S = sc.next();
        int count = 0;
        for (char a : S.toCharArray()){
            if(J.indexOf(a)>=0){
                count++;
            }

        }

        System.out.println(count);
    }
}
