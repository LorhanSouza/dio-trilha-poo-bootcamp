package src;

import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Conteudo;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Introducao ao Linux","Curso de introducao ao SO Linux para utilizacao de ferramentas do sistema", 40);

        Conteudo curso2 = new Curso("KaliLinux e ferramentas","Curso de introducao ao SO KaliLinux para utilizacao de ferramentas do sistema para deteccao e instrusao", 60);
    
        Conteudo mentoria1 = new Mentoria("Como utlizar ferramentas de intrusao no Kali","Mentoria sobre como utilizar de maneira assertiva as ferramentas de intrusao do KaliLinux");
    
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNomeBootcamp("Bootcamp Cybersecurity Santander");
        bootcamp.setDescricaoBootcamp("Descricao de Ciberseguranca tendo apoio do banco Santander");
        bootcamp.getConteudos().add(mentoria1); //pega o Set de Conteudos (vazio) e add nele o conteudo;
        bootcamp.getConteudos().add(curso1); //pega o Set de Conteudos (vazio) e add nele o conteudo;
        bootcamp.getConteudos().add(curso2); //pega o Set de Conteudos (vazio) e add nele o conteudo;
    
        Dev devLorhan = new Dev();
        devLorhan.setNomeDev("Lorhan");
        devLorhan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Lorhan" + devLorhan.getConteudosInscritos());
        devLorhan.progredir();
        devLorhan.progredir();
        devLorhan.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Lorhan" + devLorhan.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lorhan" + devLorhan.getConteudosConcluidos());
        System.out.println("XP"+ devLorhan.calcularTotalXP());
    
        System.out.println("-------------");
    
        Dev devMickele = new Dev();
        devMickele.setNomeDev("Mickele");
        devMickele.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Mickele" + devMickele.getConteudosInscritos());
        devMickele.progredir();
        devMickele.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Mickele" + devMickele.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Mickele" + devMickele.getConteudosConcluidos());
        System.out.println("XP"+ devMickele.calcularTotalXP());
    
    }
    
}
