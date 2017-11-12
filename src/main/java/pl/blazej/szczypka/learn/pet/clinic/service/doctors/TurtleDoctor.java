package pl.blazej.szczypka.learn.pet.clinic.service.doctors;

import pl.blazej.szczypka.learn.pet.clinic.animals.Animal;

public class TurtleDoctor implements AnimalDoctorService {
    @Override
    public void help(Animal animal) {
        System.out.println("Healing turtle: " + animal.getName());
    }
}
