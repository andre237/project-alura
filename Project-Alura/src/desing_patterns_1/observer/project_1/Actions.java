package desing_patterns_1.observer.project_1;

public enum Actions implements InvoiceAction {

    SEND_BY_EMAIL {
        @Override
        public void execute(ElectronicInvoice invoice) {
            System.out.println("Sending this invoice by e-mail");
        }
    },
    SEND_BY_SMS {
        @Override
        public void execute(ElectronicInvoice invoice) {
            System.out.println("Sending this invoice by sms");
        }
    },
    SAVE_AT_DATABASE {
        @Override
        public void execute(ElectronicInvoice invoice) {
            System.out.println("Saving this invoice at the local database");
        }
    }

}
