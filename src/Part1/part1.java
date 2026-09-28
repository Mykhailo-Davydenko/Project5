package Part1;

public class part1 {
    public static void main(String[] args) {

        //  Methods with different arguments

        hello();

        helloname("Misha");

        nameage("Misha", 17);


        // Part 1.3. Different return types

        int sum = addNumbers(10, 5);
        System.out.println("sum is " + sum);

        double division = divideNumbers(10.0, 4.0);
        System.out.println("division result is: " + division);

        String greeting = Greeting("Misha");
        System.out.println("String result: " + greeting);

        boolean adult = isAdult(20);
        System.out.println("Boolean result: " + adult);


        // Part 2. Decomposition and sub-method calls

        startProgram();
    }


    //  Method with zero arguments
    public static void hello() {
        System.out.println("Hello!");
    }


    //  Method with one String argument
    public static void helloname(String name) {
        System.out.println("Hello, " + name);
    }


    //  Method with two arguments of different types
    public static void nameage(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    //  Method returning int
    public static int addNumbers(int a, int b) {
        return a + b;
    }


    //  Method returning double
    public static double divideNumbers(double a, double b) {
        return a / b;
    }


    // . Method returning String
    public static String Greeting(String name) {
        return "Nice to meet you, " + name;
    }


    // Part 1.3. Method returning boolean
    public static boolean isAdult(int age) {
        return age >= 18;
    }


    // Part 2. Decomposition example
    public static void startProgram() {

        printHeader();

        int result = calculateSum(5, 10);

        printResult(result);
    }


    // Sub-method
    public static void printHeader() {
        System.out.println("Decomposition Example");
    }


    // Sub-method
    public static int calculateSum(int a, int b) {
        return a + b;
    }


    // Sub-method
    public static void printResult(int result) {
        System.out.println("The result is: " + result);
    }
}
