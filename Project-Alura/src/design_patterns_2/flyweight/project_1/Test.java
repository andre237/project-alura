package design_patterns_2.flyweight.project_1;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        NotesManager manager = new NotesManager();
        List<MusicalNote> notes = Arrays.asList(
                manager.getNote("do"),
                manager.getNote("re"),
                manager.getNote("mi"),
                manager.getNote("fa"),
                manager.getNote("fa"),
                manager.getNote("fa"),
                manager.getNote("do"),
                manager.getNote("re"),
                manager.getNote("do"),
                manager.getNote("re"),
                manager.getNote("re"),
                manager.getNote("re"),
                manager.getNote("do"),
                manager.getNote("sol"),
                manager.getNote("fa"),
                manager.getNote("mi"),
                manager.getNote("mi"),
                manager.getNote("mi"),
                manager.getNote("do"),
                manager.getNote("re"),
                manager.getNote("mi"),
                manager.getNote("fa"),
                manager.getNote("fa"),
                manager.getNote("fa")
        );

        Piano piano = new Piano();
        piano.play(notes);

        /*Player player = new Player();
        player.play("C/0.25 D/0.25 E/0.25 F/0.35 F/0.125 F/0.25 C/0.25 D/0.25 C/0.25 D/0.35 D/0.125 " +
                "D/0.25 C/0.25 G/0.25 F/0.25 E/0.35 E/0.125 E/0.25 C/0.25 D/0.25 E/0.25 F/0.35 F/0.125 F/0.35");*/
    }

}
