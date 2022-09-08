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

}

