package zapamain;

public class botasClass extends zapatosClass {

    private String caña;
    private String tacon;
    private String plataforma;
    private String estilo;
    private String cremallera;

    //CONSTRUCTOR
    
    public void botasClass() {
        this.caña = "";
        this.tacon = "";
        this.plataforma = "";
        this.estilo = "";
        this.cremallera = "";
    }

    public void botasClass(String caña, String tacon, String plataforma, String estilo, String cremallera) {
        this.caña = "alta";
        this.tacon = "si";
        this.plataforma = "si";
        this.estilo = "impermeable";
        this.cremallera = "no";
    }
    
    //METODS
    
    public void impremeabilidad(){
        
    }
    
    public void subirEstatura(){
        
    }
    
    public void proporcionarCalor(){
        
    }
    
    //GETTERS AND SETTERS

    public String getCaña() {
        return caña;
    }

    public void setCaña(String caña) {
        this.caña = caña;
    }

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

    public String getCremallera() {
        return cremallera;
    }

    public void setCremallera(String cremallera) {
        this.cremallera = cremallera;
    }

}
