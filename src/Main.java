import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javinha");
        curso2.setDescricao("Descrição do curso Javinha");
        curso2.setCargaHoraria(10);

       // System.out.println(curso1);
        //System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJulio = new Dev();
        devJulio.setNome("Julio");
        devJulio.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Incritos Julio: " + devJulio.getConteudosInscritos());
        devJulio.progredir();
        devJulio.progredir();
        System.out.println("conteudos Concluidos Julio: " + devJulio.getConteudosConcluidos());

        Dev devGabs = new Dev();
        devGabs.setNome("gabs");
        devGabs.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Incritos Gabs: " + devGabs.getConteudosInscritos());
        devGabs.progredir();
        System.out.println("conteudos Concluidos Gabs: " + devGabs.getConteudosConcluidos());

    }

}