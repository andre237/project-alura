package object_orientation.project_1;

public class CNPJ implements Document{

    private final String value;

    public CNPJ(String value) {
        this.value = value;
    }

    @Override
    public boolean isValid() {
        // TODO implement

        return true;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CNPJ)) {
            return false;
        }

        CNPJ other = (CNPJ) obj;
        return this.value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public String toString() {
        return this.value;
    }
}
