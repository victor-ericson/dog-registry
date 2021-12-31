import java.util.ArrayList;

public class AssignmentEightPointOne {
    private ForInlasning input = new ForInlasning();

    @UnderTest(id="owners")
    private ArrayList<Owner> owners = new ArrayList<>();

    @UnderTest(id="U8.1")
    public Owner getNewOwner() {
        String name;
            do {
                name = input.getText("register new owner").trim();
            } while (name.isEmpty());
                System.out.println("Error, can't input empty name.");
            Owner owner = new Owner(name);
            return owner;
    }
        public String capitalize(String text){
            text = text.strip();
            text = text.toLowerCase();
            String firstletter = text.substring(0, 1).toUpperCase();
            text = text.substring(1);
            return firstletter + text;
        }
    public void addDogToList() {
        owners.add(getNewOwner());
    }
    }
