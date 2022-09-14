//Rather than implementing my own Stack class
//The textbook suggests using the Java built-in
import java.util.Stack;

public class Expression {

    private String infix = "";
    private String postfix = "";

    //Constructor - no default
    Expression(String infix){
        this.infix = infix;
        this.postfix = convertToPostfix(infix);
    }

    //Only a getter for postfix is required
    public String getPostfix(){
        return postfix;
    }

    public String getInfix(){
        return infix;
    }

    
    static String convertToPostfix(String infix){

        //Helper function to create postfix from the textbook
        //Converts an infix expression to an equivalent postfix expression.
               
        Stack<Character> operatorStack = new Stack<Character>();
        String postfix = "";

        //Remove whitespace
        infix = infix.replaceAll("\\s", "");

        //While infix has characters left to process
        while (infix.length() > 0){

            //Remove comments to see the postfix, infix , and stack operations
            
            //System.out.print(postfix + "  ");
            //System.out.print(infix + "  ");
            //System.out.println(operatorStack);
            
            //First character using index 0
            char nextCharacter = infix.charAt(0);

            //Remove the first character from infix
            infix = infix.substring(1);
            
            //Logic for processing characters from textbook
            switch (nextCharacter){
                
                case '^' :
                    operatorStack.push(nextCharacter);
                    break;
                case '+' : case '-' : case '*' : case '/' :
                    while (!operatorStack.isEmpty() && checkPrecedence(nextCharacter, operatorStack.peek())){
                        //Append operatorStack to postfix
                        postfix += operatorStack.pop();
                    }
                    operatorStack.push(nextCharacter);
                    break;
                case '(' :
                    operatorStack.push(nextCharacter);
                    break;
                case ')' : 
                    // Stack is not empty if infix expression is valid 
                    //because at least '(' will be present
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

    static boolean checkPrecedence(char currentOperator, char nextOperator){
        //compares the currentOperator to nextOperator
        //if nextOperator is ^, +, -, *, / and <= in precedence, return true

        //convert operators to numeric values
        //We'll use a switch since convertToPostfix does
        int currentOperatorValue = operatorValue(currentOperator);
        int nextOperatorValue = operatorValue(nextOperator);

        //compare the values
        if(nextOperatorValue <= currentOperatorValue){
            return true;
        }
        
        return false;
    }

    static int operatorValue(char operator){
        //Since ASCII values are not in-order we need to assign our own
        //Higher value == higher precedence

        switch(operator){
            case '(': case ')': return 4;
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
        }
        //0 represents a non-valid operator, should be a variable a-z or A-Z
        return 0;
    }
}
