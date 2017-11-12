package pl.blazej.szczypka.learn.pet.clinic.service.doctors;

import pl.blazej.szczypka.learn.pet.clinic.animals.Animal;

public interface AnimalDoctorService {
    int COMMISION = 10;
    void help(Animal animal);
}