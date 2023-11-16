public class AppSettings {
    private static AppSettings appSettings;
    private String theme;
    private boolean notificationsEnabled;

    private AppSettings(){
        this.theme = "Dark";
        this.notificationsEnabled = true;
    }

    public static AppSettings getInstance() {
        if (appSettings == null) {
            synchronized (AppSettings.class) {
                if (appSettings == null) {
                    appSettings = new AppSettings();
                }
            }
        }
        return appSettings;
    }

    public String getTheme() {
        return theme;
    }

    public boolean isNotificationsEnabled(){
        return notificationsEnabled;
    }

    public void setNotificationsEnabled(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
