import java.util.List;

public class Tricount {
    private String titre;
    private List<String> devises;
    private List<Participant> participants;

    public Tricount(String titre, List<String> devises) {
        this.titre = titre;
        this.devises = devises;
    }

    public String getTitre() {
        return titre;
    }

    public List<String> getDevises() {
        return devises;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
