package pl.blazej.szczypka.learn.pet.clinic.service.doctors;

import pl.blazej.szczypka.learn.pet.clinic.animals.Animal;

public class CatDoctor implements AnimalDoctorService {

    @Override
    public void help(Animal animal) {
        System.out.println("Helping cat with name: " + animal.getName());

    }
}
