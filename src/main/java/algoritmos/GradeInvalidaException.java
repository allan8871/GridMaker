package algoritmos;

public class GradeInvalidaException extends Exception {
    public GradeInvalidaException() {
        super("A grade não pode ser uma potência de 2.");
    }
}
