public class Yate extends Barco {

    public int potencia;
    public int camarotes;
    static final String tipo = "Yate";

    public Yate (int eslora, int matricula, int aņoFabricacion, int potencia, int camarotes){
        super(eslora,matricula,aņoFabricacion, tipo);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
}