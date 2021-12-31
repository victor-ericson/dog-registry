//Victor Ericson vier1798

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

@UnderTest(id="U6.3")
public class ForInlasning {

    private static final ArrayList<InputStream> LISTAN = new ArrayList<>();
    private Scanner input;

    public ForInlasning(){
        this(System.in);
    }

    public ForInlasning(InputStream forInlasning) {
        if (!LISTAN.contains(forInlasning)) {
            input = new Scanner(forInlasning);
            LISTAN.add(forInlasning);
        } else {
            throw new IllegalStateException("Redan tillagd. Försök igen: ");
        }
    }
    public String getText(String text){
        System.out.println(text+ "?>");
        return input.nextLine();
    }
    public int getHeltal(String text){
        System.out.println(text+"?>");
        int newheltal = input.nextInt();
            input.nextLine();
        return newheltal;
    }
    public double getDecimaltal(String text){
        System.out.println(text+"?>");
        double decimaltal = input.nextDouble();
            input.nextLine();
        return decimaltal;
    }
}