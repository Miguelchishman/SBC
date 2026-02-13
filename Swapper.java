
package com.mycompany.swapper;

public class Swapper {
    private float x;
    private float y;
    
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    
    public void setX(float x){
        this.x = x;
    }
    
    public void setY(float y){
        this.y = y;
    }
    
    public void swap(){
        float temp = this.x;
        this.x = this.y;
        this.y = temp;
    }
}
