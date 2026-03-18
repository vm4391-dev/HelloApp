public class  UC2HelloApp {
    public static void main(String[] args) {
        // UC2: Check if an argument was provided to prevent errors
        if (args.length > 0) {
            // Get the name from command-line argument
            String name = args[0];
            // Display personalized greeting
            System.out.println("Hello, " + name + "!");
        } else {
            // Default value if no argument is provided
            System.out.println("Hello, World!");
        }
    }
}