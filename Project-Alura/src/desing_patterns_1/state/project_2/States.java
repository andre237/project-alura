package desing_patterns_1.state.project_2;

public enum States implements AccountState{

    POSITIVE {
        @Override
        public void cashIn(Account account, double value) {
            account.balance += value * 0.98;
        }

        @Override
        public void cashOut(Account account, double value) {
            account.balance -= value;
            if (account.balance < 0) account.state = States.NEGATIVE;
        }
    },
    NEGATIVE {
        @Override
        public void cashIn(Account account, double value) {
            account.balance += value * 0.95;
            if (account.balance > 0) account.state = States.POSITIVE;
        }

        @Override
        public void cashOut(Account account, double value) {
            System.out.println("Your account is currently with negative balance. Unable to cash out!");
        }
    }
}
