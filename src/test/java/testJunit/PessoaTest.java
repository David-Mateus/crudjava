package testJunit;

import com.example.crudjava.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    public void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa("David", 23);
        Assertions.assertEquals(23, pessoa.getIdade());
    }

    @Test
    public void deveRetornaSeEhMaiordeIdade(){
        Pessoa pessoa = new Pessoa("Shi", 25);
        Assertions.assertTrue(pessoa.ehMaior());

        Pessoa pessoa2 = new Pessoa("Shi", 5);
        Assertions.assertFalse(pessoa2.ehMaior());
    }
}
