import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in, "gbk");
    System.out.print("Please enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Please enter your session id: ");
    String session = scanner.nextLine();
    ChinaGPT chinaGPT = new ChinaGPT(name.equals("")?"User":name, session.equals("")?"New Chat":session);

    while (true) {
      String ques = chinaGPT.getQues();
      if (
        ques.equals("bye") ||
        ques.equals("Bye") ||
        ques.equals("goodbye") ||
        ques.equals("Goodbye")
      ) {
        chinaGPT.bye();
        scanner.close();
        break;
      }
      String answer = chinaGPT.getAnswer(ques);
      chinaGPT.answerQues(answer);
    }
  }
}
