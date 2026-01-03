import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("descrição curso java");

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setCargaHoraria(4);
        curso1.setDescricao("descrição curso javascript");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setTitulo("mentoriaaaaaaa");


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodigo" + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Rodigo" + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rodigo" + devRodrigo.getConteudosConcluidos());
        System.out.println("XP:" + devRodrigo.calcularTotalXp());

        System.out.println("-------------------------------------");

        Dev devSrFulano = new Dev();
        devSrFulano.setNome("Sr. Fulano");
        devSrFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sr Fulano" + devSrFulano.getConteudosInscritos());
        devSrFulano.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Sr Fulano" + devSrFulano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Sr Fulano" + devRodrigo.getConteudosConcluidos());
        System.out.println("XP:" + devSrFulano.calcularTotalXp());

    }
}
