public class Velero extends Barco {

    public int mastil;
    static final String tipo = "Velero";

    public Velero(int eslora, int matricula, int a�oFabricacion, int mastil){
        super(eslora, matricula, a�oFabricacion,tipo);
        this.mastil = mastil;
    }
}
