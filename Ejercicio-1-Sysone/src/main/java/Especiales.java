public class Especiales extends Barco {

        private int potencia;
        private int camarotes;
        private int mastiles;
        static final String tipo = "Especial";

        public Especiales(int eslora, int matricula, int aņoFabricacion, int potencia, int camarotes, int mastiles){
            super(eslora, matricula, aņoFabricacion, tipo);
            this.potencia = potencia;
            this.camarotes = camarotes;
            this.mastiles = mastiles;
        }
}
