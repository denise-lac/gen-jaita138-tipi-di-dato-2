import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Cliente {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //insert dei dati dall'utente
        System.out.println("Inserisci il nome:");                    //nome
        String nome = sc.nextLine();
        
        System.out.println("Inserisci il cognome:");                 //cognome
        String cognome= sc.nextLine();

        System.out.println("Inserisci la data di nascita:");        //data di nascita
        String dataNascitastr= sc.nextLine();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascita = LocalDate.parse(dataNascitastr, formatter);

        System.out.println("Inserisci il numero di telefono:");      //numero di telefono
        String numTelefono= sc.nextLine();

        System.out.println("Inserisci una nota:");                   //nota
        String nota= sc.nextLine();

        System.out.println("Inserisci l'email:");                    //email
        String email = sc.nextLine();

        System.out.println("Inserisci lo username:");                //username
        String username= sc.nextLine();

        System.out.println("Inserisci la password:");                //password 
        String password= sc.nextLine();

        System.out.println("Inserisci la data di iscrizione:");      //data iscrizione
        String dataIscrizionestr = sc.nextLine();
        DateTimeFormatter formatterDue= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataIscrizione= LocalDateTime.parse(dataIscrizionestr,formatterDue);
        
        System.out.println("---------------------------------------------");
        //stampa a video dei dati inseriti dall'utente
        System.out.println("Nome: "+nome);

        System.out.println("Cognome: "+cognome);

        System.out.println("Data di nascita: "+dataNascita);

        System.out.println("Mumero di telefono: "+numTelefono);
        
        System.out.println("nota: "+nota);
        
        System.out.println("Email: "+email);
        
        System.out.println("Username: "+username);
        
        System.out.println("Password: "+password);
        
        System.out.println("Data di iscrizione: "+dataIscrizione);

        sc.close();
    }
}
