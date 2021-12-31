import java.lang.reflect.Array;
import java.util.ArrayList;

public class AssignmentSevenPointTwo {

    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private ForInlasning input = new ForInlasning();

    @UnderTest(id = "U7.2")

    public void listOfDogs() {
        if (dogs.isEmpty()) {
            System.out.println("Error: no dogs in register");
            return;
        }
        double minimumTailLength = input.getDecimaltal("Smallest taillength to display");
        ArrayList<Dog> temp = new ArrayList<>();
        for (Dog dog : dogs) {
            if (dog.getTailLength() >= minimumTailLength) {
                temp.add(dog);
            }

        }
        if (temp.isEmpty()) {
            System.out.println("Error: no dogs in register");
        }else{
            for (Dog dog : temp) {
                System.out.println(dog);
            }
        }
    }
}
//        boolean dogsFound = false;
//        for (Dog dog : dogs) {
//            if (dog.getTailLength() >= minimumTailLength) {
//                dogsFound = true;
//                break;
//            }
//
//        }
//        if (dogsFound) {
//            for (Dog dog : dogs) {
//                if (dog.getTailLength() >= minimumTailLength) {
//                    System.out.println(dog);
//                }
//            }
//        }else{
//            System.out.println("Error: no dogs in register");
//        }


