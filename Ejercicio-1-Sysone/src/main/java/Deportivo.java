public class Deportivo extends Barco {

    public int potencia;
    static final String tipo = "Deportivo";

    public  Deportivo (int eslora, int matricula, int aņoFabricacion, int potencia){
        super(eslora, matricula, aņoFabricacion, tipo);
        this.potencia = potencia;
    }
}