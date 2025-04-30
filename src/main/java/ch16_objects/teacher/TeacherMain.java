package ch16_objects.teacher;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김서준", "코리아아이티");
        Teacher teacher2 = new Teacher("김서준", "코리아아이티");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);            // 결과값 : true
        boolean result2 = teacher1 == teacher2;
        System.out.println(result2);            // 결과값 : false

        /*
            .equals()의 경우에는 주소지가 아니라 속성값이 서로 일치하는지를 확인함
            == 의 경우에는 주소지까지 같은지를 확인
         */
        // 주소지를 확인하겠습니다
        System.out.println(teacher1);
        System.out.println(teacher2);

        String name = "김서준";
        boolean result3 = name.equals("김서준");
        System.out.println(result3);        // true
        boolean result4 = name == "김서준";
        System.out.println(result4);        // true

        String name2 = new String("김서준");
        boolean result5 = name.equals(name2);
        System.out.println(result5);        // true
        boolean result6 = name == name2;
        System.out.println(result6);        // false

        /*
            .equals의 결과값 =/= == 의 결과값
         */



    }
}
