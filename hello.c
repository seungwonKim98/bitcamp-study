#include <stdio.h>

int puls(int a, int b){
	return a + b;
}

void print(int a){
	printf("==> %d\n", a);
}

// C 언어는 void print (int a)와 같이 메쏘드 이름이 같은 함수를 만들 수 없다. 컴파일시 오류가 발생한다.(오버라이딩)
// 그래서 아래

/*
void print(float f){
	printf(""==> %f\n", f)
}
 	 와 같이 적으면 오류가 발생하니 메소드 이름을 변경해주어야 한다.

 	 타입이 다른 메소드라도 C언어는 파라미터 명이 같으면 실행을 불가능하게 한다. ( 오버라이딩 )

*/

void print2(float f){
	printf(""==> %f\n", f)
}

int main(int argc, char* argv[]) {
    printf("Hello!\n");

    int result = plus(100, 200);
    printf("%d\n, result");

    print(100);

    print2(3.14f);
}
