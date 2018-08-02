package solid.project_2;

public enum Actions implements PostGenerationAction {

    SAVE_AT_DATABASE {
        @Override
        public void execute(ElectronicInvoice invoice) {
            System.out.println("Saving this invoice at local database");
        }
    },
    SEND_BY_EMAIL {
        @Override
        public void execute(ElectronicInvoice invoice) {
            System.out.println("Sending this invoice by e-mail");
        }
    },
    SEND_BY_SMS {
        @Override
        public void execute(ElectronicInvoice invoice) {
            System.out.println("Sending this invoice by SMS");
        }
    }

}
