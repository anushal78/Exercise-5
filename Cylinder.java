package com.anusha.shape;
public class Cylinder1 extends Shape {
    Cylinder1(int dim1){
        super(dim1, -1); 
    }
    public double area(){
        return 2*Math.PI*this.dim1*(this.dim2+this.dim1);
    }
    public double volume(){
        return Math.PI*this.dim1*this.dim1*this.height;
    }
    
}
