/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
//clas Square
public class Square extends Rectangle {
    protected double side = 1.0;
    //Constructor
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(String color,boolean filled,double side) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }
    //Getter va setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //toString
    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
}
