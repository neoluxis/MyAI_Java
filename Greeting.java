public class Greeting {

  public static void greeting() {
    System.out.println("Hello, I'm ChinaGPT.");
  }

  public static String greeting(ChinaGPT c) {
    return ("Hello, I'm ChinaGPT, session id: " + c.sessionId);
  }
}
