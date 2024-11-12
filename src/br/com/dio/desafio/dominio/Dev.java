package src.br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nomeDev;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Dev(){
        this.nomeDev = "";
        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    /**
     * Funcao que inscreve o DEV no bootcamp adicionando TODOS os conteudos (Cursos e Mentorias) como conteudos nos quais o DEV esta inscrito. Tambem adiciona o DEV como inscrito no bootcamp.
     * @param bootcamp Objeto da classe Bootcamp onde estao armazenados os dados do bootcamp
     */
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); //Adiciona todos os conteudos do bootcamp no conteudos Inscritos
        bootcamp.getDevsInscritos().add(this); //Adicionao ESTE DEV como dev inscrito no bootcamp
    }

    /*Funcao que encontra o primeiro conteudo (Curso ou Mentoria) no LinkedHashSet (Todos os conteudos organizados por ordem de adicao) e colocando em uma variavel Opcional. Apo isso testa se existe conteudo extraido e entao executa a adicao do conteudo  no Set de concluidos e exclui dos inscritos */
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get()); //Pega o conteudo do Optional
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Não tem inscricao em nenhum conteudo");
        }
    }
    /**
     * Funcao que acessa o Set de conteudos concluidos, coloca eles em uma stream (fluxo), mapeia todos os doubles (tipo da variavel XP) que saem da execucao das funcoes de calcular XP dos conteudos utilizando Reference Method (seja o conteudo Curso ou Mentoria) e soma todos os resultados das execucoes das funcoes no stream.
     * @return retorna a soma de todo o XP acumulado de todos os conteudos concluidos;
     */
    public double calcularTotalXP(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }

    public String getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(String nomeDev) {
        this.nomeDev = nomeDev;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeDev == null) ? 0 : nomeDev.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nomeDev == null) {
            if (other.nomeDev != null)
                return false;
        } else if (!nomeDev.equals(other.nomeDev))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }
}
