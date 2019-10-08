package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.Usuario;
import persistence.UsuarioDao;

@Controller
public class UsuarioController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView init() {
		ModelAndView mv = new ModelAndView("sistema");
		mv.addObject("msg", "Bem vindo ao Spring MVC-REST");
		mv.addObject("lista", new UsuarioDao().findAll());
		return mv;
	}

	@RequestMapping(value = "gravar.html", method = RequestMethod.POST)
	public ModelAndView gravar(Usuario u) {
		ModelAndView mv = new ModelAndView("sistema");
		if (u.getNome().length() < 2) {
			mv.addObject("msg", "Valide os dados");
			return mv;
		} else {
			try {
				new UsuarioDao().create(u, u.getEndereco());
				mv.addObject("lista", new UsuarioDao().findAll());
			} catch (Exception e) {
				mv.addObject("error", e.getMessage());
			}
		}
		return mv;
	}
	
	@RequestMapping(value = "excluir/{id}", method = RequestMethod.GET)
	public ModelAndView excluir(@PathVariable("id") String id) {
		ModelAndView mv = new ModelAndView("sistema");
		
			try {
				new UsuarioDao().delete(new Long(id));
				mv.addObject("lista", new UsuarioDao().findAll());
				mv.addObject("msg", "Excluído com sucesso!");
			} catch (Exception e) {
				mv.addObject("error", e.getMessage());
			}
		return mv;
	}
}
