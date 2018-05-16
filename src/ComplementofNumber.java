public class ComplementofNumber {
    public static void main(String[] args) {
        int num = 10;
        //System.out.println(Integer.toBinaryString(num));
        String bin = Integer.toBinaryString(num);
        System.out.println(num ^ ((1 << bin.length()) - 1));

        StringBuilder re = new StringBuilder();
        re.append(bin);
        String ans = String.valueOf(re.reverse());
        System.out.println(re.reverse());
    }
}
