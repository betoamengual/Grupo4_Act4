
package act4_grupo4;

/**
 *
 * @author Francisco
 */
public class Act4_Grupo4 {

    public static void main(String[] args) {
        
        //PUNTO 1
  //    Auto primerAuto = new Auto("Renault 12", "123LATA");
      Auto segundoAuto=new Auto("Ford Focus","999POWR");
      //Celular celular = new Celular("Movistar", 265849365, 500.99);
        
      //PUNTO 2
      Padre papa = new Padre("Lopez", "Pápa", segundoAuto);
        System.out.println(papa);
    }
    
}
