package boletin11;
// *  atributos : dorsal ( int ), demarcación                  
//                   ( String ).
//   *  métodos : concentrarse () : void 
//                        viaxar ( ) : void
//                        xogarPartido ( ) : void
//                        entrenar ( ) : void

public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public Xogador(int dorsal, String demarcacion, int id, int idade, String nome, String apelido) {
        super(id, idade, nome, apelido);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }



    public void xogarPartido() {
        System.out.println("Llamar metodo desde un objeto subclase");
    }

    public void entrenar() {

    }

    @Override
    public String toString() {
        return super.toString()+"dorsal="+dorsal+", demarcacion="+demarcacion+'}';
    }

}
