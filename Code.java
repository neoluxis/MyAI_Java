public class Code {

  // 代码
  // Java Helloworld
  public static String code_helloworld_java =
    "\npublic class HelloWorld {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(\"Hello World!\");\n\t}\n}";
  // Python Helloworld
  public static String code_helloworld_python = "print(\"Hello World!\")";
  // C Helloworld
  public static String code_helloworld_c =
    "\n#include <stdio.h>\nint main() {\n\tprintf(\"Hello World!\");\n\treturn 0;\n}";
  // C++ Helloworld
  public static String code_helloworld_cpp =
    "\n#include <iostream>\nusing namespace std;\nint main() {\n\tcout << \"Hello World!\";\n\treturn 0;\n}";
  // C# Helloworld
  public static String code_helloworld_csharp =
    "\nusing System;\nnamespace HelloWorld {\n\tclass Hello {\n\t\tstatic void Main(string[] args) {\n\t\t\tConsole.WriteLine(\"Hello World!\");\n\t\t\tConsole.ReadKey();\n\t\t}\n\t}\n}";
  // Assembly Helloworld
  public static String code_helloworld_asm =
    "\nsection .text\n\tglobal _start\n_start:\n\tmov eax, 4\n\tmov ebx, 1\n\tmov ecx, msg\n\tmov edx, msg.len\n\tsyscall\n\tmov eax, 1\n\tmov ebx, 0\n\tsyscall\nsection .data\nmsg db \"Hello World!\", 10\nmsg.len equ $ - msg";
  // Java Add
  public static String code_add_java =
    "\npublic class Add {\n\tpublic static void main(String[] args) {\n\t\tint a = 1;\n\t\tint b = 2;\n\t\tSystem.out.println(a + b);\n\t}\n}";
  // Python Add
  public static String code_add_python = "a = 1\nb = 2\nprint(a + b)";
  // Java Window
  public static String code_window_java =
    "\nimport javax.swing.*;\npublic class Window {\n\tpublic static void main(String[] args) {\n\t\tJFrame frame = new JFrame(\"Hello World!\");\n\t\tJLabel label = new JLabel(\"Hello World!\");\n\t\tframe.add(label);\n\t\tframe.setSize(300, 300);\n\t\tframe.setVisible(true);\n\t}\n}";
  // Python Window
  public static String code_window_python =
    "\nfrom tkinter import *\nroot = Tk()\nroot.title(\"Hello World!\")\nroot.geometry(\"300x300\")\nlabel = Label(root, text=\"Hello World!\")\nlabel.pack()\nroot.mainloop()";
  // Java Complex
  public static String code_complex_java =
    """
        \npublic class Complex {
  
              double real;
              double imag;
            
              public Complex(double real, double imag) {
                this.real = real;
                this.imag = imag;
              }
            
              @Override
              public String toString() {
                if (real == 0 || imag == 0) {
                  return "0";
                } else if (real == 0) {
                  return imag + "i";
                } else if (imag == 0) {
                  return real + "";
                } else if (imag > 0) {
                  return real + "+" + imag + "i";
                } else {
                  return real + "" + imag + "i";
                }
              }
            }
            
            class ComplexCalc {
            
              public static Complex add(Complex a, Complex b) {
                return new Complex(a.real + b.real, a.imag + b.imag);
              }
            
              public static Complex subtract(Complex a, Complex b) {
                return new Complex(a.real - b.real, a.imag - b.imag);
              }
            
              public static Complex multiply(Complex a, Complex b) {
                return new Complex(
                  a.real * b.real - a.imag * b.imag,
                  a.real * b.imag + a.imag * b.real
                );
              }
            
              public static Complex divide(Complex a, Complex b) {
                double denominator = b.real * b.real + b.imag * b.imag;
                return new Complex(
                  (a.real * b.real + a.imag * b.imag) / denominator,
                  (a.imag * b.real - a.real * b.imag) / denominator
                );
              }
            
              public static void main(String[] args) {
                Complex a = new Complex(1, 3);
                Complex b = new Complex(2, 5);
                System.out.println(ComplexCalc.add(a, b));
                System.out.println(ComplexCalc.subtract(a, b));
                System.out.println(ComplexCalc.multiply(a, b));
                System.out.println(ComplexCalc.divide(a, b));
                System.out.println(\"--------------------try again---------------------\");
                Complex c = new Complex(1, 3);
                Complex d = new Complex(0, 3);
                System.out.println(ComplexCalc.add(c, d));
                System.out.println(ComplexCalc.subtract(c, d));
                System.out.println(ComplexCalc.multiply(c, d));
                System.out.println(ComplexCalc.divide(c, d));
              }
            }
            
              """;

  /**
   *
   * @param ques
   * @return code
   * use regex to match the question and return the code
   */
  public static String getCode(String ques) {
    if (ques.contains("helloworld") || ques.contains("HelloWorld")) {
      if (ques.contains("java") || ques.contains("Java")) {
        return code_helloworld_java;
      } else if (ques.contains("python") || ques.contains("Python")) {
        return code_helloworld_python;
      } else if (ques.contains(" c") || ques.contains(" C")) {
        return code_helloworld_c;
      } else if (ques.contains("c++") || ques.contains("C++")) {
        return code_helloworld_cpp;
      } else if (ques.contains("c#") || ques.contains("C#")) {
        return code_helloworld_csharp;
      } else if (ques.contains("asm") || ques.contains("Asm")) {
        return code_helloworld_asm;
      } else {
        return "Error: I haven't learn this language yet.";
      }
    } // Hello World End
    else if (ques.contains("add") || ques.contains("Add")) {
      if (ques.contains("java") || ques.contains("Java")) {
        return code_add_java;
      } else if (ques.contains("python") || ques.contains("Python")) {
        return code_add_python;
      } else {
        return "Error: I haven't learn this language yet.";
      }
    }  // Add End
    else if (ques.contains("window") || ques.contains("Window")) {
      if (ques.contains("java") || ques.contains("Java")) {
        return code_window_java;
      } else if (ques.contains("python") || ques.contains("Python")) {
        return code_window_python;
      } else {
        return "Error: I haven't learn this language yet.";
      }
    } // Window End 
    else if (ques.contains("complex") || ques.contains("Complex")) {
      if (ques.contains("java") || ques.contains("Java")) {
        return code_complex_java;
      } else {
        return "Error: I haven't learn this language yet.";
      }
    } // Complex End 
    else {
      return "Error: I haven't learn this question yet.";
    } // Error End， if the question is not in the list
  }
}
