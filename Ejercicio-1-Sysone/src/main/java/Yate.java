public class Yate extends Barco {

    public int potencia;
    public int camarotes;
    static final String tipo = "Yate";

    public Yate (int eslora, int matricula, int a�oFabricacion, int potencia, int camarotes){
        super(eslora,matricula,a�oFabricacion, tipo);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
}