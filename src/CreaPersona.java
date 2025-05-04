
public class CreaPersona {
    private final Comunica comunica;
    public CreaPersona(){
        this.comunica = Comunica.getIstanza();
    }

    public Persona nuovaPersona(){
        comunica.comunicaMessaggio("Inserisci il nome: ");
        String nome = comunica.leggiConsole();
        return new Persona(nome);
    }
}
