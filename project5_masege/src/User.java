public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Пользователь " + name + ": Получено уведомление о событии - " + event);
    }
}
