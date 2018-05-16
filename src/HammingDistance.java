

public class HammingDistance {
    public static void main(String[] args) {
        int x = 4;
        int y = 14;

        String binary_x = Integer.toBinaryString(x);
        String binary_y = Integer.toBinaryString(y);

        int count = 0;
        if (binary_x.length() < binary_y.length()){
            binary_x = String.format("%0"+ (binary_y.length() - binary_x.length()) + "d%s"  , 0, binary_x);
        }
        else if(binary_x.length() > binary_y.length()){
            binary_y = String.format("%0"+ (binary_x.length() - binary_y.length()) + "d%s"  , 0, binary_y);
        }
        int j = 0;
        while(j<binary_y.length()){
            if(binary_x.toCharArray()[j] != binary_y.toCharArray()[j]){
                count++;
            }
            j++;
        }
        System.out.println(count + binary_x.length() - binary_y.length());


        // 2nd approach

        int ans = 0;
        while (x != 0 || y != 0) {
            if (x % 2 != y % 2) {
                ans++;
            }
            x = x / 2;
            y = y / 2;
        }
        System.out.println(ans);


    }
}
