import java.util.Stack;

public class TextEditor {
    private StringBuilder tex;
    private Stack<Text> texts;

    public TextEditor(){
        this.tex = new StringBuilder();
        this.texts = new Stack<>();
    }

    public void appText(String text){
        this.tex.append(text);
    }

    public String getText(){
        return tex.toString();
    }

    public void saveSnapshot(){
        Text text = new Text(tex.toString());
        texts.push(text);
    }

    public void restoreSnapshot() {
        if (!texts.isEmpty()) {
            Text text = texts.pop();
            tex = new StringBuilder(text.getText());
        }
    }

}
