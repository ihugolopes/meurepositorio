package adapter;

import org.bson.Document;
import entity.Cliente;

public class ClienteAdapter {
	// write
	public static Document paraDocumento(Cliente c) {
		Document doc = new Document();
		doc.append("_id", c.get_id());
		doc.append("nome", c.getNome());
		doc.append("email", c.getEmail());
		doc.append("ativo", c.getAtivo());
		return doc;
	}

	// Read
	public static Cliente paraObjeto(Document doc) {
		Cliente c = new Cliente();
		c.set_id(doc.getDouble("_id"));
		c.setNome(doc.get("nome").toString());
		c.setEmail(doc.get("email").toString());
		c.setAtivo(doc.getDouble("ativo"));
		return c;
	}
}
