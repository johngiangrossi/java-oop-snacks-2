package ex_5;

public class MissioneScientifica extends MissioneSpaziale{
    
    // fields
    private String agencyPartner;

    // costruttore
    public MissioneScientifica(String agencyPartner) {
        super(agencyPartner);
        if (agencyPartner == null || agencyPartner.isEmpty()) {
            System.out.println("hai inseriti valori errati, metto quelli di default");
        } else {
            this.agencyPartner = agencyPartner;
        }
    }


    // metodi
    // stampo dettagli
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MissioneScientifica{");
        sb.append("nameMission=").append(getNameMission());
        sb.append(", idMission=").append(getIdMission());
        sb.append(", agencyPartner=").append(agencyPartner);
        sb.append('}');
        return sb.toString();
    }


    // getters
    public String getAgencyPartner() {
        return agencyPartner;
    }

    // setters
    public void setAgencyPartner(String agencyPartner) {
        if (agencyPartner == null || agencyPartner.isEmpty()) {
            System.out.println("hai inseriti valori errati, metto quelli di default");
        } else {
            this.agencyPartner = agencyPartner;
        }
    }
    
}
