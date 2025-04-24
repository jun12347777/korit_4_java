package ch09_classes;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        // 객체 생성
        ClassA classA1 = new ClassA();
        ClassA classA2 = new ClassA();
        // 이상에서 볼 수 있듯이
        // 여태까지 Scanner 클래스를 import
        // 한다고 했지만
        // Scanner 클래스의 인스턴스를 생성하였다.

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();

        // 객체의 속성 접근 방법
        // 객체명.속성명
//        classA1.num = 100;
//        classA1.name = "김서준";
//
//        classA2.num = 200;
//        classA2.name = "김일";
//
//        System.out.println(classA2.name + "의 번호는" + classA2.num + "입니다.");
//
//        // classA2 객체를 생성하고,
//        // num에 200;
//        // name 김이를 대입한 후
//        // sout을 적용해
//        // 김이의 번호는 200번입니다. 를 출력하시오
//        classA1.callname();
//        classA2.callname();
        // 이상의 두 method 호출 결과는
        // 서로 '다르다'고 말해야 합니다.

        /*
            Scanner의 인스턴스를 생성하고
            ClassA의 인스턴스인 classA3를 생성한 다음,
            다음과 같이 실행될 수 있도록 작성하시오.

            이름을 입력하세요 >>> 김삼
            번호를 입력하세요 >>> 20250003
            점수를 입력하세요 >>> 4.5       -> Field 정의 필요

            그리고 call1()유형으로
            displayProfile()을 ClassA에 정의한 후
            classA3.displayProfile()을 호출했을 때
             [ 실행 결과 ]
            20250003 학번의 학생의 이름은 김삼이고, 4.5점입니다.
            출력되도록 작성
         */
        ClassA classA3 = new ClassA();
        classA3.displayProfile();

        Scanner scanner = new Scanner(System.in);

        // 2번째
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요 >>>");
//        classA3.name = scanner.nextLine();
//        System.out.print("번호를 입력하세요 >>>");
//        classA3.num = scanner.nextInt();
//        System.out.print("점수를 입력하세요 >>>");
//        classA3.score = scanner.nextDouble();
//
//        classA3.displayProfile();


    }
}
