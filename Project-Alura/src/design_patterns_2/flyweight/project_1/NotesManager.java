package design_patterns_2.flyweight.project_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotesManager {

    private static Map<String, MusicalNote> notesMap = new HashMap<>();
    private static List<Notes> notes;

    static {
        notes = Arrays.asList(Notes.values());
    }

    public MusicalNote getNote(String name) {
        if (!notesMap.containsKey(name)) {
            for (Notes notes : notes) {
                if (notes.name().equalsIgnoreCase(name)) {
                    notesMap.put(name, notes);
                    break;
                }
            }
        }
        return notesMap.get(name);
    }

}
