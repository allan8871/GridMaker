package algoritmos;

import preferencias.Config;

public class GradeInvalidaException extends IllegalArgumentException {
    public GradeInvalidaException() {
        super(Config.bundleMessage.getString("invalidGridException"));
    }
}
