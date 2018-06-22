public class ReverseInteger {
    public static void main(String[] args) {
        int a = -1634654564;
        try{


        if(a ==0 || a > Integer.MAX_VALUE) System.out.println(0);
        if(a > 0) {
            char[] num = Integer.toString(a).toCharArray();
            String ans = "";
            for(int i = num.length-1 ; i >=0 ; i--){
                ans += num[i];
            }
            System.out.println(ans);
        }
        else if(a<0){
            a = a*-1;
            char[] num = Integer.toString(a).toCharArray();
            String ans = "-";
            for(int i = num.length-1 ; i >=0 ; i--){
                ans += num[i];
            }
            int res = Integer.parseInt(ans);
            System.out.println(ans);
            System.out.println(res);
        }
        } catch (Exception ex){
            System.out.println(0);
        }

    }
}
