package Behavioral.Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Version 1");
        history.addMemento(editor.save());

        editor.setText("Version 2");
        history.addMemento(editor.save());

        editor.setText("Version 3");

        System.out.println(editor); // TextEditor [text=Version 3]

        editor.restore(history.getMemento(1));
        System.out.println(editor); // TextEditor [text=Version 2]

        editor.restore(history.getMemento(0));
        System.out.println(editor); // TextEditor [text=Version 1]
    }
}
