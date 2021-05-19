package cdg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity 
@Table(name="UTILISATEUR")

public class Utilisateur {
	
	@Id
	@Column(name="id")
    private Long id ;
	
	@Column(name="nom", length=20)
    private String nom ;
	
	@Column(name="prenom", length=20)
    private String prenom ;
	
	@Column(name="age", length=3)
    private Long age ;
	
	@Column(name="adresse", length=40)
    private String adresse ;
	
       
}
