package src.br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate dataDaMentoria;
    
    public Mentoria() {
        super();
        this.dataDaMentoria = null;
    }

    public Mentoria(String titulo, String descricao){
        super(titulo,descricao);
        this.dataDaMentoria = LocalDate.now();
    }

    /*Funcao que soma 20 de XP ao XP_PADRAO por conclusao do curso */
    public double calcularXP(){
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataDaMentoria() {
        return dataDaMentoria;
    }
    public void setDataDaMentoria(LocalDate dataDaMentoria) {
        this.dataDaMentoria = dataDaMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria [getDataDaMentoria()=" + getDataDaMentoria() + ", getTitulo()=" + getTitulo()
                + ", getDescricao()=" + getDescricao() + "]";
    }
}
