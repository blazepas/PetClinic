package pl.blazej.szczypka.learn.pet.clinic.animals;

public abstract class Animal {
    protected int speed;
    protected String colour;
    protected String name;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
