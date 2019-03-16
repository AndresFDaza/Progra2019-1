package zapamain;

public class ZapaMain {

    public static void main(String[] args) {

        zapatosClass cualquierZapato = new zapatosClass();
        taconesClass taconesRojos = new taconesClass();
        botasClass botasTexanas = new botasClass();

        
        //Se prueba que todos los objetos pertenezcan o se hereden de la clase padre (zapatosClass)
        
        cualquierZapato.calzar();
        taconesRojos.calzar();
        botasTexanas.calzar();
        
        // Se comprueba los métodos únicos de las clases hijo (taconesClass y botasClass)
        
        cualquierZapato.proporcionarCalor(); // el método proporcionaCalor() NO pertenece al objeto y/o clase zapatoClass.
        taconesRojos.proporcionarCalor(); // el método proporcionaCalor() NO pertenece al objeto y/o clase taconesClass.
        botasTexanas.proporcionarCalor(); // <--------- el método proporcionaCalor() SÍ pertenece al objeto y/o clase botasClass !!!
        
        
        
        cualquierZapato.generarElegancia(); // el método generarElegancia() NO pertenece al objeto y/o clase zapatoClass.
        taconesRojos.generarElegancia(); // <-------- el método generarElegancia() SÍ pertenece al objeto y/o clase taconesClass !!!
        botasTexanas.generarElegancia(); // el método generarElegancia() NO pertenece al objeto y/o clase botasClass.
    }

}
