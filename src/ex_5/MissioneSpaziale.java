package ex_5;

import java.util.Random;

public class MissioneSpaziale {

    /*
    consegna:
    Crea una classe MissioneSpaziale con i seguenti campi:
    nomeMissione (privato)
    idMissione (final, auto-generato con un contatore statico condiviso tra tutte le missioni)
    Crea un metodo stampaDettagli() che stampa il nome e l'ID.
    Crea due sottoclassi:
    MissioneScientifica con un campo aggiuntivo obiettivo
    MissioneCommerciale con un campo aziendaPartner
    In ognuna, sovrascrivi stampaDettagli() per includere i campi specifici.
    Nel main, crea una lista di missioni miste, stampale, e mostra il numero totale delle missioni create (tramite un metodo static della classe base).
    */

    // fields
    private String nameMission;
    private final int idMission;
    private static int countMission = 0;
    
    // costruttore
    public MissioneSpaziale(String nameMission) {
        countMission++;
        this.idMission = countMission;
        if (nameMission == null || nameMission.isEmpty()) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.nameMission = nameMission;
        }
    }
    
    
    // metodi
    // stampo dettagli
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MissioneSpaziale{");
        sb.append("nameMission=").append(nameMission);
        sb.append(", idMission=").append(idMission);
        sb.append('}');
        return sb.toString();
    }

    // genero codice missione random
    public int randomId() {
        Random random = new Random(10);
        int numRandom = random.nextInt();
        return numRandom;
    }

    // getters
    public String getNameMission() {
        return nameMission;
    }

    public int getIdMission() {
        return idMission;
    }

    public static int getNumMission() {
        return countMission;
    }


    // setters
    public void setNameMission(String nameMission) {
        if (nameMission == null || nameMission.isEmpty()) {
            System.out.println("hai inserito valori errati, metto quelli di default");
        } else {
            this.nameMission = nameMission;
        }
    }


    
    
    

}
