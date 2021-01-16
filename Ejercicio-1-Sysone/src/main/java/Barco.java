public abstract class Barco {

    public int eslora;
    public int matricula;
    public int añoFabricacion;
    public String tipo;

    public Barco(int eslora, int matricula, int añoFabricacion, String tipo){

        this.eslora = eslora;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
        this.tipo = tipo;
    }

    public int Eslora(){
        return this.eslora;
    }

    public int Matricula(){
        return this.matricula;
    }
}