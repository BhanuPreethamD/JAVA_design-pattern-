package Behavioral.Memento;

public class TextEditorMemento {
    private String state;

    public TextEditorMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
