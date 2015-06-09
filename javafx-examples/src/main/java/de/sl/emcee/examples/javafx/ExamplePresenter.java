package de.sl.emcee.examples.javafx;

import de.sl.emcee.Presenter;
import javafx.event.ActionEvent;

public final class ExamplePresenter extends Presenter.Base<ExampleView> {

    protected ExamplePresenter(ExampleView view) {
        super(view);
    }

    @Override
    protected void customize() {
        view.setInput(new ExampleModel("Please insert UserName", "Please insert Password"));
        view.setSignInAction(this::handleSignIn);
    }

    private void handleSignIn(ActionEvent actionEvent) {
        ExampleModel model = view.getInput();
        view.setActionTargetText(model.toString());
    }
}
