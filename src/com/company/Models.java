// Models.java:


package com.company;

class Cup extends Dish
{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Кружечка. Параметры:\nЦвет - %s\nРазмеры: (x, y, z) = (%d, %d, %d)",
                getColor(), (int)size_x, (int)size_y, (int)size_z);
    }
}

class Plate extends Dish
{
    private String model;
    private float radius;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Тарелочка. Параметры:\nМодель - %s\nРадиус - %d\nРазмеры: (x, y, z) = (%d, %d, %d)",
                getModel(), (int)getRadius(), (int)size_x, (int)size_y, (int)size_z);
    }
}

abstract class Dish
{
    protected float size_x, size_y, size_z;

    public void setSize(float x, float y, float z)
    {
        size_x = x;
        size_y = y;
        size_z = z;
    }
}