public class Estudante{

    public Estudante() {
    }

    public Estudante(String nome, int anoFormatura, double media){
        this.nome = nome;
        this.anoFormatura = anoFormatura;
        this.media = media;
    };

    public String nome;
    public int anoFormatura;
    public double media;

    public void setAnoFormatura(int anoFormatura){
        this.anoFormatura = anoFormatura;
    }
}
