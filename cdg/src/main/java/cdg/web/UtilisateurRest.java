package cdg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import cdg.service.UtilisateurService;

@RestController
@RequestMapping("/api/users")
public class UtilisateurRest {
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	@GetMapping("/getUsers")
	@ResponseStatus(HttpStatus.OK)
	public void getAllUsers() {
		utilisateurService.getUsers();
	}
	
	@GetMapping("/test")
	@ResponseStatus(HttpStatus.OK)
	public String test() {
		return "Hello ! ";
	}

}
