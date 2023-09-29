import org.example.Pessoa;
import org.example.Turma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {
    Turma turma;

    @BeforeEach
    void setUp() {
        turma = new Turma();
    }

    @DisplayName("Testa se o método 'adicionarPessoa' retorna true")
    @Test
    void t1() throws Exception {
        Pessoa pessoa = new Pessoa(1,"Paulo");
        turma.adicionarPessoa(pessoa);
        assertEquals(1, turma.getPessoas().size());
    }

    @DisplayName("Testa se o método 'adicionarPessoa' retorna exceção quando adiciona uma pessoa inválida")
    @Test
    void t2(){
        Pessoa pessoa = new Pessoa(1,"");
        try{
            turma.adicionarPessoa(pessoa);
        }catch (Exception e){
            assertEquals("Objeto pessoa inválido", e.getMessage());
        }
    }

    @DisplayName("Testa se o método 'adicionarPessoa' retorna exceção quando adiciona a mesma pessoas duas vezes")
    @Test
    void t3(){
        Pessoa pessoa1 = new Pessoa(1,"Sandra");
        try{
            turma.adicionarPessoa(pessoa1);
            turma.adicionarPessoa(pessoa1);
        }catch (Exception e){
            assertEquals("Objeto pessoa já está atribuido a turma", e.getMessage());
        }
    }

    @DisplayName("Testa se o método 'removerTodasPessoas' retorna true")
    @Test
    void t4() throws Exception{
        Pessoa pessoa1 = new Pessoa(1,"Sandra");
        Pessoa pessoa2 = new Pessoa(2,"Enzo");

        turma.adicionarPessoa(pessoa1);
        turma.adicionarPessoa(pessoa2);

        turma.removerTodasPessoas();

        assertEquals(0, turma.getPessoas().size());
    }
}