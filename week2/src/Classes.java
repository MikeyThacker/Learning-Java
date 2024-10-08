public class Classes {
    public void DefiningAClass() {
        /*
        <Optional access specifier> <keyword "class"> <legal identifier (class name)>
        Access specifier defaults to protected if not specified
        */
    }

    public void InstanceVariables() {
        /*
        e.g., weapon class
        String name;
        int damage;
        double attackSpeed;
        These are not stored in a method, but underneath the class definition line
        These are also protected by default but common to change this to private
         */
    }

    public void partsOfAClass() {
        /*
        Three different types of methods in a class:
        Mutator method - set or change method
        Accessor method - getter method
        Utility method - perform related actions without changing values

        e.g., setDamage(), getDamage(), calcDPS()
              setter,      getter,      utility
         */
    }

    public void StaticMethods() {
        /*
        Nonstatic methods are used with object instantiations called instance methods
        Static methods are linked to a class and not the object instance
        See Static.java
         */
    }

    public void InstantiatingObjects() {
        /*
        To create an object that is an instance of a class:
        - Supply a type and identifier
        - Allocate memory for the object using the "new" keyword
        - This creates a reference to an object
        - Use this reference to access the methods and attributes of the object
         */
    }

    public void dataHiding() {
        /*
        Encapsulation is also known as data hiding
        Data fields should be private and inaccessible from a client (other class)
        Fields should only be accessed through getter and setter methods
        Clients should not be able to alter assigned values or set values directly
         */
    }

    public void constructor() {
        /*
        Constructs an object
        Java automatically creates a default constructor with no arguments for us.
        We use it by calling the "new" keyword

        It must have the same name as the class it constructs

        Generally, constructors accept parameters
        These parameters define the starting values for our data fields
        You can define multiple constructors so long as their signature is different(number of parameters)

         */
    }

    public void theThisReference(){
        /*
        The "this" reference is used in a constructor to differentiate between the parameters and data in the object
         */
    }

    public void usingStaticFields() {
        /*
        Nonstatic fields are copied for each instance of the class
        If you create 50 instances, you get 50 different variables
        Static fields are share between all instances
        If you create 50 instances you will get one variable shared by all instances

        e.g., For the weapon class:
        Each weapon will have its own damage
        But you may wish to increase all damages, for example
        You would use a static method to increase this for all instances of weapon
         */
    }

    public void builtInClasses(){
        /*
        e.g.,
        java.lang - implicitly imported into every program - contains fundamental classes
        java.lang.Math - Math.PI or Math.Pow() for example
        java.util - e.g., Scanner
         */
    }

    public void composition() {
        /*
        Composition is when one class is a data field of another class
        This object needs to have its values set up like any other class
        In composition there is a "has a" relationship

        --- Nested classes ---
        A class containing another class
        Static member classes have access to all static methods of the top-level class
        Nonstatic methods of the inner class require an instance and have access to all data and methods of the top-level acalass
        Local classes are local to a block
         */
    }
}
