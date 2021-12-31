import java.util.ArrayList;

public class AssignmentSevenPointFour {

    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();
    private ForInlasning input = new ForInlasning();

    @UnderTest(id = "U7.4")
    public void increaseDogAge() {
        String nameOfDog = input.getText("Enter name of the dog");
        Dog dog = findADog(nameOfDog);
        if (dogs.isEmpty() || dog == null) {
            System.out.println("Error: no such dog in list.");
        } else if (dog.getName().equalsIgnoreCase(nameOfDog)) {
            dog.updateAge();
        }
    }
        private Dog findADog (String nameOfDog){
            for (Dog dog : dogs) {
                if (dog.getName().equalsIgnoreCase(nameOfDog)) {
                    return dog;
                }
            }
            return null;
        }
    }

