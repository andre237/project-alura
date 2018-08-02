package design_patterns_2.flyweight.project_2.notes;

import design_patterns_2.flyweight.project_2.MusicalBreak;
import design_patterns_2.flyweight.project_2.MusicalNote;

public class SI implements MusicalNote {

    private final MusicalBreak musicalBreak;

    public SI(MusicalBreak musicalBreak) {
        this.musicalBreak = musicalBreak;
    }

    @Override
    public String symbol() {
        return "B";
    }

    public MusicalBreak getMusicalBreak() {
        return musicalBreak;
    }
}
