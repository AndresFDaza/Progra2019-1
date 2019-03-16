package zapamain;

public class zapatosClass {


        private String suela;
        private String marca;
        private String material;
        private int talla;
        private String accesorios;
        private String cordones;

        //CONSTRUCTOR
        
        public void zapatosClass() {
            this.suela = "";
            this.marca = "";
            this.material = "";
            this.talla = 0;
            this.accesorios = "";
            this.cordones = "";
        }

        public void zapatosClass(String suela, String marca, String material, int talla, String accesorios, String cordones) {
            this.suela = "Goma";
            this.marca = "adidas";
            this.material = "tela";
            this.talla = 0;
            this.accesorios = "malla";
            this.cordones = "si";
        }

        //METODS
        
        public void proteger(){
            
        }
        
        public void combinar(){
            
        }
        
        public void calzar(){
            System.out.println("Zapato Calzado");
        }
        
        //GETTERS AND SETTERS
        
        public String getSuela() {
            return suela;
        }

        public void setSuela(String suela) {
            this.suela = suela;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getTalla() {
            return talla;
        }

        public void setTalla(int talla) {
            this.talla = talla;
        }

        public String getAccesorios() {
            return accesorios;
        }

        public void setAccesorios(String accesorios) {
            this.accesorios = accesorios;
        }

        public String getCordones() {
            return cordones;
        }

        public void setCordones(String cordones) {
            this.cordones = cordones;
        }

}
