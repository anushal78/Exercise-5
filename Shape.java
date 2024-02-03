// You have to create a package named com.codewithharry.shape
//  This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
//  These classes should use inheritance to properly manage the code!
//  Include methods like volume, surface area and getters/setters for dimensions

package com.anusha.shape;
public class Shape{
    int dim1, dim2, height;
    Shape(int dim1,int dim2, int height){
        this.dim1 = dim1; //dimension
        this.dim2 = dim2;
        this.height = height;
    }
    public int getDim1(){
        return this.dim1;
    }
    public int getDim2(){
        return this.dim2;
    } 
    public int getHeight(){
        return this.height;
    } 
    public void setDim1(){
        this.dim1 = dim1;
    }
    public void setDim2(){
        this.dim2 = dim2;
    } 
    public void setHeight(){
         this.height = height;
    }  
}

public static void main(String[] args) {
    
}