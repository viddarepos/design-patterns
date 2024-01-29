package com.stefancipe.dpatterns.chainofresponsibility;

public class ChainPattern {

    public static AbstractLogger getLoggerChain() {
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger warningLogger = new WarningLogger(AbstractLogger.WARNING);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        warningLogger.setNextLogger(errorLogger);
        infoLogger.setNextLogger(warningLogger);

        return  infoLogger;
    }
}
