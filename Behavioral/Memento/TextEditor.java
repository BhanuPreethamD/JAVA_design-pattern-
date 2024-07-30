package Behavioral.Memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(text);
    }

    public void restore(TextEditorMemento memento) {
        text = memento.getState();
    }

    @Override
    public String toString() {
        return "TextEditor [text=" + text + "]";
    }
}
