public class Main {
    public static void main(String[] arg){
        TextEditor textEditor = new TextEditor();
        textEditor.appText("Первый текст  ");
        textEditor.saveSnapshot();

        System.out.println(textEditor.getText());

        textEditor.appText(" это будет второй текст");
        System.out.println(textEditor.getText());

        textEditor.restoreSnapshot();
        System.out.println(textEditor.getText());
    }
}
