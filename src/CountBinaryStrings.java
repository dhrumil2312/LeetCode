public class CountBinaryStrings {

    public static void main(String[] args) {
        String binary="001100";

        int ans = 0;
        int cur = 1;
        int prev = 0;

        for(int i = 1 ; i < binary.length() ; i++){
            if (binary.charAt(i-1) != binary.charAt(i)) {
                ans += Math.min(prev , cur);
                prev = cur;
                cur = 1;
            }
            else{
                cur+=1;
                }

            }
        System.out.println(ans + Math.min(prev,cur));

        }

    }

