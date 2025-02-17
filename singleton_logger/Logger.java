import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
  private static Logger instance;
  private static final String LOG_FILE = "log.txt";
  private PrintWriter writer;

  private Logger() {
    try {
      writer = new PrintWriter(new FileWriter(LOG_FILE, true));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static Logger getInstance() {
    if (instance == null) {
      synchronized (Logger.class) {
        if (instance == null) {
          instance = new Logger();
        }
      }
    }
    return instance;
  }

  public void log(String message) {
    writer.println("[LOG] " + message);
    writer.flush();
  }

  public void close() {
    if (writer != null) {
      writer.close();
    }
  }
}