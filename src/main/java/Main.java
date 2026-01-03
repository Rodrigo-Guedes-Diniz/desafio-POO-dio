import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("descrição curso java");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setTitulo("mentoriaaaaaaa");

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}
