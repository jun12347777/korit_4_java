package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setPassword(9876);
        user2.setEmail("tfwns");
        user2.setName("김서준");
        System.out.println(user2);


    }
}
