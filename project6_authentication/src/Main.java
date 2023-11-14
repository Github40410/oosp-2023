public class Main {
    public static void main(String[] arg){
        Authentication passwordAuth = new PasswordAuthentication();
        Authentication fingerprintAuth = new FingerprintAuthentication();
        Authentication oAuthAuth = new OAuthAuthentication();

        System.out.println("Аутентификация по паролю:");
        boolean passwordSuccess = passwordAuth.authenticate();
        if (passwordSuccess) {
            System.out.println("Успешная аутентификация по паролю.");
        } else {
            System.out.println("Неуспешная аутентификация по паролю.");
        }

        System.out.println("\nАутентификация по отпечатку пальца:");
        boolean fingerprintSuccess = fingerprintAuth.authenticate();
        if (fingerprintSuccess) {
            System.out.println("Успешная аутентификация по отпечатку пальца.");
        } else {
            System.out.println("Неуспешная аутентификация по отпечатку пальца.");
        }

        System.out.println("\nАутентификация через OAuth:");
        boolean oAuthSuccess = oAuthAuth.authenticate();
        if (oAuthSuccess) {
            System.out.println("Успешная аутентификация через OAuth.");
        } else {
            System.out.println("Неуспешная аутентификация через OAuth.");
        }
    }

}
