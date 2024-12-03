import java.util.Scanner;

public class Ingredienti {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //insert dei dati dall'utente
        System.out.println("Inserisci il nome:");                           //nome
        String nome = sc.nextLine();
        
        System.out.println("Inserisci la descrizione:");                    //descrizione
        String descrizione= sc.nextLine();
        

        System.out.println("Inserisci il costo:");                          //prezzo
        double costo = sc.nextDouble();

        System.out.println("Inserisci la disponibilità:");                  //disponibilità
        boolean disponibile= sc.nextBoolean();
        

        System.out.println("Inserisci la tipologia:");                      //tipologia
        byte tipologia= sc.nextByte();
        sc.nextLine();
        

        System.out.println("Inserisci gli allergeni:");                     //allergeni
        String allergeni = sc.nextLine();
        

        System.out.println("Inserisci la foto:");                           //foto
        String foto= sc.nextLine();
        

        System.out.println("Inserisci le modalità di conservazione:");      //conservazione 
        String conservazione= sc.nextLine();
        
        System.out.println("---------------------------------------------");
        //stampa a video dei dati inseriti dall'utente
        System.out.println("Il nome dell'ingrediente è: "+nome);

        System.out.println("La descrizione del piatto è: "+descrizione);

        System.out.println("Il costo dell'ingrediente è: "+costo);

        System.out.println("Disponibilità dell'ingrediente: "+disponibile);
        
        System.out.println("Il tipo di ingrdiente è: "+tipologia);
        
        System.out.println("Allergeni contenuti: "+allergeni);
        
        System.out.println("La foto dell'ingrediente: "+foto);
        
        System.out.println("Modalità di conservazione: "+conservazione);
        

        sc.close();
    }
}
