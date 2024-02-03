package com.anusha.shape;
public class Rectangle extends Shape {
    Rectangle(int dim1, int dim2, int height){
        super(dim1, dim2, height);
    }
    public int area(){
        return this.dim1*this.dim2;
    }
    public int volume(){
        return this.dim1*this.dim2*this.height;
    }
    
}
