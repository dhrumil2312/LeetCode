import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(String input : ops){
            if (input.equals("C")){
                stack.pop();
            }
            else if (input.equals("D")){
                int cur = stack.peek()*2;
                stack.push(cur);
            }
            else if(input.equals("+")){
                int last = stack.pop();
                ans = last + stack.peek();
                stack.push(last);
                stack.push(ans);
            }
            else{
                stack.push(Integer.parseInt(input));
            }
            for(Integer i : stack) System.out.print(i +" ");
            System.out.println();
        }
        int res = 0;
        for(Integer i : stack) res += i;
        System.out.println(res);
    }
}
