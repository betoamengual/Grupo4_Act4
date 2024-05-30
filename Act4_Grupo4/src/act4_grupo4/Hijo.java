
package act4_grupo4;



public class Hijo extends Padre implements Madre, Tio, Hermano{
    private String nombre;
    private Auto auto[];
    private Celular celular;
    private double billetera; //cambiar el tipo de dato a double en la base de datos

    public Hijo(String apellido, String nombre, Auto a) {
        super(apellido, nombre, a);
    }
    
 
    
    
    public void Cantar(){
         super.cantar(apellido);
         System.out.println("Y asi canta tu hijo, "+this.nombre);
    }
    
    
  
    @Override
    public void bailar() {
        
    }

    @Override
    public int jugarLoteria() {
        return 0;
    }

    @Override
    public void HeredarDinero(double money) {
      
    }

    @Override
    public int hacerGoles() {
        return 0;
}
       
    

    @Override
    public void jugarFutbol() {

    }


    
    
}
