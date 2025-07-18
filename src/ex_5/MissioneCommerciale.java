package ex_5;

public class MissioneCommerciale extends MissioneSpaziale {

    // fields
    private String goal;

    // costruttore
    public MissioneCommerciale(String nameMission, String goal) {
        super(nameMission);
        if (goal == null || goal.isEmpty()) {
            System.out.println("hai inseriti valori errati, metto quelli di default");
        } else {
            this.goal = goal;
        }
    }

    // metodi
    // stampo dettagli
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MissioneCommerciale{");
        sb.append("nameMission=").append(getNameMission());
        sb.append(", idMission=").append(getIdMission());
        sb.append(", goal=").append(goal);
        sb.append('}');
        return sb.toString();
    }
    

    // getters
    public String getGoal() {
        return goal;
    }

    // setters
    public void setGoal(String goal) {
        if (goal == null || goal.isEmpty()) {
            System.out.println("hai inseriti valori errati, metto quelli di default");
        } else {
            this.goal = goal;
        }
    }




    

    
}
