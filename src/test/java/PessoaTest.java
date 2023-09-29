import org.example.Pessoa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @DisplayName("Testa se o método 'valido' retorna true")
    @Test
    void t1(){
        pessoa.setId(1);
        pessoa.setNome("Amanda");
        assertTrue(pessoa.valido());
    }

    @DisplayName("Testa se o método 'valido' retorna false quando os dois campos estão incorretos")
    @Test
    void t2(){
        pessoa.setId(0);
        pessoa.setNome("");
        assertFalse(pessoa.valido());
    }

    @DisplayName("Testa se o método 'valido' retorna false quando nome está vazio")
    @Test
    void t3(){
        pessoa.setId(1);
        pessoa.setNome("");
        assertFalse(pessoa.valido());
    }

    @DisplayName("Testa se o método 'valido' retorna false quando o id é 0")
    @Test
    void t4(){
        pessoa.setId(0);
        pessoa.setNome("Joana");
        assertFalse(pessoa.valido());
    }
}