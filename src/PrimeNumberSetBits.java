
public class PrimeNumberSetBits {
    public static void main(String[] args) {
        int l = 0;
        int r = 10;
        int count = 0;
        for (int i = l ; i <= r ; i++){
            String cur = Integer.toBinaryString(i);
            int num = cur.length() - cur.replace("1","").length();
            if(isPrime(num)){
                count+=1;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if (num == 2 || num ==3) return true;
        else if (num < 2 || num%2 ==0) return false;
        else{
            for(int i = 3 ; i < Math.sqrt(num) ; i +=2){
                if (num%i==0) return false;
            }
            return true;

        }

    }
}
