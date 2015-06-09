package de.sl.emcee.util;

public final class SneakException {

    private SneakException() {
    }

    public static void sneakyThrow(Throwable t) {
        SneakException.<RuntimeException>sneakyThrow0(t);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void sneakyThrow0(Throwable t) throws T {
        throw (T) t;
    }
}
