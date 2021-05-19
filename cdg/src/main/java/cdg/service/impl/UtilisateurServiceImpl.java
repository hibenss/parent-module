package cdg.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cdg.dao.UtilisateurDAO;
import cdg.entities.Utilisateur;
import cdg.service.UtilisateurService;

@Service 
public class UtilisateurServiceImpl implements UtilisateurService {
    
	// Injection par annotation
	//	@Autowired
	//	private UtilisateurDAO utilisateurDAO;
	
	// Injection par constructeur
	private UtilisateurDAO utilisateurDAO;
	
	public UtilisateurServiceImpl(UtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}
	
	@Override
	public List<Utilisateur> getUsers() {
		return utilisateurDAO.findAll();
	}

	
}
