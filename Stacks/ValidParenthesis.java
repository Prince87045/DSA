import java.util.Stack;
public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);

            if(curr == '[' || curr == '(' || curr == '{'){//opening parenthesis
                s.push(curr);
            }else{//closing parentesis
                if(s.isEmpty()){
                    return false;
                }

                if( (curr == ']' && s.peek() == '[')
                || (curr == '}' && s.peek() == '{')
                || (curr == ')' && s.peek() == '(') ){
                    s.pop();
                }else{
                    return false;
                }
            }           
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="(()[{}]{})";
        boolean result=isValid(str);
        System.out.println(result);
    }
}
