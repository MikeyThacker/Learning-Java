public class Strings {
    void character() {
        /*
        A character is a single letter, digit, or symbol
        Surrounded by single quotation marks (') in declaration
        Can be compared using =, !=, >, etc.

        There is an in-built function for characters that does things such as:
            - isUpperCase()
            - isLowerCase()
            - isLetter()
            - isWhitespace()
         */
    }

    void strings() {
        /*
        Constructed as a sequence of characters
        Not a primitive data type
        Used differently such as .equals() instead of ==
        == compares memory locations instead of the internal value of the string

        Java won't create a string twice. It will just have two variables
            that point to the same memory location
        Get around this using the "new" keyword

        You cannot change the size of a string. It has a fixed length.
        Actually when you do this, the new string is being stored elsewhere
            in memory and the identifier is pointed to a different location in memory

        Use system.identityHashCode() to show where the value is being stored in memory
         */
    }

    void usefulMethods() {
        String a = "A";
        String b = "B";
        String c = "a";

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(c) + "\n");

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));

        // compareTo() returns a value based on which ASCII value comes first

        a.length();
        b.toUpperCase();
        c.toLowerCase();

        a.charAt(0);

        b.endsWith("B");
        c.startsWith("b");

        a.replaceAll("A", "a");
        b.substring(1);
        c.contains("a");
    }

    void otherStringClasses() {
        /*
        Can use StringBuilder for more efficiency
        And StringBuffer to make the String class more safe

        Use StringBuilder if you know you'll need to keep adding a string
        Use String if the string will be used or changed not as much
         */
    }


}
