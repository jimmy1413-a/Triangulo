
/**
 * Write a description of class Color here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Color {
    // instance variables - replace the example below with your own
    private int r;
    private int g;
    private int b;
    
    public Color(){
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }
    
    public Color(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }


    /**Metodo de acceso a la propiedad r*/
    public int getR(){
        return this.r;
    }//end method getR

    /**Metodo de modificación a la propiedad r*/
    public void setR(int r){
        this.r = r;
    }//end method setR

    /**Metodo de acceso a la propiedad g*/
    public int getG(){
        return this.g;
    }//end method getG

    /**Metodo de modificación a la propiedad g*/
    public void setG(int g){
        this.g = g;
    }//end method setG

    /**Metodo de acceso a la propiedad b*/
    public int getB(){
        return this.b;
    }//end method getB

    /**Metodo de modificación a la propiedad b*/
    public void setB(int b){
        this.b = b;
    }//end method setB

}