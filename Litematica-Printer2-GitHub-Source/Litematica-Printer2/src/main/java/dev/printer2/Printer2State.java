package dev.printer2;

/** Shared state read by the reach mixin. */
public final class Printer2State {
    private Printer2State() {}

    public static volatile boolean enabled = false;
    public static volatile double reach = 10.0;
}
