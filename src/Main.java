import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File f = new File("src/intcode_data");
        Scanner s = null;
        try {
            s = new Scanner(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(1);
        }

        String[] data = s.nextLine().split(",");
        ArrayList<Integer> operatorCodes = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) {
            operatorCodes.add(Integer.parseInt(data[i]));
        }
        int index = 0;
        while (operatorCodes.get(index) != 99) {
            // Implement the operation logic here
        }
        System.out.println(operatorCodes);
    }
}