import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        
        Stack<Character> stack = new Stack();
        
        for (char c : s.toCharArray()){
          if (c == '(' || c == '[' || c == '{'){
            stack.push(c);
          }else{
            if(stack.isEmpty()){
              return false;
            }
            char topo = stack.pop();
            
            if ((c == ')' && topo != '(') ||
                    (c == '}' && topo != '{') ||
                    (c == ']' && topo != '[')) {
                    return false;
                }
          }
        }
        return stack.isEmpty();

    }

}
