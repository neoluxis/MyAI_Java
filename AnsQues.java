public class AnsQues {

  /**
   * @param ques question
   * @return the answer to the question
   * use replace
   */
  public static String answerQuestion(String ques) {
    String ans = ques;
    ans = ans.replace("你", "我");
    ans = ans.replace("吗？", "！");
    ans = ans.replace("Can you", "I can");
    ans = ans.replace("can you", "I can");
    ans = ans.replace("Could you", "I could");
    ans = ans.replace("could you", "I could");
    ans = ans.replace("Do you", "I do");
    ans = ans.replace("do you", "I do");
    ans = ans.replace("Will you", "I will");
    ans = ans.replace("will you", "I will");
    ans = ans.replace("?", "!");
    ans = ans.replace("？", "！");
    return ans;
  }
}
