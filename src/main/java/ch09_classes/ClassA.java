package ch09_classes;

import java.util.Scanner;

public class ClassA {
//    int num;
//    String name;

    public void callname() {
//        System.out.println(name + "을 부릅니다.");
    }
    public void displayProfile() {
        String name;
        int call;
        double score;
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>>");
        name = scanner.nextLine();
        System.out.print("번호를 입력하세요 >>>");
        call = scanner.nextInt();
        System.out.print("점수를 입력하세요 >>>");
        score = scanner.nextDouble();
        System.out.println("[ 실행 결과 ]");
        System.out.println(call + "학번의 학생의 이름은" + name + "이고," + score + "입니다. ");

        // 2번째
        //System.out.println("[ 실행 결과 ]");
        //        System.out.println(call + "학번의 학생의 이름은" + name + "이고," + score + "입니다. ");
    }
}
