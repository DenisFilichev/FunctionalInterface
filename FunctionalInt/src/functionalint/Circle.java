/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalint;

/**
 *
 * @author Denis
 */
public class Circle implements Mathematics{
    
    public double length (double r){
        double c = 2*Mathematics.p*r;
        return Mathematics.ceil(c);
    }
    
    public double square (double r){
        double s = Mathematics.p*Math.pow(r, 2);
        return Mathematics.ceil(s);
    }
    
    

    @Override
    public double calculate(double r) {
        return length(r);
    }
}
