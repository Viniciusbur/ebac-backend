import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaTest {

    @Test
    public void testListaApenasMulheres() {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Maria", "Feminino"),
            new Pessoa("Ana", "Feminino"),
            new Pessoa("Joana", "Feminino")
        );

        boolean apenasMulheres = verificarApenasMulheres(pessoas);
        assertTrue(apenasMulheres);
        System.out.println("testListaApenasMulheres passou");
    }

    @Test
    public void testListaMista() {
        List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Maria", "Feminino"),
            new Pessoa("João", "Masculino"),
            new Pessoa("Ana", "Feminino")
        );

        boolean apenasMulheres = verificarApenasMulheres(pessoas);
        assertFalse(apenasMulheres);
        System.out.println("testListaMista passou");
    }

    public boolean verificarApenasMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .allMatch(pessoa -> pessoa.getGenero().equalsIgnoreCase("Feminino"));
    }
}
