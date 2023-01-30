package ma.epolytechnique.ExamenFinalFacture.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.epolytechnique.ExamenFinalFacture.metier.Facture;

public interface FactureRepository extends JpaRepository<Facture, Integer> {
	
	public List<Facture> findFactureByEtat(String etat);

}
