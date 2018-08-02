package design_patterns_2.flyweight.project_2;

import org.jfugue.player.Player;

import java.util.List;

public class Piano {

    public void play(List<MusicalNote> notes) {

        StringBuilder builder = new StringBuilder();
        notes.forEach(note -> builder.append(note.symbol()).append(note.getMusicalBreak().time()).append(" "));

        Player player = new Player();
        player.play(builder.toString());

    }

}
