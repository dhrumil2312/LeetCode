public class CustomSort {
    public static void main(String[] args) {
        String t = "cba";
        String s = "abcd";
        StringBuilder res = new StringBuilder();
        for(char a : t.toCharArray()){
            if (s.indexOf(a) >= 0){
                int count = s.length() - s.replaceAll(String.valueOf(a), "").length();
                //System.out.println(count);
                while(count >0){
                    res.append(a);
                    count--;
                }
                //System.out.println(res);
                s = s.replaceAll(String.valueOf(a), "");
            }
        }
        res.append(s);
        System.out.println(res.toString());

    }
}
