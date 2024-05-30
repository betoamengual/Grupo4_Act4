package act4_grupo4;

public class Act4_Grupo4 {

    public static void main(String[] args) {

        //PUNTO 1
        Auto cascajo = new Auto("Renault 12", "123LATA");
        Auto auto2 = new Auto("Ford Focus", "999POWR");

        //PUNTO 2
        Padre papa = new Padre("Lopez", "Papa", cascajo);
        
        //PUNTO 3
        papa.mostarCasa();
        
        //PUNTO 4
        Celular celular = new Celular("Movistar","2664123456",599.76);
        
        Hijo hijo = new Hijo(papa.getApellido(),"Juan Carlos", cascajo, celular);
        System.out.println("Soy el hijo "+hijo.getNombre()+" herede de mi padre su apellido: "+hijo.getApellido());
        
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
        
        //PUNTO 10
        hijo.cantar(papa.getApellido());
        
        //PUNTO 11
        hijo.HeredarDinero(Tio.MONEY);
        
        //PUNTO 12
        hijo.hacerGoles();
    }

}