import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private final List<TextEditorMemento> history= new ArrayList<TextEditorMemento>();

    public void saveState(TextEditor editor){
        history.add(editor.save());
    }

    public void undo(TextEditor editor){
        if(!history.isEmpty()){
            TextEditorMemento last = history.removeLast();
            editor.restore(last);
        }
    }

}