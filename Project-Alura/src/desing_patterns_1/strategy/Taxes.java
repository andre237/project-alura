package desing_patterns_1.strategy;

public enum Taxes implements Tax {

    ICMS {
        @Override
        public double calculateTax(Budget budget) {
            return budget.getValue() * 0.25;
        }
    },
    ISS {
        @Override
        public double calculateTax(Budget budget) {
            return budget.getValue() * 0.22;
        }
    },
    IOF {
        @Override
        public double calculateTax(Budget budget) {
            return budget.getValue() * 0.08;
        }
    },
    IPTU {
        @Override
        public double calculateTax(Budget budget) {
            return budget.getValue() * 0.17;
        }
    },
    IPVA {
        @Override
        public double calculateTax(Budget budget) {
            return budget.getValue() * 0.05;
        }
    }
}
