package design_patterns_2.flyweight.project_2;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        NotesManager manager = new NotesManager();
        List<MusicalNote> notes = Arrays.asList(
                manager.getNote("do", Breaks.QUARTER),
                manager.getNote("re", Breaks.QUARTER),
                manager.getNote("mi", Breaks.QUARTER),
                manager.getNote("fa", Breaks.QUARTER_DOTTED),
                manager.getNote("fa", Breaks.HALF_QUARTER),
                manager.getNote("fa", Breaks.QUARTER),

                manager.getNote("do", Breaks.QUARTER),
                manager.getNote("re", Breaks.QUARTER),
                manager.getNote("do", Breaks.QUARTER),
                manager.getNote("re", Breaks.QUARTER_DOTTED),
                manager.getNote("re", Breaks.HALF_QUARTER),
                manager.getNote("re", Breaks.QUARTER),

                manager.getNote("do", Breaks.QUARTER),
                manager.getNote("sol", Breaks.QUARTER),
                manager.getNote("fa", Breaks.QUARTER),
                manager.getNote("mi", Breaks.QUARTER_DOTTED),
                manager.getNote("mi", Breaks.HALF_QUARTER),
                manager.getNote("mi", Breaks.QUARTER),

                manager.getNote("do", Breaks.QUARTER),
                manager.getNote("re", Breaks.QUARTER),
                manager.getNote("mi", Breaks.QUARTER),
                manager.getNote("fa", Breaks.QUARTER_DOTTED),
                manager.getNote("fa", Breaks.HALF_QUARTER),
                manager.getNote("fa", Breaks.QUARTER)
        );

        System.out.println("Playing music...");
        new Piano().play(notes);
    }

}
