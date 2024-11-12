package src.br.com.dio.desafio.dominio;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nomeBootcamp;
    private String descricaoBootcamp;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = this.dataInicial.plusDays(45);
    public Set<Dev> devsInscritos;
    public Set<Conteudo> conteudos;

    public Bootcamp(){
        this.nomeBootcamp = "";
        this.descricaoBootcamp = "";
        this.devsInscritos = new LinkedHashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    public Bootcamp(String nome, String descricao){
        this.nomeBootcamp = nome;
        this.descricaoBootcamp = descricao;
        this.devsInscritos = new LinkedHashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    public String getNomeBootcamp() {
        return nomeBootcamp;
    }

    public void setNomeBootcamp(String nomeBootcamp) {
        this.nomeBootcamp = nomeBootcamp;
    }

    public String getDescricaoBootcamp() {
        return descricaoBootcamp;
    }

    public void setDescricaoBootcamp(String descricaoBootcamp) {
        this.descricaoBootcamp = descricaoBootcamp;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeBootcamp == null) ? 0 : nomeBootcamp.hashCode());
        result = prime * result + ((descricaoBootcamp == null) ? 0 : descricaoBootcamp.hashCode());
        result = prime * result + ((dataInicial == null) ? 0 : dataInicial.hashCode());
        result = prime * result + ((dataFinal == null) ? 0 : dataFinal.hashCode());
        result = prime * result + ((devsInscritos == null) ? 0 : devsInscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
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
        Bootcamp other = (Bootcamp) obj;
        if (nomeBootcamp == null) {
            if (other.nomeBootcamp != null)
                return false;
        } else if (!nomeBootcamp.equals(other.nomeBootcamp))
            return false;
        if (descricaoBootcamp == null) {
            if (other.descricaoBootcamp != null)
                return false;
        } else if (!descricaoBootcamp.equals(other.descricaoBootcamp))
            return false;
        if (dataInicial == null) {
            if (other.dataInicial != null)
                return false;
        } else if (!dataInicial.equals(other.dataInicial))
            return false;
        if (dataFinal == null) {
            if (other.dataFinal != null)
                return false;
        } else if (!dataFinal.equals(other.dataFinal))
            return false;
        if (devsInscritos == null) {
            if (other.devsInscritos != null)
                return false;
        } else if (!devsInscritos.equals(other.devsInscritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }
}
