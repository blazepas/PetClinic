package pl.blazej.szczypka.learn.pet.clinic.service.doctors;

import pl.blazej.szczypka.learn.pet.clinic.animals.Animal;

public class DogDoctor implements AnimalDoctorService {
    @Override
    public void help(Animal animal) {
        System.out.println("Treating dog: " + animal.getName());
    }
}
