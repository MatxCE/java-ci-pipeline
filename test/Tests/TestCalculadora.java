/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;


import org.junit.Test;
import static org.junit.Assert.*;
import CalculadoraPck.main;

/**
 *
 * @author Keons
 */
public class TestCalculadora {
    main calculadora = new main();
   @Test
   public void TestSuma(){
       assertEquals(4,calculadora.suma(2, 2));
   }
   @Test
   public void TestResta(){
       assertEquals(3,calculadora.resta(5, 2));
   }
   @Test
   public void TestDivision(){
       assertEquals(5,calculadora.division(10, 2));
   }
   @Test
   public void TestMultiplicacion(){
       assertEquals(8,calculadora.multiplicacion(4, 2));
   }
   @Test
   public void TestSuma2(){
       assertEquals(15,calculadora.suma(10, 5));
   }
   @Test
   public void TestResta2(){
       assertEquals(-4,calculadora.resta(4, 8));
   }
   @Test
   public void TestDivision2(){
       assertEquals(100/3,calculadora.division(100, 3));
   }
   @Test
   public void TestMultiplicacion2(){
       assertEquals(18,calculadora.multiplicacion(9, 2));
   }
    
}
