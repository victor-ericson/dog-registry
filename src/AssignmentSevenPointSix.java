import java.util.ArrayList;
import java.util.Collections;


public class AssignmentSevenPointSix {
    @UnderTest(id = "dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();

    @UnderTest(id = "U7.6.1.1")
    public ArrayList<Dog> swapDogs(int dogOnePosition, int dogTwoPosition) {
        Dog temp = dogs.get(dogOnePosition);
        dogs.set(dogOnePosition, dogs.get(dogTwoPosition));
        dogs.set(dogTwoPosition, temp);
        return dogs;
    }
    @UnderTest(id = "U7.6.1.2")
    public ArrayList<Dog> swapDogsEasy(int dogOnePosition, int dogTwoPosition) {
        Collections.swap(dogs, dogOnePosition, dogTwoPosition);
        return dogs;
    }
    @UnderTest(id = "U7.6.2")
    public Dog sortDogsByTailLength(Dog d1, Dog d2) {
        if (d1.getTailLength() < d2.getTailLength()) {
            return d1;
        } else if (d1.getTailLength() > d2.getTailLength()) {
            return d2;
        }else if (d1.getTailLength() == d2.getTailLength()){
            compareDogNames(d1, d2);
            if (d1.getName().compareToIgnoreCase(d2.getName()) > 0) {
                return d2;
            }
        }
        return compareDogNames(d1, d2);
    }
    public Dog compareDogNames(Dog d1, Dog d2){
        if (d1.getName().compareToIgnoreCase(d2.getName()) > 0) {
            return d2;
        }else
            return d1;
        }
    @UnderTest(id = "U7.6.3")
    public int findSmallestDog(int dogIndex) {
        Dog smallestDog = dogs.get(dogIndex);
        for (int i = dogIndex; i < dogs.size(); i++) {
                smallestDog = sortDogsByTailLength(smallestDog, dogs.get(i));
        }
        return dogs.indexOf(smallestDog);
    }
    @UnderTest(id = "U7.6.4")
    public void sort(){ //denna ska tydligen vara void och inte ta in några parametrar, känns konstigt?
        for (int i = 0; i < dogs.size() - 1; i++){
            int minIndex = findSmallestDog(i);
            if (minIndex != i) {
                swapDogs(minIndex, i);
            }
        }
    }
}
