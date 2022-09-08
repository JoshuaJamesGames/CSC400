
public class CSC400_CT4 {
    public static void main(String[] args) {
        
        Expression test1 = new Expression("(a+b)/(c-d)");
        Expression test2 = new Expression("a/(b-c)*d");
        Expression test3 = new Expression("a-(b/(c-d)*e+f)^g");
        Expression test4 = new Expression("(a-b*c)/(d*e^f*g+h)");
        Expression test5 = new Expression("a/b*(c+(d-e))");

        System.out.println(test1.getPostfix());
        System.out.println(test2.getPostfix());
        System.out.println(test3.getPostfix());
        System.out.println(test4.getPostfix());
        System.out.println(test5.getPostfix());        

    }  

}

