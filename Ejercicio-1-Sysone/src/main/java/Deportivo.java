public class Deportivo extends Barco {

    public int potencia;
    static final String tipo = "Deportivo";

    public  Deportivo (int eslora, int matricula, int a�oFabricacion, int potencia){
        super(eslora, matricula, a�oFabricacion, tipo);
        this.potencia = potencia;
    }
}