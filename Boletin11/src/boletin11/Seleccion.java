package boletin11;

public class Seleccion {

    private int id, idade;
    private String nome, apelido;

    public Seleccion(int id, int idade, String nome, String apelido) {
        this.id=id;
        this.idade=idade;
        this.nome=nome;
        this.apelido=apelido;
    }

    public int getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }
    
    public void concentrarse() {
        System.out.println(" concentrase a selección ");
    }
    
    public void viaxar() {
        System.out.println("viaxa a selección");
    }

    @Override
    public String toString() {
        return "Seleccion "+"id="+id+", idade="+idade+", nome="+nome+", apelido="+apelido;
    }

}
