package boletin11;
//*   atributos : id (int ), nome ( String), apelido ( String ),edade (int ), titulacion (String), anosExperiencia (int )
//*   métodos : concentrarse () : void 
//                      viaxar ( ) : void
//                      darMasaxes ( ) : void

public class Maxasista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Maxasista(String titulacion, int anosExperiencia, int id, int idade, String nome, String apelido) {
        super(id, idade, nome, apelido);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }


    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");
    }

    public void darMasaxes() {
        System.out.println("Llamar metodo de subclase con objeto superclase");
    }

    @Override
    public String toString() {
        return super.toString()+"titulacion="+titulacion+", anosExperiencia="+anosExperiencia;
    }

}
