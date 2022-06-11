/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Antes de todos");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Despois de todos");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("Despois de todos");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Despois de cada un");
    }
    @Test
    public void test1() {
    System.out.println("test 1");
    assertTrue(1==1);
    }

    @Test
    public void test2() {
    System.out.println("test2");
    assertTrue(2==2);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
