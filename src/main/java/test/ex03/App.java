package test.ex03;

public class App {
  public static void main(String[] args) {
    // 2 * 3 + 7 - 2 = 11

    Calculator.result = 0;
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.plus(7);
    Calculator.minus(2);

    System.out.println(Calculator.result);
  }

}
