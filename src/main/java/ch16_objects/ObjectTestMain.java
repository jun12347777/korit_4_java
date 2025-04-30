package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        // 객체 생성
        ObjectTest objectTest1 = new ObjectTest("김서준", "부산 부산진구");
        objectTest1.displayInfo();
        System.out.println();
        System.out.println(objectTest1);    // 클래스명.패키지명.골뱅이.주소
        Teacher teacher1 = new Teacher("김교사", "코리아아이티학교");
        System.out.println(teacher1);
    }
}
