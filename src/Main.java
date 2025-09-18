import java.io.FileNotFoundException;

public class Main {
    private static Handler handler;

    private static void debugger(){
        int i = 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        handler = new Handler();

        System.out.println("1. feladat");
        handler.readFile("sourceFiles/valaszok.txt");
        System.out.println();

        System.out.println("2. feladat: A vetélkedőn " + handler.getValaszokDb()+ " versenyző indult. ");
        System.out.println();

        debugger();
    }
}