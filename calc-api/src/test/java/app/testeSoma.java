package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testeSoma{
    @Test
    public void testeSomas(){
        Soma soma = new Soma();
        assertEquals(8, soma.rotaSoma(4,4));
    }; 
}