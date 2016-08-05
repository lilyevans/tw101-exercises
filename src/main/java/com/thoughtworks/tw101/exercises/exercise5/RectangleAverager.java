package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float areaTotal = (float)0;

        for (int i = 0; i < rectangles.length; i++){
            areaTotal += rectangles[i].area();
        }

        return areaTotal/rectangles.length;
    }
}
