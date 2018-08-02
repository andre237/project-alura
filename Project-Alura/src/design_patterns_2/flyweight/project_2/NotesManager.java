package design_patterns_2.flyweight.project_2;

import design_patterns_2.flyweight.project_2.notes.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class NotesManager {

    private static Map<String, MusicalNote> notesMap = new HashMap<>();
    private static List<Class<? extends MusicalNote>> clazzes;

    static {
        clazzes = Arrays.asList(DO.class, RE.class, MI.class, FA.class, SOL.class, LA.class, SI.class);
    }

    public MusicalNote getNote(String name, MusicalBreak musicalBreak) {
        try {
             for (Class<? extends MusicalNote> clazz : clazzes) {
                 if (clazz.getSimpleName().equalsIgnoreCase(name)) {
                     notesMap.put(name, clazz.getDeclaredConstructor(MusicalBreak.class).newInstance(musicalBreak));
                     break;
                 }
             }
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return notesMap.get(name);
    }

}
