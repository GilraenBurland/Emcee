package de.sl.emcee.examples.javafx;

import de.sl.emcee.View;
import de.sl.emcee.javafx.FXView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public interface ExampleView extends View<ExampleModel>{

    void setSignInAction(EventHandler<ActionEvent> eventHandler);
    void setActionTargetText(String text);

    final class Default extends FXView<GridPane, ExampleModel> implements ExampleView {

        public Default(Pane parent) {
            super(parent, Default.class.getResource("/views/exampleView.fxml"));
        }

        @FXML private TextField userNameField;
        @FXML private PasswordField passwordField;

        @Override
        public void setInput(ExampleModel exampleModel) {
            this.userNameField.setText(exampleModel.userName);
            this.passwordField.setText(exampleModel.password);
        }

        @Override
        public ExampleModel getInput() {
            return new ExampleModel(userNameField.getText(), passwordField.getText());
        }

        @FXML private Button signInButton;

        @Override
        public void setSignInAction(EventHandler<ActionEvent> eventHandler) {
            this.signInButton.setOnAction(eventHandler);
        }

        @FXML private Text actionTarget;

        @Override
        public void setActionTargetText(String text) {
            this.actionTarget.setText(text);
        }
    }
}
