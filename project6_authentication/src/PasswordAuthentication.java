public class PasswordAuthentication extends Authentication{
    @Override
    protected boolean validateCredentials() {
        System.out.println("Проверка учётных данных по поролю...");
        return true;
    }

    @Override
    protected boolean authorize() {
        System.out.println("Авторизация пользователя по поролю...");
        return false;
    }
}
