abstract class Authentication {
    public final boolean authenticate(){
        boolean success = false;

        displayMessage();
        if (validateCredentials()) {
            success = authorize();
        }

        return success;
    }

    private void displayMessage() {
        System.out.println("Запущен процесс аутентификации.");
    }

    protected abstract boolean validateCredentials();

    protected abstract boolean authorize();
}
