public class Main {
    public static void main(String[] arg){
        User user1 = new User.UserBuilder("Владислав", "Индюков").setAge(20).build();
        User user2 = new User.UserBuilder("Кто-то", "Другой").setAdres("Воронеж").setMale("india@gmail.com").setAge(23).build();

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
