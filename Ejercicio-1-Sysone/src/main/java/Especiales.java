public class Especiales extends Barco {

        private int potencia;
        private int camarotes;
        private int mastiles;
        static final String tipo = "Especial";

        public Especiales(int eslora, int matricula, int añoFabricacion, int potencia, int camarotes, int mastiles){
            super(eslora, matricula, añoFabricacion, tipo);
            this.potencia = potencia;
            this.camarotes = camarotes;
            this.mastiles = mastiles;
        }
}
