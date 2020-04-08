public class Journaliste {
    private Integer id;
    private String nom;
    private Integer credit;

    public Journaliste( Integer id) {
      this.id=id;
      this.nom = nom;
      this.credit = credit;
    }

    public String getNom() {
      return nom;
    }

    public Integer getCredit() {
      return credit;
    }
  }

