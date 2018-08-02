package design_patterns_2.memento;

public enum Types implements ContractType {

    NEW {
        @Override
        public void advance(Contract contract) {
            contract.type = ONGOING;
        }
    },
    ONGOING {
        @Override
        public void advance(Contract contract) {
            contract.type = RESOLVED;
        }
    },
    RESOLVED {
        @Override
        public void advance(Contract contract) {
            contract.type = CONCLUDED;
        }
    },
    CONCLUDED {
        @Override
        public void advance(Contract contract) {
            throw new RuntimeException("Contract already concluded. Unable to change state now");
        }
    }
}
