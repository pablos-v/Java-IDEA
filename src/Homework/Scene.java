package Homework;

import java.util.ArrayList;

public class Scene {

    private int id;
    private ArrayList<Model> models;


    public int getId() {
        return id;
    }

    public void clear() {

    }

    public void newModel() {
        models.add(new Model(new Poligon(new ArrayList<>()), new Texture()));
    }

}
