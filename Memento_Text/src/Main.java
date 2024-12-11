public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setContent("Versione 1");
        caretaker.saveState(editor);
        System.out.println("Stato salvato: " + editor.getContent());

        editor.setContent("Versione 2");
        caretaker.saveState(editor);
        System.out.println("Stato salvato: " + editor.getContent());

        editor.setContent("Versione 3");
        System.out.println("Stato attuale: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("Ripristinato: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("Ripristinato: " + editor.getContent());
    }
}