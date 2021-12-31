import java.util.ArrayList;

public class AssignmentSevenPointOne {
    private String name;
    private String breed;
    private int age;
    private int weight;
    private ForInlasning input = new ForInlasning();

    @UnderTest(id="dogs")
    private ArrayList<Dog> dogs = new ArrayList<>();

    @UnderTest(id="U6.4")
    public Dog getNewDog() {
        do {
            name = input.getText("Enter name of dog").trim();
        } while (name.isEmpty());
        System.out.println("Error, can't input empty name.");
        do {
            breed = input.getText("Enter breed of dog").trim();
        } while (breed.isEmpty());
        System.out.println("Error, can't input empty breed.");
        do {
            age = input.getHeltal("Enter age of dog");
        } while (age <= 0);
        do {
            weight = input.getHeltal("Enter weight of dog");
        } while (weight <= 0);
        return new Dog(capitalize(name), capitalize(breed), age, weight);
    }
    public String capitalize(String text){
        text = text.strip();
        text = text.toLowerCase();
        String firstletter = text.substring(0, 1).toUpperCase();
        text = text.substring(1);
        return firstletter + text;
    }
    @UnderTest(id="U7.1")
    public void addDogToList() {
        dogs.add(getNewDog());
    }
}
