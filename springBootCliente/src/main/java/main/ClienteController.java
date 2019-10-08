package main;

 
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {
	
	  @Autowired
	  private  ClienteRepository  dao;
	  
	  @RequestMapping("/")
	  public String welcome(Map<String, Object> model) {
		  model.put("msg", "Seja Bem vido ao Site de Spring Boot ...");
		  return "index";
	  }
	  

	  @PostMapping(value="/cliente", 
			  consumes  = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			  produces  =  MediaType.TEXT_PLAIN_VALUE
			   )
	  public ModelAndView salvar(
			       @RequestParam String nome,
			       @RequestParam String email,
			       @RequestParam String foto
			    ) {
		       ModelAndView  mv = new ModelAndView("index");
		      try {
                  Cliente c = new Cliente(null, nome, email, foto);
		    	   dao.save(c);
                  mv.addObject("msg","Dados gravados");
		      }catch(Exception ex) {
		    	  mv.addObject("msg","Error : " + ex.getMessage());
		      }
		      return mv;
	  }
	  
	  
	  @GetMapping(value="/listarservice",
			   produces= MediaType.APPLICATION_JSON_VALUE
			                 )
	 public @ResponseBody  List<Cliente> listaService(){
		  try {
			  return (List<Cliente>)  dao.findAll();
		  }catch(Exception ex) {
			   return Collections.emptyList();
		  }
	  }
	  
	  
	  

	  
}
