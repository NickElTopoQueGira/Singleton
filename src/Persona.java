public class Persona {
    private final String nome;

    public Persona(String nome){
        this.nome = nome;
    }

    public  String getNome(){ return  this.nome; }

    @Override
    public String toString(){
        return "Nome: " + this.nome;
    }
}
