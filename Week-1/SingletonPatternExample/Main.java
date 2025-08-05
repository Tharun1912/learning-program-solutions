package SingletonPatternExample;

//File: Main.java
public class Main {
 public static void main(String[] args) {
     // Get the Logger instance
     Logger logger1 = Logger.getInstance();
     logger1.log("First message");

     // Try getting another Logger instance
     Logger logger2 = Logger.getInstance();
     logger2.log("Second message");

     // Check if both references are the same
     if (logger1 == logger2) {
         System.out.println("Only one instance of Logger is used.");
     } else {
         System.out.println("Different Logger instances were created.");
     }
 }
}
