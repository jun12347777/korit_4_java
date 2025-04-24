package ch07_loops;
/*
    몇 줄의 별을 찍겠습니까? >>> 3
    ***
    **
    *
 */

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 줄의 별찍기를 실행하시겠습니까? >>>");
        int row = scanner.nextInt();

        for (int i = 0; i < row+1; i++) {
            for (int j = row; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
