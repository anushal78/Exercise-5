package com.anusha.shape;
public class Sphere1 extends Shape {
    Sphere(int dim1, int dim2){
        super(dim1, dim2, -1);
    }
    public double area(){
        return 4*Math.PI*this.dim1*this.dim1;
    }
    public double volume(){
        return 1.3*Math.PI*this.dim1*this.dim1*this.dim1;
    }
    
}

