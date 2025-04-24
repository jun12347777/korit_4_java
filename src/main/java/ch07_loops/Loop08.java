package ch07_loops;
/*
        *
       **
      ***
     ****
    *****
    이상의 별찍기를 위해서 고려해야 할 사항
    1. 개행 관련
    2. 별찍기 관련
    3. 공백 관련
 */

public class Loop08 {
    public static void main(String[] args) {

        // # 1 풀이
        // 개행 관련 1차 for문
        for (int i = 0; i < 6; i++) {
            // 공백 관련 2차 for문
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // 별 찍기 관련 2차b for문
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            // 개행 명령어
            System.out.println();
        }
        // # 2 풀이
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 -i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
