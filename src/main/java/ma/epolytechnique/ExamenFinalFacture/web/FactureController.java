package ma.epolytechnique.ExamenFinalFacture.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ma.epolytechnique.ExamenFinalFacture.metier.FactureService;
import ma.epolytechnique.ExamenFinalFacture.metier.IFacture;

@Controller
public class FactureController {
	
	@Autowired
	FactureService factureServ;
	
	@Secured(value = "ROLE_ADMIN")
	@GetMapping("/allFactures")
	public String allFactures (Model module) {
		module.addAttribute("facture", factureServ.allFactures());
		return "facture";
	}
	
	@Secured(value = {"ROLE_ADMIN", "ROLE_VISITOR"})
	@GetMapping("/facturesEnCours")
	public String FacturesEnCours (Model module) {
		module.addAttribute("facture", factureServ.getFacture());
		return "facture";
	}

}
