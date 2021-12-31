import java.io.InputStream;

public class Dog {
    //skapar variabler
    private String name;
    private String breed;
    private int age;
    private int weight;
    private final double taxsvans = 3.7;

    //Constructor
    public Dog(String name, String breed, int age, int weight){
        this.name = name.trim();
        this.breed = breed.trim();
        this.age = age;
        this.weight = weight;
    }
    //hämtar information
    public String getName(){
        return name;
    }
    public String getBreed(){
        this.breed = breed;
        return breed;
    }
    public int getAge(){
        return age;
    }
    public int updateAge(){
        this.age++;
        return age;
    }
    public int getWeight(){
        return weight;
    }

    public double getTailLength() {
        double length;
        if (breed.equalsIgnoreCase ("Tax")  || breed.equalsIgnoreCase("Dachshund")) {
            length = taxsvans;
        } else {
            length = (double)(age * weight) / 10;
        }
        return length;
    }
    @Override
    public String toString(){
        return name+", "+breed+", "+age+", "+weight+", "+getTailLength();
        }
}