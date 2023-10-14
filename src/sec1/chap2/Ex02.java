package sec1.chap2;

// 변수
public class Ex02 {
    public static void main(String[] args) {
        System.out.println("원주율 : " + 3.14);
        System.out.println("원의 둘레 : 지름 * " + 3.14);
        System.out.println("원의 넓이 : 반지름의 제곱 * " + 3.14);
        System.out.println("구의 부피 : 반지름의 세제곱 * 4/3 * " + 3.14);

        System.out.println("\n- - - - -\n"); // \n  : 줄바꿈

        double pi = 3.14;

        System.out.println("원주율 : " + pi);
        System.out.println("원의 둘레 : 지름 * " + pi);
        System.out.println("원의 넓이 : 반지름의 제곱 * " + pi);
        System.out.println("구의 부피 : 반지름의 세제곱 * 4/3 * " + pi);

        System.out.println("\n- - - - -\n"); // \n  : 줄바꿈

        pi = 3.14159265358979;

        System.out.println("원주율 : " + pi);
        System.out.println("원의 둘레 : 지름 * " + pi);
        System.out.println("원의 넓이 : 반지름의 제곱 * " + pi);
        System.out.println("구의 부피 : 반지름의 세제곱 * 4/3 * " + pi);

        // 자바의 변수 : 앞에 담을 데이터의 자료형을 암시
        // - (이후 배울 var 제외)
        int age; // 변수 선언 : 주머니 만들기

        // 아직 값이 없으므로 사용 할 수는 없음
//        System.out.println(age);

        age = 20;
        System.out.println(age);



    }
}
