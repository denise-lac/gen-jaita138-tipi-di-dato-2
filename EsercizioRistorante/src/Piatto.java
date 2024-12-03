import java.util.Scanner;

public class Piatto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //insert dei dati dell'utente
        System.out.println("Inserisci il nome:");                   //nome
        String nome = sc.nextLine();
        
        System.out.println("Inserisci la descrizione:");            //descrizione
        String descrizione= sc.nextLine();
        

        System.out.println("Inserisci il prezzo:");                 //prezzo
        double prezzo = sc.nextDouble();

        System.out.println("Inserisci la disponibilità:");          //disponibilità
        boolean disponibile= sc.nextBoolean();
        

        System.out.println("Inserisci la tipologia:");              //tipologia
        byte tipologia= sc.nextByte();
        sc.nextLine();
        

        System.out.println("Inserisci gli allergeni:");             //allergeni
        String allergeni = sc.nextLine();
        

        System.out.println("Inserisci la foto:");                   //foto
        String foto= sc.nextLine();
        

        System.out.println("Inserisci le calorie contenute:");      //calorie 
        short calorie= sc.nextShort();
        sc.nextLine();
        

        System.out.println("Inserisci le possibili variazioni:");   //variazioni
        String variazioni = sc.nextLine();
        
        //stampa a video dei dati inseriti dall'utente
        System.out.println("Il nome del piatto è: "+nome);

        System.out.println("La descrizione del piatto è: "+descrizione);

        System.out.println("Il prezzo del piatto è: "+prezzo);

        System.out.println("Disponibilità del piatto: "+disponibile);
        
        System.out.println("La tipologia del piatto è: "+tipologia);
        
        System.out.println("Gli allergeni contenuti sono: "+allergeni);
        
        System.out.println("La foto del piatto: "+foto);
        
        System.out.println("La quantità di calorie contenute sono: "+calorie);
        
        System.out.println("Le possibili variazioni del piatto sono: "+variazioni);

        sc.close();
    }
}
