public class ProdutoDao {

	public void cadastrar(Produto produto){
		produto.setId(produto.id);
		produto.setNome(produto.nome);
		produto.setTipo(produto.tipo);
		produto.setMarca(produto.marca);
		produto.setDescricao(produto.descricao);

		//Produto pro = new Produto();
		//pro.setId(produto.getId());

	}

	public void atualizar(Produto produto){
		produto.setId(produto.id);
		produto.setNome(produto.nome);
		produto.setTipo(produto.tipo);
		produto.setMarca(produto.marca);
		produto.setDescricao(produto.descricao);


		if (produto.id != 0){
			produto.setId(produto.id);
		}

		if (produto.nome != ""){
			produto.setNome(produto.nome);
		}

		if (produto.tipo != ""){
			produto.setTipo(produto.tipo);
		}

		if (produto.marca != ""){
			produto.setMarca(produto.marca);
		}

		if (produto.descricao != ""){
			produto.setDescricao(produto.descricao);
		}


	}

	public  void excluir(Produto produto){
		produto.setId(0);
		produto.setNome("");
		produto.setTipo("");
		produto.setMarca("");
		produto.setDescricao("");

	}

/*	public Produto[] listar(){
		System.out.println(Produto.getId());
		System.out.println(Produto.getNome());
		System.out.println(Produto.getTipo());
		System.out.println(Produto.getMarca());
		System.out.println(Produto.getDescricao());


	}*/

}

/*
main:

Produto pro = new Produto();

ProdutoDao.cadastrar(pro);]

ProdutoDao.listar()*/