package de.sl.emcee.javafx;

import de.sl.emcee.View;
import de.sl.emcee.util.SneakException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

import java.io.IOException;
import java.net.URL;

public abstract class FXView<R extends Region, Model> implements View<Model>{

    private final Pane parent;
    private final URL  fxmlLocation;

    protected FXView(Pane parent, URL fxmlLocation) {
        this.parent = parent;
        this.fxmlLocation = fxmlLocation;
    }

    @FXML private R region;

    @Override
    public void init() {
        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        loader.setController(this);
        try {
            this.region = loader.load();
        } catch (IOException e) {
            SneakException.sneakyThrow(e);
        }
    }

    @Override
    public void open() {
        this.parent.getChildren().add(this.region);
    }

    @Override
    public void close() {
        this.parent.getChildren().remove(this.region);
    }
}
