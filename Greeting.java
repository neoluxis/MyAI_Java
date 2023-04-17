public class Greeting {

  // 自我介绍
  public static void greeting() {
    System.out.println("Hello, I'm ChinaGPT.");
  }

  // 会话id
  public static String greeting(ChinaGPT c) {
    return ("Hello, I'm ChinaGPT, session id: " + c.sessionId);
  }
}
