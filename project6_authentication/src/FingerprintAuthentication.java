public class FingerprintAuthentication extends Authentication{
    @Override
    protected boolean validateCredentials() {
        System.out.println("Проверка учетных данных по отпечатку пальца...");
        return false;
    }

    @Override
    protected boolean authorize() {
        System.out.println("Авторизация пользователя по отпечатку пальца...");
        return false;
    }
}
