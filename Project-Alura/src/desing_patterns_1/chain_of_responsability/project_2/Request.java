package desing_patterns_1.chain_of_responsability.project_2;

public class Request {

    private final ResponseFormat format;

    public Request(ResponseFormat format) {
        this.format = format;
    }

    public ResponseFormat getFormat() {
        return format;
    }
}
