package de.sl.emcee;

public interface Presenter<V extends View> {

    void start();

    abstract class Base<V extends View> implements Presenter<V> {

        protected final V view;

        protected Base(V view) {
            this.view = view;
        }

        @Override
        public void start() {
            view.init();
            customize();
            view.open();
        }

        protected abstract void customize();

    }
}
