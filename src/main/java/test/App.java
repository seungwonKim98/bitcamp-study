package test;

import java.lang.reflect.Member;

public class App {

  public static void main(String[] args) {

    Member m = new Member();
    m.name = "";
    m.age = ;
    m.working = ;

    printMember(m);

    Member[] arr;

    arr = new Member[3];

    arr[0] = new Member();
    arr[1] = new Member();
    arr[2] = new Member();


    arr[0].name = "홍길동";
    arr[0].age = 20;
    arr[0].working = false;

    printMember(arr[0]);
  }
}
