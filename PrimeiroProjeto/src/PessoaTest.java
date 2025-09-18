import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class PessoaTest {

    @Test
    public void testListaApenasMulheres() {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Maria", "F"),
            new Pessoa("Ana", "F"),
            new Pessoa("Joana", "F")
        );

        boolean apenasMulheres = verificarApenasMulheres(pessoas);
        Assert.assertTrue(apenasMulheres);
    }

    @Test
    public void testListaMista() {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Maria", "F"),
            new Pessoa("João", "M"),
            new Pessoa("Ana", "F")
        );

        boolean apenasMulheres = verificarApenasMulheres(pessoas);
        Assert.assertFalse(apenasMulheres);
    }

    private boolean verificarApenasMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .allMatch(pessoa -> "F".equalsIgnoreCase(pessoa.getGenero()));
    }
}
