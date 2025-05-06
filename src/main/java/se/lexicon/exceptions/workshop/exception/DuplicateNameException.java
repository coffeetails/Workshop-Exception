package se.lexicon.exceptions.workshop.exception;

public class DuplicateNameException extends RuntimeException {
    private final String name;

    public DuplicateNameException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Error: The name " + name + " already exists.";
    }
}
