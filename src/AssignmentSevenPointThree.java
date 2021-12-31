import java.util.ArrayList;

public class AssignmentSevenPointThree {

    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();

    @UnderTest(id = "U7.3")
    public Dog findADog(String nameOfDog) {
        for (Dog dog : dogs) {
            if (dog.getName().equalsIgnoreCase(nameOfDog)) {
                return dog;
            }
        }
        return null;
    }
}
