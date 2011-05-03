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

    @After
    public void tearDown() throws Exception {
    }
     */
    ArrayList<Integer> lista;

    @Before
    public void setUp() throws Exception {
        lista = new ArrayList<Integer>();
    }

    @Test
    public void umSlotRetornaEleMesmo() {
        lista.add(3);

        assertEquals(3, Dobra.faz_dobra(lista));
    }

    @Test
    public void doisSlotRetornaAUniaoDeles() {
        lista.add(3);
        lista.add(7);

        assertEquals(37, Dobra.faz_dobra(lista));
    }

    @Test
    public void tresSlotRetornaASoma() {
        lista.add(3);
        lista.add(7);
        lista.add(9);

        assertEquals(36, Dobra.faz_dobra(lista));
    }

    @Test
    public void quatroSlotRetornaASoma() {
        lista.add(3);
        lista.add(7);
        lista.add(9);
        lista.add(4);

        assertEquals(76, Dobra.faz_dobra(lista));
    }

    @Test
    public void cincoSlotRetornaASoma() {
        lista.add(3);
        lista.add(7);
        lista.add(9);
        lista.add(4);
        lista.add(6);

        assertEquals(36, Dobra.faz_dobra(lista));
    }

    @Test
    public void seisSlotRetornaASoma() {
        lista.add(3);
        lista.add(7);
        lista.add(9);
        lista.add(4);
        lista.add(6);
        lista.add(8);

        assertEquals(16, Dobra.faz_dobra(lista));
    }

}
