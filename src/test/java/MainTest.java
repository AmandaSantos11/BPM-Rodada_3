import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @DisplayName("Testa se o método 'main' retorna a saída esperada")
    @Test
    void t1() throws Exception{
        ByteArrayOutputStream capturaASaidaDoConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(capturaASaidaDoConsole));

        String saidaEsperada = "3\n0";

        Main.main(new String[0]);

        assertEquals(saidaEsperada.replaceAll("\\r?\\n", ""),capturaASaidaDoConsole.toString().trim().replaceAll("\\r?\\n", ""));
    }
}