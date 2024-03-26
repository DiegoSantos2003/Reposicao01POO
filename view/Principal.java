package view;

import model.Professor;
import model.ProfessorHorista;
import model.ProfessorTitular;

public class Principal {
    public static void main(String[] args) {
        // Exemplo de uso
        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setAnosInstituicao(10);
        professorTitular.setSalario(5000.0);

        ProfessorHorista professorHorista = new ProfessorHorista();
        professorHorista.setHorasAula(40);
        professorHorista.setValorHoraAula(50.0);

        double salarioProfessorTitular = professorTitular.calcSalario();
        System.out.println("Salário do Professor Titular: R$" + salarioProfessorTitular);

        double salarioProfessorHorista = professorHorista.calcSalario();
        System.out.println("Salário do Professor Horista: R$" + salarioProfessorHorista);
    }
}