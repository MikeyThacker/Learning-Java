package Challenge;

public class Main {
    public static void main(String[] args) {
        caseOne();
        caseTwo();
        caseThree();
        caseFour();
        caseFive();

    }

    public static void printExpression(Expression e) {
        System.out.println(e.getContent());
    }

    public static void caseOne() {
        Expression e = new Expression("MIIUII");
        System.out.println("Case 1: " + e.getContent() + " to MIIU:");
        printExpression(e);

        e.ruleTwo();
        printExpression(e);

        e.ruleThree();
        printExpression(e);

        e.ruleFour();
        printExpression(e);

        e.ruleThree();
        printExpression(e);

        e.ruleFour();
        printExpression(e);

        e.ruleOne();
        printExpression(e);
        System.out.println("Rules used: 2, 3, 4, 3, 4, 1\n");
    }

    public static void caseTwo() {
        Expression e = new Expression("MII");
        System.out.println("Case 2: " + e.getContent() + " to MUIIU:");
        printExpression(e);

        e.ruleTwo();
        printExpression(e);

        e.ruleThree();
        printExpression(e);

        e.ruleOne();
        printExpression(e);

        e.ruleTwo();
        printExpression(e);

        e.ruleFour();
        printExpression(e);
        System.out.println("Rules used: 2, 3 ,1, 2, 4\n");


    }

    public static void caseThree() {
        Expression e = new Expression("MI");
        System.out.println("Case 3: " + e.getContent() + " to MUIIU:");
        printExpression(e);

        e.ruleTwo();
        printExpression(e);

        System.out.println("Same as Case Two From Here");
        System.out.println("Rules used: 2, 2, 3, 4, 3, 4, 1\n");
    }

    public static void caseFour() {
        Expression e = new Expression("MUIIU");
        System.out.println("Case 4: " + e.getContent() + " to MIU:");
        printExpression(e);

        e.ruleTwo();
        printExpression(e);

        e.ruleFour();
        printExpression(e);

        e.ruleThree();
        printExpression(e);

        e.ruleFour();
        printExpression(e);

        System.out.println("Rules used: 2, 4, 3, 4\n");
    }

    public static void caseFive() {
        System.out.println("Case 5: " + new Expression("MI").getContent() + " to MU:");
        System.out.println("This case is not possible");
    }
}
