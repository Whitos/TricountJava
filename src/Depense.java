import java.util.Date;

public class Depense {
    private String titre;
    private double montant;
    private Date date;
    private CategorieDepense categorieDepense;

    public Depense(String titre, double montant, Date date, CategorieDepense categorieDepense) {
        this.titre = titre;
        this.montant = montant;
        this.date = date;
        this.categorieDepense = categorieDepense;
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
    
    public CategorieDepense getCategorieDepense() {
        return categorieDepense;
    }
}
