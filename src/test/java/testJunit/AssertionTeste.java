package testJunit;

import com.example.crudjava.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionTeste {
    @Test
    public void validarLançamento(){
        int[] primeiroLançamento = {10, 20, 30, 40,50};
        int[] segundoLançamento = {10, 20, 30, 40,50};
        //Comparando Array
        Assertions.assertArrayEquals(primeiroLançamento, segundoLançamento);
    }
    @Test
    public void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
        pessoa = new Pessoa("David", 23);
        Assertions.assertNotNull(pessoa);
    }
    @Test
    public void validarNumerosdeTiposDiferentes(){
        double valor = 5.0;
        double outrValor= 5.0;
        Assertions.assertEquals(valor, outrValor);
    }
}
