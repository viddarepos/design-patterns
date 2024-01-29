package com.stefancipe.dpatterns.bridge;

public class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Painting it red");
    }
}
