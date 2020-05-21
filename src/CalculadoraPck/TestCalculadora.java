/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraPck;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Keons
 */
public class TestCalculadora {
    @Test
    public void TestSuma(){
        main calculadora = new main();
        assertEquals(4,calculadora.suma(2, 2));
    }
    @Test
    public void TestResta(){
        main calculadora = new main();
        assertEquals(3,calculadora.resta(5, 2));
    }
    @Test
    public void TestDivision(){
        main calculadora = new main();
        assertEquals(5,calculadora.division(10, 2));
    }
    @Test
    public void TestMultiplicacion(){
        main calculadora = new main();
        assertEquals(8,calculadora.multiplicacion(4, 2));
    }
    @Test
    public void TestSuma2(){
        main calculadora = new main();
        assertEquals(15,calculadora.suma(10, 5));
    }
    @Test
    public void TestResta2(){
        main calculadora = new main();
        assertEquals(-4,calculadora.resta(4, 8));
    }
    @Test
    public void TestDivision2(){
        main calculadora = new main();
        assertEquals(100/3,calculadora.division(100, 3));
    }
    @Test
    public void TestMultiplicacion2(){
        main calculadora = new main();
        assertEquals(18,calculadora.multiplicacion(9, 2));
    }
    
}
