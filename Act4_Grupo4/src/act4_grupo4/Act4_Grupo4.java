package act4_grupo4;

/**
 *
 * @author Francisco
 */
public class Act4_Grupo4 {

    public static void main(String[] args) {

        //PUNTO 1
        Auto cascajo = new Auto("Renault 12", "123LATA");
        Auto auto2 = new Auto("Ford Focus", "999POWR");
        //Celular celular = new Celular("Movistar", 265849365, 500.99);

        //PUNTO 2
        Padre papa = new Padre("Lopez", "Pápa", cascajo);
        System.out.println(papa);

        
        //PUNTO 3
        papa.mostarCasa();
        
        //PUNTO 4
        
        Celular celular = new Celular("Movistar","2664123456",599.76);
        
        Hijo hijo = new Hijo(papa.getApellido(),"Juan Carlos", cascajo, celular);
        System.out.println(hijo);
        
        //PUNTO 5
        
        hijo.mostrarAuto();
        
        //PUNTO 6
        hijo.conducirAuto(auto2);
        
        //PUNTO 7
        hijo.jugarFutbol();
        
        //PUNTO 8
        hijo.bailar();
        
        //PUNTO 9
        hijo.jugarLoteria();
    }

}
