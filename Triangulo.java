
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo
{
    // instance variables - replace the example below with your own
    private Coordenada punto1;
    private Coordenada punto2;
    private Coordenada punto3;
    
    private Color relleno;
    private Color linea;

    /**
     * Constructor for objects of class Triangulo
     */
    public Triangulo()
    {
       this.punto1 = new Coordenada(50,50);
       this.punto2 = new Coordenada(50,300);
       this.punto3 = new Coordenada(200,300);
       this.relleno = new Color(0,0,0);
       this.linea = new Color(0,0,0);
    }
    
    public Triangulo(Coordenada punto1, Coordenada punto2, Coordenada punto3){
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.relleno = new Color(0,0,0);
        this.linea = new Color(0,0,0);
    }
    
    public Triangulo(Coordenada punto1, Coordenada punto2, Coordenada punto3, Color relleno){
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.relleno = relleno;
        this.linea = new Color(0,0,0);
    }
    
    public Triangulo(Coordenada punto1, Coordenada punto2, Coordenada punto3, Color relleno, Color linea){
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.relleno = relleno;
        this.linea = linea;
    }

    /**Metodo de acceso a la propiedad punto1*/
    public Coordenada getPunto1(){
        return this.punto1;
    }//end method getPunto1

    /**Metodo de modificación a la propiedad punto1*/
    public void setPunto1(Coordenada punto1){
        this.punto1 = punto1;
    }//end method setPunto1

    /**Metodo de acceso a la propiedad punto2*/
    public Coordenada getPunto2(){
        return this.punto2;
    }//end method getPunto2

    /**Metodo de modificación a la propiedad punto2*/
    public void setPunto2(Coordenada punto2){
        this.punto2 = punto2;
    }//end method setPunto2

    /**Metodo de acceso a la propiedad punto3*/
    public Coordenada getPunto3(){
        return this.punto3;
    }//end method getPunto3

    /**Metodo de modificación a la propiedad punto3*/
    public void setPunto3(Coordenada punto3){
        this.punto3 = punto3;
    }//end method setPunto3

    /**Metodo de acceso a la propiedad relleno*/
    public Color getRelleno(){
        return this.relleno;
    }//end method getRelleno

    /**Metodo de modificación a la propiedad relleno*/
    public void setRelleno(Color relleno){
        this.relleno = relleno;
    }//end method setRelleno

    /**Metodo de acceso a la propiedad linea*/
    public Color getLinea(){
        return this.linea;
    }//end method getLinea

    /**Metodo de modificación a la propiedad linea*/
    public void setLinea(Color linea){
        this.linea = linea;
    }//end method setLinea

}