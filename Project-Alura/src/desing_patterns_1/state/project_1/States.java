package desing_patterns_1.state.project_1;

public enum States implements BudgetState {

    ON_APPROVAL {
        private boolean discountApplied = false;
        @Override
        public void applyExtraDiscount(Budget budget) {
            if (!discountApplied) {
                budget.value -= budget.value * 0.05;
                discountApplied = true;
            } else {
                System.out.println("Discount has already been applied!");
            }
        }

        @Override
        public void approve(Budget budget) {
            budget.setState(States.APPROVED);
        }

        @Override
        public void disapprove(Budget budget) {
            budget.setState(States.DISAPPROVED);
        }

        @Override
        public void close(Budget budget) {
            System.out.println("This budget can't be finalized directly!");
        }
    },
    APPROVED {
        private boolean discountApplied = false;
        @Override
        public void applyExtraDiscount(Budget budget) {
            if (!discountApplied) {
                budget.value -= budget.value * 0.02;
                discountApplied = true;
            } else {
                System.out.println("Discount has already been applied!");
            }
        }

        @Override
        public void approve(Budget budget) {
            System.out.println("This budget is already approved!");
        }

        @Override
        public void disapprove(Budget budget) {
            System.out.println("This budget has already been approved. Can't disapprove now!");
        }

        @Override
        public void close(Budget budget) {
            budget.setState(States.CLOSED);
        }
    },
    DISAPPROVED {
        @Override
        public void applyExtraDiscount(Budget budget) {
            // Do nothing
        }

        @Override
        public void approve(Budget budget) {
            System.out.println("This budget has been disapproved. Unable to approve it!");
        }

        @Override
        public void disapprove(Budget budget) {
            System.out.println("This budget has already been disapproved!");
        }

        @Override
        public void close(Budget budget) {
            budget.setState(States.CLOSED);
        }
    },
    CLOSED {
        @Override
        public void applyExtraDiscount(Budget budget) {
            // Do nothing
        }

        @Override
        public void approve(Budget budget) {
            System.out.println("This budget is already closed");
        }

        @Override
        public void disapprove(Budget budget) {
            System.out.println("This budget is already closed");
        }

        @Override
        public void close(Budget budget) {
            System.out.println("This budget is already closed");
        }
    }

}
