package com.stefancipe.dpatterns.chainofresponsibility;

public class WarningLogger extends AbstractLogger {
    public WarningLogger(int logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("WARNING: " + message);
    }
}
