package boletin11;

public class Boletin11 {

    public static void main(String[] args) {
        Seleccion sec1=new Seleccion(001, 14, "Alberto", "Blanco");
        Xogador xog1=new Xogador(8, "lateral", 010, 20, "Al", "Bla");
        Adestrador ads1=new Adestrador("A001", 100, 45, "Paco", "Gonzalez");
        Maxasista max1=new Maxasista("Universitario", 5, 200, 22, "Ana", "Perez");

        //Llamada al metod concentrarse con los 3 objetos
        //sec1.concentrarse();( No funciona porque no tiene el metodo creado)
        sec1.concentrarse();
        xog1.concentrarse();
        ads1.concentrarse();
        max1.concentrarse();
        //Llamada al metod viaxar con los 3 objetos
        sec1.viaxar();
        xog1.viaxar();
        ads1.viaxar();
        max1.viaxar();
        System.out.println("\n");
        //Intento de llamar un metodo de una superclase con un obxeto de una subclase
        xog1.viaxar(); //(Sin prolema)

        //Intento de llamar un metodo de una subclase con un obxeto de una superclase
        // sec1.darMaxases();( No se puede porque la superclase no hereda los metodos de la subclase
    }

}
