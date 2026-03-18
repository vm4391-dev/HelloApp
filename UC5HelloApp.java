// HelloApp.java
public class UC5HelloApp {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length > 0) {
            // Enhanced for loop to iterate over arguments
            for (String arg : args) {
                System.out.println("Hello " + arg);
            }
        } else {
            // Default message if no arguments are given
            System.out.println("Hello World ");
        }
    }
}
