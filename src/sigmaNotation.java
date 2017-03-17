/**
 * Created by Aunteek Naser on 3/16/2017.
 */
import java.io.*;
import java.util.*;
public class sigmaNotation {
    public void main(String[args]) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("What value of k is given?");
        int k = kbReader.nextInt();
        System.out.println("How many numbers are in the set?");
        String upLim = kbReader.nextLine();
        System.out.println("How many numbers are listed in the set?");
        int howManyGiven = kbReader.nextInt();
        //describes how many numbers are listed in the set
        double[] set = new double[howManyGiven];
        for (int i = 0; i < howManyGiven; i++) {
            System.out.println("What is the value of term " + (i + 1) + " in the sequence?");
            set[i] = kbReader.nextInt();
        }
        boolean isArith = false;
        boolean isGeom = false;
        if (set[1] - set[0] == set[2] - set[1]) {
            isArith = true;
            System.out.println("This is an arithmetic sequence.");
        } else if (set[1] / set[0] == set[2] / set[1]) {
            isGeom = true;
            System.out.println("This is a geometric sequence.");
        } else {
            System.out.println("I can't help you anymore until the guy who wrote me figures this bit out.");
        }
        double n;
        if (isArith)  {
            n = (set[1] - set[0]);
        } else if (isGeom) {
            n = (set[1] / set[0]);
        } else {
            n = 0;
        }
    }
}
