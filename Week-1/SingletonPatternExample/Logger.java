package SingletonPatternExample;

//File: Logger.java
public class Logger {
 // Step 2: Create a private static instance
 private static Logger instance;

 // Step 2: Private constructor to prevent instantiation
 private Logger() {
     System.out.println("Logger Initialized!");
 }

 // Step 3: Public static method to get the singleton instance
 public static Logger getInstance() {
     if (instance == null) {
         instance = new Logger(); // Lazy initialization
     }
     return instance;
 }

 // Utility method to log messages
 public void log(String message) {
     System.out.println("[LOG]: " + message);
 }
}
