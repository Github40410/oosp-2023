public class Main {
    public static void main(String[] arg){
        AppSettings appSettings = AppSettings.getInstance();

        appSettings.setNotificationsEnabled(false);
        System.out.println(appSettings.isNotificationsEnabled());

        appSettings.setTheme("Light");
        System.out.println(appSettings.getTheme());
    }
}
