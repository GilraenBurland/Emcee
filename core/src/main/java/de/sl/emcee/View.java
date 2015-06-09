package de.sl.emcee;

public interface View<Model> {

    void init();
    void open();
    void close();
    void setInput(Model model);
    Model getInput();
}
