package desing_patterns_1.chain_of_responsability.project_2;

public class ResponseManager {

    public void respond(Request request, Account account) {
        Response r1 = ResponseFormat.XML;
        r1.respond(request, account);
    }

}
