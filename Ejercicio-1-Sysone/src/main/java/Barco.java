public abstract class Barco {

    public int eslora;
    public int matricula;
    public int a�oFabricacion;
    public String tipo;

    public Barco(int eslora, int matricula, int a�oFabricacion, String tipo){

        this.eslora = eslora;
        this.matricula = matricula;
        this.a�oFabricacion = a�oFabricacion;
        this.tipo = tipo;
    }

    public int Eslora(){
        return this.eslora;
    }

    public int Matricula(){
        return this.matricula;
    }
}