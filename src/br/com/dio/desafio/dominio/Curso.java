package src.br.com.dio.desafio.dominio;
public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(){
        super();
        this.cargaHoraria = 0;
    }

    public Curso(String titulo, String descricao, int cargaHoraria){
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    /*Funcao que multiplica a carga horaria com o XP_PADRAO por conclusao do curso */
    public double calcularXP(){
        return XP_PADRAO * this.cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [getCargaHoraria()=" + this.getCargaHoraria() + ", getTitulo()=" + super.getTitulo() + ", getDescricao()="
                + super.getDescricao() + "]";
    }
}
