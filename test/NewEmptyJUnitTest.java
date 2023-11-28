/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import myMoonRover.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akash Bahri
 */
public class NewEmptyJUnitTest {
   
    public NewEmptyJUnitTest() {
    }
    
    public void print(String s){
    System.out.println(s);
    }
    
     @Test
     public void test()
     {
         Context context= new Context();
         MovingForward mf = new MovingForward();
         context.setSubstate("Accelerate Forward");
         assertEquals("Maximum Forward Speed",mf.leftPedalOnce(context, Boolean.TRUE));
         
     }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
