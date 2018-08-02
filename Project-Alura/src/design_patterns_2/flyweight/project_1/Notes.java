package design_patterns_2.flyweight.project_1;

public enum Notes implements MusicalNote {

    DO {
        @Override
        public String symbol() {
            return "C";
        }
    },
    RE {
        @Override
        public String symbol() {
            return "D";
        }
    },
    MI {
        @Override
        public String symbol() {
            return "E";
        }
    },
    FA {
        @Override
        public String symbol() {
            return "F";
        }
    },
    SOL {
        @Override
        public String symbol() {
            return "G";
        }
    },
    LA {
        @Override
        public String symbol() {
            return "A";
        }
    },
    SI {
        @Override
        public String symbol() {
            return "B";
        }
    }
}
