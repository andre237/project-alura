package design_patterns_2.flyweight.project_1;

import org.jfugue.player.Player;

import java.util.List;

public class Piano implements MusicalInstrument {

    @Override
    public void play(List<MusicalNote> musicalNotes) {
        StringBuilder builder = new StringBuilder();
        musicalNotes.forEach(note -> builder.append(note.symbol()).append(" "));
        new Player().play(builder.toString());
    }
}
