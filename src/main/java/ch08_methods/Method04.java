package ch08_methods;


/*
    bmi 계산기 method를 정의하고 실행
    메서드명 : calculateBmi()
    return type : void
    매개변수 유무 : 없음
 */

import java.util.Scanner;

public class Method04 {

    public static void calculateBmi(){
        double cm = 0;
        double kg = 0;
        double BMI = 0;
        String grade = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("키(cm)를 입력하세요 >>>");
        cm = scanner.nextDouble()/100;
        System.out.print("몸무게(kg)를 입력하세요 >>>");
        kg = scanner.nextDouble();
        BMI = kg / (cm * cm);
        if (BMI >= 25) {
            grade = "비만";
        } else if (25 > BMI || BMI <= 23) {
            grade = "과체중";
            
        } else if (23 > BMI || BMI <= 18) {
            grade = "정상";
            
        } else {
            grade = "저체중";
        }
        System.out.println("당신의 BMI 지수는 " + BMI + "이고,"+ grade + "입니다.");

    }

    public static void main(String[] args) {

        calculateBmi();
    /*
        실행 예
        키(cm)를 입력하세요 >>> 172.5
        몸무게(kg)를 입력하세요 >>> 68.7
        당신의 BMI 지수는 23.08이고, 과체중입니다.
     */
    }
}
