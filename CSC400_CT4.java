import java.util.Stack;

public class CSC400_CT4 {
    public static void main(String[] args) {
        
        String test1 = "(a+b)/(c-d)";
        String test2 = "a/(b-c)*d";
        String test3 = "a-(b/(c-d)*e+f)^g";
        String test4 = "(a-b*c)/(d*e^f*g+h)";
        String test5 = "a/b*(c+(d-e))";

        System.out.println(convertToPostfix(test1));
        System.out.println(convertToPostfix(test2));
        System.out.println(convertToPostfix(test3));
        System.out.println(convertToPostfix(test4));
        System.out.println(convertToPostfix(test5));
        

    }

    public static String convertToPostfix(String infix){
    
        /* Converts an infix expression to an equivalent postfix expression.
        
        */
        
        Stack<Character> operatorStack = new Stack<Character>();
        String postfix = "";

        //Remove whitespace
        infix = infix.replaceAll("\\s", "");

        //While infix has characters left to process
        while (infix.length() > 0){
            System.out.print(postfix + "  ");
            System.out.print(infix + "  ");
            System.out.println(operatorStack);

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

    public static boolean checkPrecedence(char currentOperator, char nextOperator){
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

    public static int operatorValue(char operator){
        //Since ASCII values are not in-order we need to assign our own

        switch(operator){
            case '(': case ')': return 4;
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
        }
        //0 represents a non-valid operator, should be a variable
        return 0;
    }

}

