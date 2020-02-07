import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String pathname = "C:\\Users\\{username}\\OneDrive\\Documents\\hello.txt"; //change username field
        File file = new File(pathname); //File constructor receives String with path information

        // Try-catch necessary, else the program might be stopped by FileNotFoundException
        try {
            Scanner sc = new Scanner(file); // we now pass path String as the parameter for the Scanner constructor.
            while (sc.hasNext()) {
                System.out.print(sc.next() + " ");
            }
        } catch (FileNotFoundException e) { // FileNotFoundException
            System.out.println("Which file? It doesn't exist. ");
        }

        if (file.exists()) {
            System.out.println(file.getName() + " exists!");
            System.out.println(file.getPath());
            System.out.println(file.length());

        } else {
            System.out.println("The file does not exist. ");
        }


    }
}
