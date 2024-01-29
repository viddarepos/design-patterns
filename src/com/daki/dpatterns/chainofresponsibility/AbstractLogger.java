package com.stefancipe.dpatterns.chainofresponsibility;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;

    private int logLevel;
    private AbstractLogger nextLogger;

    public AbstractLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    public void setNextLogger(AbstractLogger logger) {
        nextLogger = logger;
    }

    protected abstract void write(String message);

    public void logMessage(String message, int level) {
        if (this.logLevel == level)
            write(message);
        else if (nextLogger != null)
            nextLogger.logMessage(message, level);
    }

}
