package ma.cdgk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cdgk.dao.UtilisateurDAO;
import ma.cdgk.entities.Utilisateur;
import ma.cdgk.service.UtilisateurService;

@Service 
public class UtilisateurServiceImpl implements UtilisateurService {
    
	@Autowired
	private UtilisateurDAO utilisateurDAO;
	
	@Override
	public List<Utilisateur> getUsers() {
		return utilisateurDAO.findAll();
	}

	
}
