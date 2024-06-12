
/**
 * Write a description of class Coordenada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coordenada
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class Coordenada
     */
    public Coordenada()
    {
        // initialise instance variables
        this.x = 0;
        this.y = 0;
    }
    
    public Coordenada(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }
    
    
    /**Metodo de acceso a la propiedad x*/
    public int getX(){
        return this.x;
    }//end method getX

    /**Metodo de modificación a la propiedad x*/
    public void setX(int x){
        this.x = x;
    }//end method setX

    /**Metodo de acceso a la propiedad y*/
    public int getY(){
        return this.y;
    }//end method getY

    /**Metodo de modificación a la propiedad y*/
    public void setY(int y){
        this.y = y;
    }//end method setY

}