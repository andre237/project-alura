package desing_patterns_1.chain_of_responsability.project_2;

public enum ResponseFormat implements Response {
    XML {
        @Override
        public void respond(Request request, Account account) {
            if (request.getFormat() == this) {
                System.out.println("<account>");
                System.out.println("    <owner>" + account.getOwner() + "</owner>");
                System.out.println("    <balance>" + account.getBalance() + "</balance>");
                System.out.println("</account>");
            } else {
                CSV.respond(request, account);
            }
        }
    },
    CSV {
        @Override
        public void respond(Request request, Account account) {
            if (request.getFormat() == this) {
                System.out.println(account.getOwner() + "," + account.getBalance());
            } else {
                PER_CENT.respond(request, account);
            }
        }
    },
    PER_CENT {
        @Override
        public void respond(Request request, Account account) {
            if (request.getFormat() == this) {
                System.out.println(account.getOwner() + "%" + account.getBalance());
            } else {
                NULL.respond(request, account);
            }
        }
    },
    NULL {
        @Override
        public void respond(Request request, Account account) {
            System.out.println("IDK");
        }
    }

}
