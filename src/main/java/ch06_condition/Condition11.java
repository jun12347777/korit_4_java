package ch06_condition;
/*
    switch 문
    형식 :
    switch(변수명)
        case 조건1:
           실행문1:
            break;
        case 조건2:
           실행문1:
            break;
        case 조건3:
           실행문1:
            break;
        case 조건4:
           실행문1:
            break;
          default:
            실행문5;
 */

import java.util.Scanner;

public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selectNum;
        String selectedChar = "";
        System.out.println(" [메뉴 선택]");
        System.out.println("1. 1번메뉴");
        System.out.println("2. 2번메뉴");
        System.out.println("3. 3번메뉴");
        System.out.println("4. 4번메뉴");
        System.out.println("5. 5번메뉴");
        System.out.print("메뉴를 선택하세요 >>>");
        selectNum = scanner.nextInt();
        selectedChar = scanner.nextLine();

        // if문으로 메뉴를 선택한다고 가정했을 경우
//        if (selectNum < 1 || selectNum > 5){
//            System.out.println("불가능한 메뉴 번호입니다.");
//        } else {
//            if (selectNum == 1) {
//                System.out.println("메뉴 1을 선택하셨습니다.");
//            } else if (selectNum == 2) {
//                System.out.println("메뉴 2를 선택하셨습니다. ");
//            }
            // ... else {sout("메뉴5를선택하셨습니다.");}

//        switch (selectedChar){
//            case "a" :
//                System.out.println("메뉴1을 선택하셨습니다.");
//                break;                                      // 조건문을 탈출한다는 의미
//            case "b" :
//                System.out.println("메뉴2을 선택하셨습니다.");
//                break;
//            case "c" :
//                System.out.println("메뉴3을 선택하셨습니다.");
//                break;
//            case "d" :
//                System.out.println("메뉴4을 선택하셨습니다.");
//                break;
//            case "e" :
//                System.out.println("메뉴5을 선택하셨습니다.");
//                break;
//            default:                                        // selectNum이 case에 속하지 않을 때 실행됨
//                System.out.println("잘못 선택하셨습니다. ");

        switch (selectNum)

    {
        case 1:
            System.out.println("메뉴1을 선택하셨습니다.");
            break;                                      // 조건문을 탈출한다는 의미
        case 2:
            System.out.println("메뉴2을 선택하셨습니다.");
            break;
        case 3:
            System.out.println("메뉴3을 선택하셨습니다.");
            break;
        case 4:
            System.out.println("메뉴4을 선택하셨습니다.");
            break;
        case 5:
            System.out.println("메뉴5을 선택하셨습니다.");
            break;
        default:                                        // selectNum이 case에 속하지 않을 때 실행됨
            System.out.println("잘못 선택하셨습니다. ");
    }

    }
}
