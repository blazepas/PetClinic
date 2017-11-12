package pl.blazej.szczypka.learn.pet.clinic;
import pl.blazej.szczypka.learn.pet.clinic.animals.Animal;
import pl.blazej.szczypka.learn.pet.clinic.animals.Cat;
import pl.blazej.szczypka.learn.pet.clinic.animals.Turtle;
import pl.blazej.szczypka.learn.pet.clinic.service.MedicalClinic;
import pl.blazej.szczypka.learn.pet.clinic.service.doctors.AnimalDoctorService;
import pl.blazej.szczypka.learn.pet.clinic.service.doctors.CatDoctor;
import pl.blazej.szczypka.learn.pet.clinic.service.doctors.DogDoctor;
import pl.blazej.szczypka.learn.pet.clinic.service.doctors.TurtleDoctor;

public class PetClinicMain {
    public static void main(String[] args) {
        MedicalClinic kateMedicalClinic = new MedicalClinic();

        AnimalDoctorService catDoctor = new CatDoctor();
        AnimalDoctorService dogDoctor = new DogDoctor();
        AnimalDoctorService turtleDoctor = new TurtleDoctor();

        Cat tofik = new Cat(6, "grey", "Tofik", true);
        kateMedicalClinic.animalHelp(dogDoctor, tofik);

        Turtle leonardo = new Turtle(-2, "green", "Leonardo");
        kateMedicalClinic.animalHelp(turtleDoctor, leonardo);

    }
}
