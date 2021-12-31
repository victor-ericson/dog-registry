//Victor Ericson vier1798
public class AssignmentSixPointFour {

    private String name;
    private String breed;
    private int age;
    private int weight;
    private ForInlasning input = new ForInlasning();

    @UnderTest(id = "U6.4")
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
        return new Dog(name, breed, age, weight);
    }
}


