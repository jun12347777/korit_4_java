package ch22_exception;

public class Exception1 {
    public static void main(String[] args) {
        // 배열 인덱스 예외
        int[] numbers = {1,2,3};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);      // 예외 중 가장 상위 예외 클래스가 Exception
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
