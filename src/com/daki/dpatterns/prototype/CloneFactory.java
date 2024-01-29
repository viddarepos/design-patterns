package com.stefancipe.dpatterns.prototype;

public class CloneFactory {

    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
