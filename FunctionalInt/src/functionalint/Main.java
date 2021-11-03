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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.innerClass(); //реализация вложенного класса
        main.anonimClass(); //реазизация анонимного класса
        main.staticMeth(); //реализация статического метода
        main.methodClass(); //реализация метода экземпляра
        main.lamba(); //реализация лямбды
    }
    
    //Метода вызывающий методы вложенного класса
    private void innerClass(){
        Inner inner = new Inner();
        System.out.println("-----------------------------------------------");
        System.out.println("Вложенный класс:");
        System.out.println("Длина окружности:" + inner.calculate());
    }
    
    //Метод вызывающий методы анонимного класса
    private void anonimClass (){
        Mathematics mathematics = new Mathematics() {
            @Override
            public double calculate() {
                Circle circle = new Circle();
                return circle.length(50);
            }
        };
        System.out.println("-----------------------------------------------");
        System.out.println("Анонимный класс:");
        System.out.println("Площадь окружности: " + Mathematics.ceil(mathematics.calculate()));
    }
    
    private void staticMeth (){
        double l = Mathematics.staticMethod();
        System.out.println("-----------------------------------------------");
        System.out.println("Статический метод:");
        System.out.println("Длина окружности:" + l);
    }
    
    private void methodClass (){
        Mathematics math = new Circle();
        System.out.println("-----------------------------------------------");
        System.out.println("Метод экземпляра:");
        System.out.println("Длина окружности:" + math.calculate());
        
    }
    
    private void lamba(){
        Mathematics mathematics = () -> {
            Circle circle = new Circle();
            return circle.length(50);
        };
        System.out.println("-----------------------------------------------");
        System.out.println("Лямбда :");
        System.out.println("Длина окружности:" + mathematics.calculate());
    }
    
    private class Inner implements Mathematics{

        @Override
        public double calculate() {
            Circle circle = new Circle();
            return circle.length(50);
        }

    }
}
