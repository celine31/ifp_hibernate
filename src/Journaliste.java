import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public  class Journaliste  implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private Integer credit;

  //getters et setters
  public String getNom() {
      return nom;
    }

    public void setNom(String nom) {
      this.nom = nom;
    }

    public Integer getCredit() {
      return credit;
    }

    public void setCredit(Integer credit) {
      this.credit = credit;
    }

  public Long getId() {
    return id;
  }

  public  void setId(Long id) {
    this.id = id;
  }

  //override string, equals et hashcode
  @Override
  public String toString() {
    return "Journaliste{" +
      "id=" + id +
      ", nom='" + nom + '\'' +
      ", credit=" + credit +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Journaliste that = (Journaliste) o;
    return Objects.equals(id, that.id) &&
      Objects.equals(nom, that.nom) &&
      Objects.equals(credit, that.credit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nom, credit);
  }
}

