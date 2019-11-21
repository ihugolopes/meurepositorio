package entity;

import java.io.File;
import java.io.FileReader;

import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;

import com.opensymphony.xwork2.ActionSupport;

import persistence.ClienteDao;
import persistence.FileDao;
import util.DataUtil;
import util.XmlUtil;

@SuppressWarnings("serial")
public class FileUploadAction extends ActionSupport {

	File arquivo;
	String arquivoFileName;
	Cliente cliente = new Cliente();
	Arquivo pdf = new Arquivo();

	public String execute() throws Exception {

		try {
			XmlUtil util = new XmlUtil();
			DataUtil datautil = new DataUtil();
			Document doc = util.converterxml(arquivo);

			pdf.setArquivo(IOUtils.toString(new FileReader(arquivo)));
			pdf.setNomearquivo(arquivoFileName);

			FileDao adao = new FileDao();
			int a = adao.inserirArquivo(pdf);

			cliente.setItem(util.getValorXml(doc, "bsp:item"));
			cliente.setNomeSegurado(util.getValorXml(doc, "bsp:nomeSegurado"));
			cliente.setCpfCnpjSegurado(util.getValorXml(doc, "bsp:cpfCnpjSegurado"));
			cliente.setTipoDocumento(util.getValorXml(doc, "bsp:tipoDocumento"));
			cliente.setDataEmissao(datautil.ConverterData(util.getValorXml(doc, "bsp:dataEmissao")));
			cliente.setSucursal(util.getValorXml(doc, "bsp:sucursal"));
			cliente.setPlaca(util.getValorXml(doc, "bsp:placa"));
			cliente.setRamo(util.getValorXml(doc, "bsp:ramo"));
			cliente.setCompanhia(util.getValorXml(doc, "bsp:companhia"));
			cliente.setCpdCorretor(util.getValorXml(doc, "bsp:cpdCorretor"));
			cliente.setChassi(util.getValorXml(doc, "bsp:chassi"));
			cliente.setNumeroApolice(util.getValorXml(doc, "bsp:numeroApolice"));
			cliente.setNumeroEndosso(util.getValorXml(doc, "bsp:numeroEndosso"));
			cliente.setIdarquivo(a);

			ClienteDao clidao = new ClienteDao();
			clidao.create(cliente);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "success";

	}

	public File getArquivo() {
		return arquivo;
	}

	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}

	public String getArquivoFileName() {
		return arquivoFileName;
	}

	public void setArquivoFileName(String arquivoFileName) {
		this.arquivoFileName = arquivoFileName;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Arquivo getPdf() {
		return pdf;
	}

	public void setPdf(Arquivo pdf) {
		this.pdf = pdf;
	}
}