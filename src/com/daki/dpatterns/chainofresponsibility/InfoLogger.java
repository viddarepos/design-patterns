package com.stefancipe.dpatterns.chainofresponsibility;

public class InfoLogger extends AbstractLogger {
    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }

    public InfoLogger(int logLevel) {
        super(logLevel);
    }
}
