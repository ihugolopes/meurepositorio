package entity;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import service.UsuarioService;

public class UsuarioAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 1L;

	private static final Logger LOG = LogManager.getLogger(UsuarioAction.class.getName());

	private UsuarioService usuarioService;
	private List<Usuario> usuario;
	private Usuario usu;

	@Override
	public void prepare() throws Exception {

		LOG.info("Prepared support data for Person entity.");
		Integer id = (usu).getIdUsuario();
		if (usu != null && id != null) {
			LOG.info("Preparing actual data for Person: " + usu);
		}
	}


}
