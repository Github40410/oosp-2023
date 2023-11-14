public class OAuthAuthentication extends Authentication{
    @Override
    protected boolean validateCredentials() {
        System.out.println("Проверка учетных данных через OAuth...");
        return false;
    }

    @Override
    protected boolean authorize() {
        System.out.println("Авторизация пользователя через OAuth...");
        return false;
    }
}
