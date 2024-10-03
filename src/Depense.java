import java.util.Date;

public class Depense {
    private String titre;
    private double montant;
    private Date date;

    public Depense(String titre, double montant, Date date) {
        this.titre = titre;
        this.montant = montant;
        this.date = date;
    }

    public String getTitre() {
        return titre;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }
    
}
