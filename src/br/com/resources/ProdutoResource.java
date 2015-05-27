package br.com.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.entities.Produto;

@Path("/produtos")
public class ProdutoResource {

	@GET
	@Path("/{id}/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Produto getProdutoAsXML(@PathParam("id") long id) {
		return this.geraProdutoFalso(id);
	}

	@GET
	@Path("/{id}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Produto getPrudotAsJSON(@PathParam("id") long id) {
		return this.geraProdutoFalso(id);
	}

	public Produto geraProdutoFalso(long id) {
		Produto p = new Produto();
		p.setNome("produto");
		p.setPreco(50.0);
		p.setId(id);

		return p;
	}
}
