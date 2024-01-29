package com.stefancipe.dpatterns.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
