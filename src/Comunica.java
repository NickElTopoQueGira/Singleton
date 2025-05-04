import java.util.Scanner;

public class Comunica {
    private static Scanner input;
    private static Comunica istanza = null;

    private Comunica(){
        input = new Scanner(System.in);
    }

    public static synchronized Comunica getIstanza(){
        if(istanza == null){
            istanza = new Comunica();
        }

        return istanza;
    }

    public synchronized void comunicaMessaggio(String messaggio){
        System.out.print(messaggio);
    }

    public synchronized String leggiConsole(){
        return  input.nextLine();
    }
}
