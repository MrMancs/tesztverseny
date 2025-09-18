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
        debugger();
    }
}