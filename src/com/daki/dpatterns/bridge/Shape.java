package com.stefancipe.dpatterns.bridge;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public void paint() {
        draw();
        color.fillColor();
    }
}
