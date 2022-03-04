package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal animalCat;
    private Animal animalDog;
    private Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animalCat,
                       @Qualifier("dog") Animal animalDog,
                       @Qualifier("timer") Timer timer) {
        this.animalCat = animalCat;
        this.animalDog = animalDog;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animalDog.toString() + ", " + animalCat.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
