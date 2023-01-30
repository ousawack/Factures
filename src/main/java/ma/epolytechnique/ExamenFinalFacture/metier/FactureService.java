package ma.epolytechnique.ExamenFinalFacture.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.epolytechnique.ExamenFinalFacture.dao.FactureRepository;

@Service
public class FactureService implements IFacture {
	
	@Autowired
	FactureRepository factureRepo;

	@Override
	public List<Facture> allFactures() {
		// TODO Auto-generated method stub
		return factureRepo.findAll();
	}

	@Override
	public List<Facture> getFacture() {
		// TODO Auto-generated method stub
		return factureRepo.findFactureByEtat("en cours");
	}

}
