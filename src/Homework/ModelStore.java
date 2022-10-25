package Homework;

import java.util.ArrayList;

public class ModelStore {

    private ArrayList<Model> models;
    private ArrayList<Scene> scenes;
    private ArrayList<Flash> flashes;
    private ArrayList<Camera> cameras;

    public Scene getScene(int id) throws RuntimeException{

        for (Scene scene : scenes) {
            if (scene.getId() == id) return scene;
        }
        throw new RuntimeException("Wrong scene number!"); // просто тренируюсь, чтобы не забывать)
    }
}
