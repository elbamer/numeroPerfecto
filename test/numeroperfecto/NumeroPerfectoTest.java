/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroperfecto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elbam
 */
public class NumeroPerfectoTest {
    
    public NumeroPerfectoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of validar method, of class NumeroPerfecto.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
       
        //assertEquals(expResult, result);
        assertEquals(true, NumeroPerfecto.validar(6));
        assertEquals(false, NumeroPerfecto.validar(5));
        assertFalse(true== NumeroPerfecto.validar(5));
       
    }

    /**
     * Test of main method, of class NumeroPerfecto.
     */
    //@Test
    /*public void testMain() {
        System.out.println("main");
        String[] args = null;
        NumeroPerfecto.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
