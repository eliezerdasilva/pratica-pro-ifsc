package Model;

public class Usuario {

	public String nome;
	public String cpf;
	public String dados;
	public String cadastrar;
	public String cep;

	public void setNome(String nomee) {
		this.nome = nomee;
	}

	public String getNome() {
		return this.nome;
	}

	public void setcpf(String cpff) {
		this.cpf = cpff;
	}

	public String getcpf() {
		return this.cpf;
	}

	public void setcep(String cepp) {
		this.cep = cepp;
	}

	public String getcep() {
		return this.cep;
	}

}
