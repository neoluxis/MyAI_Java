import java.util.Random;
import java.util.Scanner;
import java.util.regex.*;

public class ChinaGPT {

  public String username;
  public String sessionId;
  Scanner sc = new Scanner(System.in, "gbk");

  /**
   * Constructor
   */
  public ChinaGPT() {
    this("User", "New Chat");
  }

  /**
   * Constructor
   * @param username
   * @param sessionId
   */
  public ChinaGPT(String username, String sessionId) {
    this.sessionId = sessionId;
    this.username = username;
    welcome();
    greeting();
  }

  /**
   * Welcome the user
   */
  public void welcome() {
    System.out.println("Welcome to ChinaGPT");
  }

  /**
   * Get question
   *
   * @return the question
   */
  public String getQues() {
    System.out.print("\n" + username + ": ");
    String ques = sc.nextLine();
    return ques;
  }

  /**
   *
   * @param ques question
   * @return answer to the question
   */
  public String getAnswer(String ques) {
    String answer = "";
    int quesType = getQuesType(ques);
    switch (quesType) {
      case 0:
        answer = "Temporarily unable to answer this question.";
        break;
      case 1:
      case 3:
        answer = AnsQues.answerQuestion(ques);
        break;
      case 2:
      case 4:
        answer = Code.getCode(ques);
        break;
      case 5:
        answer = Greeting.greeting(this);
        break;
      default:
        answer = "Temporarily unable to answer this question.";
        break;
    }
    return answer;
  }

  /**
   * Greeting
   */
  public void greeting() {
    System.out.println(
      sessionId + ": 你好，我是" + sessionId + "，你可以问我问题，我会回答。"
    );
  }

  /**
   * Say goodbye
   */
  public void bye() {
    System.out.println(sessionId + ": 再见。");
    sc.close();
  }

  /**
   *
   * @param ques
   * @return 1: do/can/could/will/Will/Can/Could/Do you ...
   * @return 2: write/code/to ...
   * @return 3: 你/吗 ...
   * @return 4: 写/代码 ...
   * @return 5: greeting
   * @return 0: other unknown type
   */
  public int getQuesType(String ques) {
    int ret = 0;
    Pattern pattern = Pattern.compile(
      ".*\\bdo\\b.*|.*\\bcan\\b.*|.*\\bcould\\b.*|.*\\bwill\\b.*|.*\\bWill\\b.*|.*\\bCan\\b.*|.*\\bCould\\b.*|.*\\bDo\\b.*|.*\\byou\\b.*"
    );
    Matcher matcher = pattern.matcher(ques);
    if (matcher.matches()) {
      ret = 1;
    }
    pattern = Pattern.compile(".*\\bwrite\\b.*|.*\\bcode\\b.*|.*\\bto\\b.*");
    matcher = pattern.matcher(ques);
    if (matcher.matches()) {
      ret = 2;
    }
    pattern = Pattern.compile(".*\\b你\\b.*|.*\\b吗\\b.*");
    matcher = pattern.matcher(ques);
    if (matcher.matches()) {
      ret = 3;
    }
    pattern = Pattern.compile(".*\\b写\\b.*|.*\\b代码\\b.*");
    matcher = pattern.matcher(ques);
    if (matcher.matches()) {
      ret = 4;
    }
    pattern =
      Pattern.compile(
        ".*\\b你好\\b.*|.*\\b您好\\b.*|.*\\bhello\\b.*|.*\\bHello\\b.*|.*\\bhi\\b.*|.*\\bHi\\b.*"
      );
    matcher = pattern.matcher(ques);
    if (matcher.matches()) {
      ret = 5;
    }
    return ret;
  }

  /**
   * Answer the question
   * @param answer
   */
  public void answerQues(String answer) {
    Random random = new Random();
    char ans[] = answer.toCharArray();
    int len = ans.length;
    System.out.print(sessionId + ": ");
    for (int i = 0; i < len; i++) {
      System.out.print(ans[i]);
      if (random.nextInt(1000) > 950) {
        try {
          Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
          System.out.println("Error occured...");
          break;
        }
      }
      try {
        Thread.sleep(random.nextInt(200));
      } catch (InterruptedException e) {
        System.out.println("Error occured...");
        break;
      }
    }
  }
}
