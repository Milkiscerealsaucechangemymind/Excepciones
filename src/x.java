/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bmguzmang
 */
public class x {

    public x() throws JaimeException{
        this.y(0);
    }
    
    int y(int divisor) throws JaimeException{
        if(divisor==0){
            throw new JaimeException("Divisor es cero");
        }
        return (5/divisor);
    }
    
}
