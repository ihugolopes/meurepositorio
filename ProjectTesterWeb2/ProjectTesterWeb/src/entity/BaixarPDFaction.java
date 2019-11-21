package entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import persistence.FileDao;

public class BaixarPDFaction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private int idarquivo;
	private InputStream is;
	private String nome;

	public String execute() throws Exception {

		FileDao aDao = new FileDao();
		File arquivo = aDao.buscarArquivo(idarquivo);
		is = new FileInputStream(arquivo);
		nome = arquivo.getName();

		return "success";
	}

	public int getIdarquivo() {
		return idarquivo;
	}

	public void setIdarquivo(int idarquivo) {
		this.idarquivo = idarquivo;
	}

	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
