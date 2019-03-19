package JK;

import java.util.Stack;

public class BalancedParenthesis {

    public static boolean algorithm(String balance) {
        boolean result;
        Stack stack = new Stack();
        for (int i = 0; i < balance.length(); i++){
            if (balance.charAt(i) == '('){
                stack.push(1);
            }else {
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            result = true;
            System.out.println("OK");
        }else{
            result = false;
            System.out.println("Nie OK");
        }
            return result;
    }
}
