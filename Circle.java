package com.anusha.shape;
public class Circle1 extends Shape {
    Circle(int dim1, int dim2){
        super(dim1,-1, -1); //giving -1 in order to make it false operator
    }
    public double area(){
        return Math.PI*this.dim1 * this.dim1;
    }
    public double volume(){
        return Math.PI*this.dim1*this.dim1*this.dim1;
    }
    
}

