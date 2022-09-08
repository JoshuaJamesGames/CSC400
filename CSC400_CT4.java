import java.util.Stack;

public class CSC400_CT4 {
    public static void main(String[] args) {
        
    }

    public String convertToPostfix(String infix){
    
        /* Converts an infix expression to an equivalent postfix expression.
        
        */
        
        Stack<Character> operatorStack = new Stack<Character>();
        String postfix = "";

        //Remove whitespace
        infix = infix.replaceAll("\\s", "");

        //While infix has characters left to process
        while (infix.length() > 0){

            char nextCharacter = infix.charAt(0);

            infix = infix.substring(1);
            
            switch (nextCharacter){
                
                case '^' :
                    operatorStack.push(nextCharacter);
                    break;
                case '+' : case '-' : case '*' : case '/' :
                    while (!operatorStack.isEmpty() and precedence of nextCharacter <= precedence of operatorStack.peek()){
                        //Append operatorStack.peek() to postfix
                        operatorStack.pop();
                    }
                    operatorStack.push(nextCharacter);
                    break;
                case '(' :
                    operatorStack.push(nextCharacter);
                    break;
                case ')' : // Stack is not empty if infix expression is valid
                    char topOperator = operatorStack.pop();
                    while (topOperator != '('){
                        //Append topOperator to postfix
                        topOperator = operatorStack.pop();
                    }
                    break;
                default: 
                    //Accept only characters from the alphabet as valid variables
                    if((nextCharacter >= 'a' && nextCharacter <= 'z') || (nextCharacter >= 'A' && nextCharacter <= 'Z')){
                        postfix += nextCharacter;
                    }
                    break; // Ignore unexpected characters
            }
        }

        while (!operatorStack.isEmpty()){
            char topOperator = operatorStack.pop(); 
            //Append topOperator to postfix
        }
        return postfix;
    }

}

