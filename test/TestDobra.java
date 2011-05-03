/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Assert;
import org.junit.Test;
import dobra.Dobra;

/**
 *
 * @author thiago
 */
//@RunWith(Suite.class)
//@Suite.SuiteClasses({})
public class TestDobra extends Assert {
    /*
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
     */

    @Test
    public void umSlotRetornaEleMesmo() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        assertEquals(3, Dobra.faz_dobra(lista));
    }

    @Test
    public void doisSlotRetornaAUniaoDeles() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(7);
        assertEquals(37, Dobra.faz_dobra(lista));
    }

    @Test
        public void tresSlotRetornaASoma() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(7);
        lista.add(9);
        assertEquals(9, Dobra.faz_dobra(lista));
    }
}
