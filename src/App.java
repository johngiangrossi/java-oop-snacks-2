
import ex_5.MissioneCommerciale;
import ex_5.MissioneScientifica;
import ex_5.MissioneSpaziale;


public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Auto auto1 = new Auto("casa", 1939, 4);
        System.out.println(auto1.stampInfo());
        */
        
        /*
        ContoRisparmio conto1 = new ContoRisparmio(10, "null", 2);
        System.out.println(conto1.toString());
        System.out.println(conto1.applyTaxInterest());
        
        System.out.println(conto1.toString());
        
        incapsulamento è uno dei tre principi del oop
        è la capacità di proteggere i dati interni di una classe (gli attributi, metodi) dall'esterno, incapsulandoli in modo privato e
        permettendo un accesso in lettura o scrittura controllato usando dei metodi chiamati getters o setters, per evitare modifiche non controllate
        che potrebbero rompere la logica interna della classe
        */

        /* 
        Utente utente1 = new Utente();
        
        System.out.println(utente1.getNumUser());
        System.out.println(utente1.toString());
        
        Utente utente2 = new Utente();
        System.out.println(utente2.getNumUser());
        System.out.println(utente2.toString());
        
        Utente utente3 = new Utente();
        System.out.println(utente3.getNumUser());
        System.out.println(utente3.toString());
        */
        
        /*
        Rettangolo rettangolo1 = new Rettangolo(10, 10);
        System.out.println(rettangolo1.toString());
        rettangolo1.stampArea();
        
        Cerchio cerchio1 = new Cerchio(10);
        System.out.println(cerchio1.toString());
        cerchio1.stampArea();
        */
        
        MissioneSpaziale[] missionArray = new MissioneSpaziale[5];
        missionArray[0] = new MissioneScientifica("nasa");
        missionArray[1] = new MissioneScientifica("paso");
        missionArray[2] = new MissioneScientifica("tosa");
        missionArray[3] = new MissioneCommerciale("ciao", "1");
        missionArray[4] = new MissioneCommerciale("feria", "531");
        
        // con if
        for (int i = 0; i < missionArray.length; i++) {
            MissioneSpaziale elem = missionArray[i];
            if (elem instanceof MissioneScientifica) {
                System.out.println(elem.toString());
            } else if (elem instanceof MissioneCommerciale) {
                System.out.println(elem.toString());
            } else {
                System.out.println("la missione non è presente");
            }
        }

        /*
        // senza if
        for (int i = 0; i < missionArray.length; i++) {
            MissioneSpaziale elem = missionArray[i];
            System.out.println(elem.toString());
        }

        // con ArrayList
        List<MissioneSpaziale> missioniList = new ArrayList<>();
        missioniList.add(new MissioneScientifica("nasa"));
        missioniList.add(new MissioneScientifica("paso"));
        missioniList.add(new MissioneScientifica("tosa"));
        missioniList.add(new MissioneCommerciale("ciao", "1"));
        missioniList.add(new MissioneCommerciale("feria", "531"));

        // con if
        for (int i = 0; i < missioniList.size(); i++) {
            MissioneSpaziale elem = missioniList.get(i);
            if (elem instanceof MissioneScientifica) {
                System.out.println(elem.toString());
            } else if (elem instanceof MissioneCommerciale) {
                System.out.println(elem.toString());
            } else {
                System.out.println("la missione non è presente");
            }
        }

        // senza if
        for (int i = 0; i < missioniList.size(); i++) {
            MissioneSpaziale elem = missioniList.get(i);
            System.out.println(elem.toString());
        }
        */

        System.out.println(MissioneSpaziale.getNumMission());
    }
}
