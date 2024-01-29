package com.stefancipe.dpatterns.objectpool;

public class Resource {

    private int value;

    public Resource() {
        value = 0;
    }

    public void reset() {
        value = 0;
    }

    public int getValue() {
        return  value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
