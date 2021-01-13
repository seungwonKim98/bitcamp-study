#include <stdio.h>

int puls(int a, int b){
	return a + b;
}

void print(int a){
	printf("==> %d\n", a);
}


void print(float f){
	printf(""==> %f\n", f)
}

// 파라미터 명이 같더라도 다른 일을 한다면 추가적으로 같은 파라미터 명의 메소드를 추가 할 수있다. (오버로딩)

int main(int argc, char* argv[]) {
    printf("Hello!\n");

    int result = plus(100, 200);
    printf("%d\n, result");

    print(100);

    print(3.14f);
}
