package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UtenteController {
@Autowired
	private UtenteRepository utenteDao;
	@PostMapping("/aggiungi")
	public ModelAndView login(@ModelAttribute("datiUtente") Utente u) {
		utenteDao.save(u);
		return new ModelAndView("welcome", "datiUtente", u);
}
	@GetMapping("/index")
	public ModelAndView nuovoUtente() {
		return new ModelAndView("index", "datiUtente", new Utente());
	}

}
