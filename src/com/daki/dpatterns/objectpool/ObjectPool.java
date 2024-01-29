package com.stefancipe.dpatterns.objectpool;

import java.util.ArrayList;

public class ObjectPool {
    private ArrayList<Resource> resources;

    public ObjectPool() {
        resources = new ArrayList<>();
    }

    public Resource acquireResource() {
        if(resources.isEmpty()) {
            System.out.println("Creating a new resource");
            return new Resource();
        } else {
            System.out.println("Reusing resource");
            return resources.remove(0);
        }
    }

    public void returnResource(Resource resource) {
        resource.reset();
        resources.add(resource);
    }

}
