package de.sl.emcee.examples.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public final class Main extends Application {

    public static void main(String[] args) {
        launch(Main.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Presenter Example - JavaFX");

        ScrollPane root = new ScrollPane();
        VBox content = new VBox();
        root.setContent(content);
        primaryStage.setScene(new Scene(root));

        ExampleView.Default exampleView = new ExampleView.Default(content);
        ExamplePresenter presenter = new ExamplePresenter(exampleView);
        presenter.start();

        primaryStage.show();
    }
}
