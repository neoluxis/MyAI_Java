import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 设置编码格式为gbk，防止中文乱码
    Scanner scanner = new Scanner(System.in, "gbk");
    // 获取用户输入的名字和会话id
    System.out.print("Please enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Please enter your session id: ");
    String session = scanner.nextLine();
    // 初始化ChinaGPT
    ChinaGPT chinaGPT = new ChinaGPT(name.equals("")?"User":name, session.equals("")?"New Chat":session);

    // 会话循环
    while (true) {
      // 获取用户输入的问题
      String ques = chinaGPT.getQues();
      // 如果用户输入的是结束语，则结束会话
      if (
        ques.equals("bye") ||
        ques.equals("Bye") ||
        ques.equals("goodbye") ||
        ques.equals("Goodbye")
      ) {
        // 结束会话
        chinaGPT.bye();
        scanner.close();
        break;
      }
      // 获取回答
      String answer = chinaGPT.getAnswer(ques);
      // 输出回答
      chinaGPT.answerQues(answer);
    }
  }
}
