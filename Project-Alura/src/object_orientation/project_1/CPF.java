package object_orientation.project_1;


public class CPF implements Document {

    private final String value;

    public CPF(String value) {
        this.value = value;
    }

    public boolean isValid() {
        // TODO implement

        return true;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CPF)) {
            return false;
        }

        CPF other = (CPF) obj;
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
