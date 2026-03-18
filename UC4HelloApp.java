// HelloArgs.java
public class UC4HelloApp {

    public static void main(String[] args) {
        // If no arguments are provided, print default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Build a greeting with all arguments
            StringBuilder greeting = new StringBuilder("Hello");
            for (String arg : args) {
                // Trim spaces and skip empty arguments
                if (arg != null && !arg.trim().isEmpty()) {
                    greeting.append(" ").append(arg.trim());
                }
            }
            // If all arguments were empty, fallback to default
            if (greeting.toString().equals("Hello")) {
                System.out.println("Hello, World!");
            } else {
                System.out.println(greeting);
            }
        }
    }
}
