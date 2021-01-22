package test.ex02;

public class App3 {
  public static void main(String[] args) {

    MyClass v1 =new MyClass();

    MyClass v2 = v1;

    v2.b = 222;

    System.out.println(v1.b);
  }
}
