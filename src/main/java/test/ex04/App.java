package test.ex04;

public class App {
  public static void main(String[] args) {
    // 2 * 3 + 7 - 2 = 11
    // 12 / 4 - 5 = -2

    Calculator r1 = new Calculator();
    Calculator r2 = new Calculator();

    r1.result = 0;
    r2.result = 0;

    Calculator.plus(r1, 2);
    Calculator.multiple(r1, 3);
    Calculator.plus(r1, 7);
    Calculator.minus(r1, 2);

    Calculator.plus(r2, 12);
    Calculator.divide(r2, 4);
    Calculator.minus(r2, 5);

    System.out.println(r1.result);
    System.out.println(r2.result);
  }

}
