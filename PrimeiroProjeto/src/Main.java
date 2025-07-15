import anotacoes.Tabela;
import modelos.Cliente;

public class Main {
    public static void main(String[] args) {
        Class<Cliente> clazz = Cliente.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.nome());
        } else {
            System.out.println("A anotação @Tabela não está presente.");
        }
    }
}