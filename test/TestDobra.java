import java.util.ArrayList;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import dobra.Dobra;

/**
 *
 * @author Grupo 1
 */

public class TestDobra extends Assert {
    
    ArrayList<Integer> lista;

    @Before
    public void setUp() throws Exception {
        lista = new ArrayList<Integer>();
    }

    @Test
    public void umSlotRetornaEleMesmo() {
        lista.add(3);

        assertEquals(3, Dobra.fazDobra(lista));
    }

    @Test
    public void doisSlotRetornaAUniaoDeles() {
        lista.add(3);
        lista.add(7);

        assertEquals(37, Dobra.fazDobra(lista));
    }

    @Test
    public void tresSlotRetornaASoma() {
        lista.add(3);
        lista.add(7);
        lista.add(9);

        assertEquals(36, Dobra.fazDobra(lista));
    }

    @Test
    public void quatroSlotRetornaASoma() {
        lista.add(3);
        lista.add(7);
        lista.add(9);
        lista.add(4);

        assertEquals(76, Dobra.fazDobra(lista));
    }

    @Test
    public void cincoSlotRetornaASoma() {
        lista.add(3);
        lista.add(7);
        lista.add(9);
        lista.add(4);
        lista.add(6);

        assertEquals(36, Dobra.fazDobra(lista));
    }

    @Test
    public void seisSlotRetornaASoma() {
        lista.add(3);
        lista.add(7);
        lista.add(9);
        lista.add(4);
        lista.add(6);
        lista.add(8);

        assertEquals(16, Dobra.fazDobra(lista));
    }

}
