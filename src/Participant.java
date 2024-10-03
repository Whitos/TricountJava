import java.util.ArrayList;
import java.util.List;

public class Participant {
    private String name;
    private String email;
    private List<Tricount> tricounts;

    public Participant(String name, String email) {
        this.name = name;
        this.email = email;
        this.tricounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Tricount> getTricounts() {
        return tricounts;
    }

    public void setTricounts(List<Tricount> tricounts) {
        this.tricounts = tricounts;
    }

    public void addTricount(Tricount tricount) {
        this.tricounts.add(tricount);
    }

    public void removeTricount(Tricount tricount) {
        this.tricounts.remove(tricount);
    }

    public String toString() {
        return "Participant: " + name + ", " + "email: " + email;
    }
}
