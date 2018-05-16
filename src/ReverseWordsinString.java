public class ReverseWordsinString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = "";
        String[] q = s.split(" ");
        for (String input : q){
            StringBuilder cur = new StringBuilder();
            cur.append(input);
            ans +=" " + String.valueOf(cur.reverse());

        }


        for(int i = 0 ; i < s.length() ; i++){
            int val = s.charAt(i);
            System.out.println(val + "  " + s.charAt(i));
        }

        System.out.println(ans.trim());


    }
}
