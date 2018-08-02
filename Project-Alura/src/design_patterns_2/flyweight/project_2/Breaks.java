package design_patterns_2.flyweight.project_2;

public enum Breaks implements MusicalBreak {

    WHOLE {
        @Override
        public String time() {
            return "/1";
        }
    },
    HALF {
        @Override
        public String time() {
            return "/0.5";
        }
    },
    QUARTER {
        @Override
        public String time() {
            return "/0.25";
        }
    },
    HALF_QUARTER {
        @Override
        public String time() {
            return "/0.125";
        }
    },
    HALF_DOTTED {
        @Override
        public String time() {
            return "/0.75";
        }
    },
    QUARTER_DOTTED {
        @Override
        public String time() {
            return "/0.35";
        }
    },

}
