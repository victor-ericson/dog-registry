import java.util.ArrayList;

public class AssignmentSevenPointSixPointOnePointOne {
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();

    @UnderTest(id = "U7.6.1.1")
    public ArrayList<Dog> sortDogs(int dogOne, int dogTwo){
        Dog first = dogs.get(dogOne);
        Dog last = dogs.get(dogTwo);
        return dogs;
    }

}
