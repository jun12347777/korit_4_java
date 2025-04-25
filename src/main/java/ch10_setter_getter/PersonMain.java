package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("김일");
        person1.setAge(243);
        person1.setAge(21);//필드 선언

        // 객체 하나 더 생성
        Person person2 = new Person("이이" , 32);
        // 여기서 이이 라는 사람의 이름을 강이로 바꾸고 싶다면 두 가지 방법이 있죠
        // # 1 객체명.속성명
//        person2.name = "강이";  //Person.java에 private 적용하면 오류발생
        // # 2 setName()을 이용하는 방법
        person2.setName("최이");
        person2.setName("준이");

        // 콘솔창에 person2의 name 출력하는 방법도 두 가지입니다.
        // # 1.
//        System.out.println(person2.name);     //Person.java에 private 적용하면 오류발생
        // # 2. getName() -> call3()
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());

        // 정리 !! call1() / call2() 유형의 경우 return이 없는 대신에 콘솔창에 출력하기 위해서는
        // 메서드 내에 sout()을 구현할 필요가 있었습니다.
        // 이상의 경우 main 단게에서 메서드 호출을 하기만 하면 콘솔창에 결과가 출력된다는 장점이 있기는 하지만
        // '데이터의 가공'이 어렵습니다.

        // 김일 님 반갑습니다. / 최일 님 반갑습니다.
        System.out.println(person1.getName() + " 님 반갑습니다.");
        System.out.println(person2.getName() + " 님 반갑습니다.");






//        person1.name = "김일";
//        person1.age = 21;
//        Person person2 = new Person("김일");
//        person2.age = 21;
//        Person person3 = new Person(21);
//        person3.name = "김일";
//        Person person4 = new Person("김일",21);
//
//        person1.showInfo();
//        person2.showInfo();
//        person3.showInfo();
//        person4.showInfo();


    }
}
