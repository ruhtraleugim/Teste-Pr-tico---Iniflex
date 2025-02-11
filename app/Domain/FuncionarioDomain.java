package app.Domain;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FuncionarioDomain extends PessoaDomain {

    private BigDecimal salario;
    private String funcao;

    public FuncionarioDomain(String nome, LocalDate dataNascimento, BigDecimal salario,String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    @Override
    public String toString() {
        NumberFormat formatadorSalario = NumberFormat.getCurrencyInstance();
        String salarioFormatado = formatadorSalario.format(salario);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataNascimento.format(formatter);

        return "nome=" + nome + ", dataNascimento=" + dataFormatada + ", salario=" + salarioFormatado
                + ", funcao=" + funcao ;
    }
}