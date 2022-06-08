package onibus;

public class Passageiro {
	
	private String nome;
	private String documento;
	
	public Passageiro(String nome, String documento) {
		
		this.nome = nome;
		this.documento = documento;
	}

	public String GetNome() {
		
		return this.nome;
	}
	
	public String GetDocumento() {
		
		return this.documento;
	}
	
	public void DadosPassageiro() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Documento: " + this.documento);
		System.out.println("\n");
	}
	
}
