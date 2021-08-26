/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalsystem1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        MovieRental arg = new MovieRental(new Movie("Dumbo", 20), 1);
        Customer instance = new Customer("Jose");
        instance.addMovieRental(arg);
        assertTrue(instance.getMovieRentals().size()>0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        VideoGameRental arg = new VideoGameRental(new WiiGame("Mario"), 18,true);
        Customer instance = new Customer("Jose");
        instance.addVideoGameRental(arg);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getVideoGameRental().size()>0);
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = new Customer("Jose");
        String expResult = "Rental Record for " +instance._name+"\n" +
          "Amount owed is 0.0\n" +
           "You earned 0 frequent renter points";
        String result = instance.statement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
