package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("BEM VINDO AO BOOTCAMP JAVA/DIO! ");
        System.out.println();
        System.out.println("MÓDULO 1: CONHECENDO A LINGUAGEM DE PROGRAMAÇÃO JAVA");
        System.out.println();

        Curso curso1 = new Curso();
        curso1.setTitulo("Aprendendo a sintaxe JAVA");
        curso1.setDescricao("Conhecendo a estrutura java");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("Lógica JAVA");
        curso2.setDescricao("Conhecendo lógica em Java");
        curso2.setCargaHoraria(2);

        Curso curso3 = new Curso();
        curso3.setTitulo("Estruturas de dados JAVA");
        curso3.setDescricao("conhecendo as estruturas de dados JAVA");
        curso3.setCargaHoraria(9);

        Curso curso4 = new Curso();
        curso4.setTitulo("Métodos JAVA");
        curso4.setDescricao("conhecendo os metodos em Java");
        curso4.setCargaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Piramide de testes e TDD");
        mentoria1.setDescricao("aprendendo a realizar testes");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Solid e boas práticas");
        mentoria2.setDescricao("aprendendo sobre solid e boas práticas");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(curso4);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("BOOTCAMP JAVA/DIO");
        bootcampJava.setDescricao("IMERSÃO NO MUNDO JAVA, UM SALTO NA SUA CARREIRA DE DEV.");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(curso3);
        bootcampJava.getConteudos().add(mentoria2);
        bootcampJava.getConteudos().add(curso4);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcampJava);
        System.out.println("Aluno(a):" + devCarlos.getNome());
        System.out.println("Cursos deste aluno:" + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("Parabens, você está avancando no BOOTCAMP!");

        System.out.println("Cursos deste aluno:" + devCarlos.getConteudosInscritos());
        System.out.println("Cursos concluidos:" + devCarlos.getConteudosConcluidos());
        System.out.println("Total XP:" + devCarlos.calcularTotalXp());

        System.out.println("===============================================================");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcampJava);
        System.out.println("Aluno(a):" + devMaria.getNome());
        System.out.println("Cursos deste aluno:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Parabens, você está avancando no BOOTCAMP!");

        System.out.println("Cursos deste aluno:" + devMaria.getConteudosInscritos());
        System.out.println("Cursos concluidos:" + devMaria.getConteudosConcluidos());
        System.out.println("Total XP:" + devMaria.calcularTotalXp());

        System.out.println("===============================================================");

        Dev devGama = new Dev();
        devGama.setNome("Gama");
        devGama.inscreverBootcamp(bootcampJava);
        System.out.println("Aluno(a):" + devGama.getNome());
        System.out.println("Cursos deste aluno:" + devGama.getConteudosInscritos());
        devGama.progredir();
        devGama.progredir();
        devGama.progredir();
        devGama.progredir();
        devGama.progredir();
        System.out.println("Parabens, você está avancando no BOOTCAMP!");

        System.out.println("Cursos deste aluno:" + devGama.getConteudosInscritos());
        System.out.println("Cursos concluidos:" + devGama.getConteudosConcluidos());
        System.out.println("Total XP:" + devGama.calcularTotalXp());

        System.out.println("===============================================================");

        Dev devDanilo = new Dev();
        devDanilo.setNome("Danilo");
        devDanilo.inscreverBootcamp(bootcampJava);
        System.out.println("Aluno(a):" + devDanilo.getNome());
        System.out.println("Cursos deste aluno:" + devDanilo.getConteudosInscritos());
        devDanilo.progredir();
        devDanilo.progredir();
        devDanilo.progredir();
        devDanilo.progredir();
        devDanilo.progredir();
        devDanilo.progredir();
        System.out.println("Parabens, você está avancando no BOOTCAMP!");

        System.out.println("Cursos deste aluno:" + devDanilo.getConteudosInscritos());
        System.out.println("Cursos concluidos:" + devDanilo.getConteudosConcluidos());
        System.out.println("Total XP:" + devDanilo.calcularTotalXp());

        System.out.println("PARABENS! VOCÊ CONCLUIU O BOOTCAMP!");

    }

}