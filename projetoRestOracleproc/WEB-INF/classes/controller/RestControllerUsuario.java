package controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dto.DtoUsuarioEndereco;
import persistence.UsuarioDao;

@RestController
public class RestControllerUsuario {
	
	@GetMapping(value="/usuario")
	public @ResponseBody List<DtoUsuarioEndereco> listar(){
		try {
          return    new UsuarioDao().findAll();
		}catch(Exception ex) {
			return null;
		}
	}

}
