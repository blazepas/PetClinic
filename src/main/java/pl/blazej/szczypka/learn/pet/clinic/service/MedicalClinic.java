package pl.blazej.szczypka.learn.pet.clinic.service;

import pl.blazej.szczypka.learn.pet.clinic.animals.Animal;
import pl.blazej.szczypka.learn.pet.clinic.service.doctors.AnimalDoctorService;
import pl.blazej.szczypka.learn.pet.clinic.service.doctors.CatDoctor;
import pl.blazej.szczypka.learn.pet.clinic.service.doctors.DogDoctor;

public class MedicalClinic {
// JAKIM SPOSOBEM MOGE SIĘ ODWOLAC DO INTERFEJSU BEZ IMPLEMENTS słowka? CZY TO KWESTIA
// HIERARCHI MedicalClinic??
    public void animalHelp(AnimalDoctorService animalDoctorService, Animal animal) {
        animalDoctorService.help(animal);

//        if (animal instanceof Cat) {
//            catDoctor.help(animal);
//        } else if (animal instanceof Dog) {
//            dogDoctor.help(animal);
//        } else {
//            throw new IllegalArgumentException("unable to help this animal");
//        }
    }
}
