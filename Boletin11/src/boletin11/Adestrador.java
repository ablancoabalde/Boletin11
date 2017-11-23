
package boletin11;
//*  atributos : id (int ), nome ( String), apelido ( String ),edade (int ), idFederacion ( String )
//  *  métodos : concentrarse () : void 
//                      viaxar ( ) : void
//                      dirixirPartido ( ) : void
//                      dirixirAdestramento ( ) : void
public class Adestrador extends Seleccion {
    private String idFederacion;

    public Adestrador(String idFederacion, int id, int idade, String nome, String apelido) {
        super(id, idade, nome, apelido);
        this.idFederacion=idFederacion;
    }


    public String getIdFederacion() {
        return idFederacion;
    }
    
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores");
    }
    
    public void dirixirPartido(){
        
    }
    
    public void dirixirAdestramento(){
        
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"idFederacion="+idFederacion;
    }
}
