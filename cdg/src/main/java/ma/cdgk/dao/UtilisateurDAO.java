package ma.cdgk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cdgk.entities.Utilisateur;

@Repository
public interface UtilisateurDAO extends JpaRepository<Utilisateur, Long>{

	
}
