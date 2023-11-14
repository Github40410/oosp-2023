public class Main {
    public static void main(String[] arg){
        Calendar calendar = new Calendar();

        User user1 = new User("Василий Теркин");
        User user2 = new User("Антон Павлович Чехов");

        calendar.registerObserver(user2);
        calendar.registerObserver(user1);

        calendar.addEvent("Вылазка в тыл врага");
        calendar.addEvent("Повесить ружьё");

        calendar.removeObserver(user1);

        calendar.addEvent("Ты остался один");
    }
}
