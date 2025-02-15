package app;

import app.Persistence.Funcionarios;
import app.UseCases.FuncionarioUsecase;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainAPP {
    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios();
        FuncionarioUsecase usecase = new FuncionarioUsecase();

        usecase.criarFuncionario(funcionarios.getF1());
        usecase.criarFuncionario(funcionarios.getF2());
        usecase.criarFuncionario(funcionarios.getF3());
        usecase.criarFuncionario(funcionarios.getF4());
        usecase.criarFuncionario(funcionarios.getF5());
        usecase.criarFuncionario(funcionarios.getF6());
        usecase.criarFuncionario(funcionarios.getF7());
        usecase.criarFuncionario(funcionarios.getF8());
        usecase.criarFuncionario(funcionarios.getF9());
        usecase.criarFuncionario(funcionarios.getF10());

        System.out.println(usecase.listarFuncionarios());
        System.out.println("************************"   );

        usecase.excluirFuncionario("João" , LocalDate.of(1990, 5, 12));

        System.out.println(usecase.listarFuncionarios());
        System.out.println("************************"   );

        //equivalente a um aumento de 10%
        usecase.aumentarSalario(new BigDecimal("1.10"));

        System.out.println(usecase.listarFuncionarios());
        System.out.println("************************"   );

        usecase.agruparPorFuncao();
        System.out.println("************************"   );

        System.out.println(usecase.buscarFuncionariosDataDeAniversario( 10  ));
        System.out.println(usecase.buscarFuncionariosDataDeAniversario( 12 ));
        System.out.println("************************"   );

        usecase.buscarFuncionarioMaisVelho().ifPresent(funcionario ->{
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    System.out.println(funcionario.getNome()+ "--" + funcionario.getDataNascimento().format(formatter));
        });

        System.out.println("************************"   );

        System.out.println(usecase.listarFuncionariosPorOrdemAlfabetica());;
        System.out.println("************************"   );

        System.out.println(usecase.somaSalario());
        System.out.println("************************"   );

        usecase.emSalariosMinimos();
        System.out.println("************************"   );
    }
}