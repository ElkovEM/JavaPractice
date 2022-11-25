package pr2.Dog;
import java.util.ArrayList;

public class NurseryDogs {
    private ArrayList<Dog> dogArrayList = new ArrayList<>();
    public void addDog(Dog dog) {
        dogArrayList.add(dog);
    }
    public void showKennel () {
        for (Dog dog : dogArrayList)
            System.out.println(dog);
    }

    public static void main(String[] args) {
        NurseryDogs SunDogs = new NurseryDogs();
        Dog Biba = new Dog("Biba", 5);
        Dog Boba = new Dog("Boba", 3);

        SunDogs.addDog(Biba);
        SunDogs.addDog(Boba);
        SunDogs.showKennel();
    }

}
