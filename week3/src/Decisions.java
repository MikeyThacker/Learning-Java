public class Decisions {
    void usingSwitch() {
        /*
        if (keycode == "a"){
            moveLeft();
        }
        if (keycode == "d"){
            moveRight();
        }
        if (keycode == "s"){
            moveDown();
        }
        if (keycode == "w"){
            moveUp();
        }

        To solve the multiple IF statements:
        String keyCode = "a"
        switch(keyCode) {
            case "a" : moveLeft(); break
            case "d" : moveRight(); break
            case "s" : moveDown(); break
            case "w" : moveUp(); break
            default: doSomethingElse(); break
        */
    }

    void conditionalOperator() {
        /*
        An abbreviated form of the if statement
        Use it in simple examples, not complicated code
        testExpression ? trueResult : falseResult;

        // Keeping health above ot equal to 0

        As an if statement:
        if (health - damage > 0) {
            health = health - damage;
        } else {
            health = 0
        }

        // Using Ternary statement:
        health = (health - damage > 0 ) ? health - damage : 0;
         */
    }

    void notOperator() {
        /*
        Can use the ! symbol to negate the result of a boolean expression
        Can also use not equal to: !=

        boolean dead = false;
        if (!dead) {
            <code to execute if dead is false>
        }
        if ( dead != true) {
            <code to execute if dead is also false>
        }
         */
    }

    void operatorPrecedence() {
        /*
        Highest
        !
        *, /, %
        +, -
        >, <, >=, <=
        ==, !=
        &&
        ||
        ?:
        =
        Lowest
         */
    }

}
