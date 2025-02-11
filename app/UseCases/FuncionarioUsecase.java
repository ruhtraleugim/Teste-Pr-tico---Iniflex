package app.UseCases;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import app.Domain.FuncionarioDomain;

public class FuncionarioUsecase {
    private final BigDecimal salarioMinimo = BigDecimal.valueOf(1212);
    private final List<FuncionarioDomain> funcionarios = new ArrayList<FuncionarioDomain>(); 

    public void criarFuncionario(FuncionarioDomain funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void excluirFuncionario(String nome, LocalDate aniversario){
        funcionarios.removeIf(funcionario -> funcionario.getNome()
                                                                        .equals(nome) && funcionario
                                                                        .getDataNascimento()
                                                                        .equals(aniversario));
    }
    
    public void aumentarSalario(BigDecimal aumento){
        funcionarios.forEach(funcionario -> funcionario.setSalario(
            funcionario.getSalario().multiply(aumento)
            ));
    }

    public List<FuncionarioDomain> listarFuncionarios(){
        return new ArrayList<>(funcionarios);
    }

    public List<FuncionarioDomain> buscarFuncionariosDataDeAniversario(int dia){


        return funcionarios.stream().filter(funcionario -> funcionario.getDataNascimento().getDayOfMonth() == dia).toList();
    }

    public Optional<FuncionarioDomain> buscarFuncionarioMaisVelho(){
         return funcionarios.stream().min(Comparator.comparing(FuncionarioDomain::getDataNascimento));
    }

    public List<FuncionarioDomain> listarFuncionariosPorOrdemAlfabetica(){
        funcionarios.sort((func1, func2) -> func1.getNome().compareTo(func2.getNome()));
        return funcionarios;
    }

    public BigDecimal somaSalario(){
        BigDecimal salarioTotal = BigDecimal.ZERO;

        for (FuncionarioDomain funcionario : funcionarios){
            salarioTotal = salarioTotal.add(funcionario.getSalario());
        }
        return salarioTotal;
    }


    public BigDecimal paraSalarioMinimo(BigDecimal salario){
        return salario.divide(salarioMinimo,2,RoundingMode.HALF_EVEN );
    }

    public void emSalariosMinimos(){
        funcionarios.stream().forEach(funcionario -> {
            System.out.println(funcionario.getNome()+"--"+ paraSalarioMinimo(funcionario.getSalario())+" salários mínimos");
        });
    }

    public void agruparPorFuncao(){
        Map<String, List<FuncionarioDomain>> funcionariosMap = funcionarios.stream()
                                                                                 .collect(Collectors.groupingBy(FuncionarioDomain::getFuncao));
        funcionariosMap.forEach((funcao,listaFuncionarios) -> {
            System.out.println("função " + funcao);
            listaFuncionarios.forEach(funcionario ->
                    System.out.println("    " + funcionario.getNome()));
        });

    }
}