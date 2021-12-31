import java.io.InputStream;

public class Owner {
        //skapar variabler
        private String name;

        //Constructor
        public Owner(String name){
            this.name = name.trim();
        }
        //hämtar information
        public String getName(){
            return name;
        }
        @Override
        public String toString(){
            return name;
        }
    }
