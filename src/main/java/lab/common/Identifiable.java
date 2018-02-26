package lab.common;

public interface Identifiable<T extends Identifiable<T, ID>, ID> {
    ID getId();
    T setId();
}
