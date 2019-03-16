package zapamain;

public class taconesClass extends zapatosClass {

    private String tacon;
    private String plataforma;
    private String estilo;
    private String abertura;

    //CONSTRUCTOR  
    public void taconesClass() {
        this.tacon = "";
        this.plataforma = "";
        this.estilo = "";
        this.abertura = "";
    }

    public void TaconesClass(String tacon, String plataforma, String estilo, String abertura) {
        this.tacon = "si";
        this.plataforma = "si";
        this.estilo = "impermeable";
        this.abertura = "no";
    }

    //METODS
    
    public void subirEstatura(){
        
    }
    
    public void generarElegancia(){
        
    }
    
    
    
    // GETTER AND SETTERS
    public String getTacon() {
        return tacon;
    }

    public void setTacon(String tacon) {
        this.tacon = tacon;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

}
