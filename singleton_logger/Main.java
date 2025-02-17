public class Main {
  public static void main(String[] args) {
    Logger logger = Logger.getInstance();

    logger.log("Application started.");
    logger.log("Performing some operations...");
    logger = Logger.getInstance();
    logger.log("preforming some other operations...");
    logger.log("Application finished.");

    logger.close();

    System.out.println("Log written to log.txt");
  }
}
