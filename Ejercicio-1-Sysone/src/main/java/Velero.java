public class Velero extends Barco {

    public int mastil;
    static final String tipo = "Velero";

    public Velero(int eslora, int matricula, int aņoFabricacion, int mastil){
        super(eslora, matricula, aņoFabricacion,tipo);
        this.mastil = mastil;
    }
}
