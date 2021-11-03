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
@FunctionalInterface
public interface Mathematics {
    static double p = 3.14;
    static double e = 2.718;
    
    public double calculate ();
    
    static double ceil (double number){
        int x = 5;
        return Math.ceil(number*Math.pow(10, x))*Math.pow(10, -x);
    }
    
    static double staticMethod (){
        Circle circle = new Circle();
        return circle.length(50);
    }
    
    //Метод можно вызвать только если есть экземпляр класса,
    //реализующего интерфейс Mathematics
    default double staticMethod2 (){
        Circle circle = new Circle();
        return circle.length(50);
    }
}
