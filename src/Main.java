import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        writeNameAndLength();
        readNameAndLength();
//        writeToFile();
//        readFromFile();
    }

    private static void readNameAndLength() throws FileNotFoundException {
        File file = new File("names.txt");
        Scanner scanner = new Scanner(file);
        String[] tabName = new String[5];
        Integer[] tabLength = new Integer[5];
        for (int i = 0; i < 5; i++) {
            String writeLine = scanner.nextLine();
            System.out.println(writeLine);
            String name = writeLine.substring(0, (writeLine.length() - 2));
            String lengthName = writeLine.substring(writeLine.length() - 1);
            int lengthNameInt = Integer.parseInt(lengthName);
            System.out.println("Imię: " + name + ". Długość imienia: " + lengthNameInt);
            tabName[i] = name;
            tabLength[i] = lengthNameInt;
        }
        System.out.println("Tablica z imionami: " + Arrays.toString(tabName));
        System.out.println("Tablica z długością imion: " + Arrays.toString(tabLength));
    }

    private static void writeNameAndLength() throws FileNotFoundException {
        String[] tabName = {"Adam", "Ewa", "Bogdan", "Monika", "Dawid"};
        File file = new File("names.txt");
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < tabName.length; i++) {
            String writeNameAndAge = tabName[i] + " " + tabName[i].length();
            printWriter.println(writeNameAndAge);
            System.out.println(writeNameAndAge);
        }
        printWriter.close();
    }

    private static void readFromFile() throws FileNotFoundException {
        File file = new File("plik.txt");
        Scanner writeFile = new Scanner(file);
        for (int i = 0; i < 10; i++) {
            String wr = writeFile.nextLine();
            String[] tab = {wr};
            System.out.println(wr);
            System.out.println(Arrays.toString(tab));
        }
    }

    private static void writeToFile() throws FileNotFoundException {
        File file = new File("plik.txt");
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < 10; i++) {
            printWriter.println("text" + i);
        }
        printWriter.close();
    }
}
