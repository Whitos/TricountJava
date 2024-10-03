import java.util.List;

public class Participant {
    private String name;
    private String email;
    private List<Tricount> tricounts;

    public Participant(String name, String email) {
        this.name = name;
        this.email = email;
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

}
