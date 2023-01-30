package ma.epolytechnique.ExamenFinalFacture.metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numero_fact;
	private double montant;
	private String etat;
	private Date date_fact;
	
	public Integer getNumero_fact() {
		return numero_fact;
	}
	public void setNumero_fact(Integer numero_fact) {
		this.numero_fact = numero_fact;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDate_fact() {
		return date_fact;
	}
	public void setDate_fact(Date date_fact) {
		this.date_fact = date_fact;
	}
	
	public Facture(Integer numero_fact, double montant, String etat, Date date_fact) {
		super();
		this.numero_fact = numero_fact;
		this.montant = montant;
		this.etat = etat;
		this.date_fact = date_fact;
	}
	
	public Facture() {
		super();
	}

}
