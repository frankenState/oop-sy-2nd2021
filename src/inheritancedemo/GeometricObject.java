/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;
import java.util.Date;
/**
 *
 * @author frank lou
 */
public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;
    
    
    
    protected GeometricObject(){
        this("", false);
    }
    
    protected GeometricObject(String color, boolean filled){
        this.dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    public String getColor(boolean hex){
        return !hex ? this.getColor() : "#fc3030";
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public abstract String toString();
    
}
