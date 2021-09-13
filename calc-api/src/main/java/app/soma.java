package app;

import io.jooby.annotations.GET;
import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

public class Soma {
    
    @Path("/soma/{op1}/{op2}")
    @GET
    public String rotaSoma(@PathParam String op1, @PathParam String op2){

        try {
            
            double numero1 = Double.parseDouble(op1);
            double numero2 = Double.parseDouble(op2);
            double soma = numero1 + numero2;
            
            return Double.toString(soma);
            
        } catch (NumberFormatException nfe) {

            throw new BadRequestException(String.format("Parâmetros inválidos: \\%s\\%s", op1, op2));
        }
        
    }
}