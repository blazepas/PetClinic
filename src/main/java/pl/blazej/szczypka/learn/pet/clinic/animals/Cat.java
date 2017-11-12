package pl.blazej.szczypka.learn.pet.clinic.animals;

public class Cat extends Animal {
    private boolean likesMilk;

    public Cat(int speed, String colour, String name, boolean likesMilk) {
        this.speed = speed;
        this.colour = colour;
        this.name = name;
        this.likesMilk = likesMilk;
    }


}
