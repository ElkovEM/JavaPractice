package practice_2;

public class NurseryDog {
    ObjectDog[] Array = new ObjectDog[10];

    public void SetDog(ObjectDog Doge) {
        int id = Doge.getID();
        Array[id] = Doge;
        Doge.setID(id + 1);
    }
}
