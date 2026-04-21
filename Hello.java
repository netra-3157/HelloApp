public class Hello{
   public static void main(String[] args) {

        // Default name if no arguments are provided
        String names = "World";

        // If user provides names, join them with comma and space
        if (args.length > 0) {
            names = String.join(", ", args);
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
        
    }
}








