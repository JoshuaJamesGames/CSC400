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
                    while (!operatorStack.isEmpty() && checkPrecedence(nextCharacter, operatorStack.peek())){
                        //Append operatorStack.peek() to postfix
                        postfix += operatorStack.pop();
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
                        postfix += topOperator;
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
            postfix += topOperator;
        }
        return postfix;
    }

    public boolean checkPrecedence(char currentOperator, char nextOperator){
        //compares the currentOperator to nextOperator
        //if nextOperator is ^, +, -, *, / and <= in precedence, return true

        //convert operators to numeric values
        //We'll use a switch since convertToPostfix does
        int currentOperatorValue = operatorValue(currentOperator);
        int nextOperatorValue = operatorValue(nextOperator);

        //Need an if/else stack when using boolean logic
        //compare the values
        if(nextOperatorValue <= currentOperatorValue){
            return true;
        }
        
        return false;
    }

    public int operatorValue(char operator){
        //Since ASCII values are not in-order we need to assign our own

        switch(operator){
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
        }
        //0 represents a non-valid operator, should be a variable
        return 0;
    }

}

