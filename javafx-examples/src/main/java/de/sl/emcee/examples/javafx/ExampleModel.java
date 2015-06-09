package de.sl.emcee.examples.javafx;

public final class ExampleModel {

    public final String userName, password;

    public ExampleModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    private static final String TO_STRING_TEMPLATE = "User: %s | Password: %s";

    @Override
    public String toString() {
        return String.format(TO_STRING_TEMPLATE, this.userName, this.password);
    }
}
