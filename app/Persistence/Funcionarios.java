package app.Persistence;

import java.math.BigDecimal;
import java.time.LocalDate;

import app.Domain.FuncionarioDomain;

public class Funcionarios{

    private FuncionarioDomain f1 = new FuncionarioDomain("Maria", LocalDate.of(2000, 10, 18) , BigDecimal.valueOf(2009.44), "OPERADOR");

    private FuncionarioDomain f2 = new FuncionarioDomain("João", LocalDate.of(1990, 5, 12), BigDecimal.valueOf(2284.38), "OPERADOR");

    private FuncionarioDomain f3 = new FuncionarioDomain("Caio", LocalDate.of(1961, 5, 2), BigDecimal.valueOf(9836.14), "COORDENADOR");

    private FuncionarioDomain f4 = new FuncionarioDomain("Miguel", LocalDate.of(1988, 10, 14), BigDecimal.valueOf(19119.88), "DIRETOR");

    private FuncionarioDomain f5 = new FuncionarioDomain("Alice", LocalDate.of(1995, 1, 5), BigDecimal.valueOf(2234.68), "RECEPCIONISTA");

    private FuncionarioDomain f6 = new FuncionarioDomain("Heitor", LocalDate.of(1999, 11, 19), BigDecimal.valueOf(1582.72), "OPERADOR");

    private FuncionarioDomain f7 = new FuncionarioDomain("Arthur",LocalDate.of(1983, 3,31), BigDecimal.valueOf(4071.84), "CONTADOR");

    private FuncionarioDomain f8 = new FuncionarioDomain("Laura",LocalDate.of(1994, 7,8), BigDecimal.valueOf(3017.45), "GERENTE");

    private FuncionarioDomain f9 = new FuncionarioDomain("Heloisa",LocalDate.of(2003, 5,24), BigDecimal.valueOf(4071.84), "ELETRICISTA");

    private FuncionarioDomain f10 = new FuncionarioDomain("Helena",LocalDate.of(1983, 9,2), BigDecimal.valueOf(2799.93), "GERENTE");



    public FuncionarioDomain getF10() {
        return f10;
    }

    public FuncionarioDomain getF9() {
        return f9;
    }

    public FuncionarioDomain getF8() {
        return f8;
    }

    public FuncionarioDomain getF7() {
        return f7;
    }

    public FuncionarioDomain getF6() {
        return f6;
    }

    public FuncionarioDomain getF5() {
        return f5;
    }

    public FuncionarioDomain getF4() {
        return f4;
    }

    public FuncionarioDomain getF3() {
        return f3;
    }

    public FuncionarioDomain getF2() {
        return f2;
    }

    public FuncionarioDomain getF1() {
        return f1;
    }

}