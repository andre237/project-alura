package desing_patterns_1.chain_of_responsability.project_2;

public class Test {

    public static void main(String[] args) {
        Account account = new Account("Henry Ford", 887658.99);
        Request request = new Request(ResponseFormat.XML);

        ResponseManager manager = new ResponseManager();
        manager.respond(request, account);
    }

}
