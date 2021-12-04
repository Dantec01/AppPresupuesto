import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests{
    Calculadora calculadora;
    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora (-100,100);
    }
    @Test
    public void SetGetUpperLimit(){
        assertEquals(100, calculadora.getUpperLimit());
    } 
    @Test
    public void SetGetLimits(){
        assertEquals(100, calculadora.getUpperLimit());
        assertEquals(-100, calculadora.getLowerLimit());
    }   
    @Test
    public void SubstractExcedingLowerLimit(){
        try{
            int result = calculadora.substract(10,150);
            fail("Exception is not being thrown when "+"exceeding lower limit");
        }
        catch (Exception e){
            // Ok, the SUT works as expected
        }
    }  
    @Test 
    public void AddExcedingUpperLimit(){
        try{
            int result = calculadora.add(10,150);
            fail("This should fail: we're exceding upper limit");
        }catch(Exception e){
            //Ok, the SUT works as expected
        }
    }   
    /*@Test 
    public void ArgumentsExceedLimits(){
        try{
            calculator.add(calculator.getUpperLimit() + 1, calculator.getLowerLimit() -1);
            fail("This should fail: arguments exceed limits");
        }catch(Exception e){
            //Ok, this works
        }
    }*/
}