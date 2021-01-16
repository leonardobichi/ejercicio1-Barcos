public abstract class Barco {

    public int eslora;
    public int matricula;
    public int aņoFabricacion;
    public String tipo;

    public Barco(int eslora, int matricula, int aņoFabricacion, String tipo){

        this.eslora = eslora;
        this.matricula = matricula;
        this.aņoFabricacion = aņoFabricacion;
        this.tipo = tipo;
    }

    public int Eslora(){
        return this.eslora;
    }

    public int Matricula(){
        return this.matricula;
    }
}