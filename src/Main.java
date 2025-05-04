public class Main {
    public static void main(String[] args) {
        Comunica comunica = Comunica.getIstanza();

        comunica.comunicaMessaggio("Inserisci messaggio: ");
        String messaggio = comunica.leggiConsole();
        comunica.comunicaMessaggio("Messaggio immesso: " + messaggio + "\n");


        CreaPersona creaPersona = new CreaPersona();

        Persona persona = creaPersona.nuovaPersona();

        comunica.comunicaMessaggio(persona.toString() + "\n");
    }
}