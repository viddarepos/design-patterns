package com.stefancipe.dpatterns.bridge;

public class GreenColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Painting it green");
    }
}
