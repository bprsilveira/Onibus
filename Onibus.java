package onibus;



public class Onibus {
	
	final static int Total_Lugares = 43; 
	private String nome;
	private String linha;
	private int poltrona;
	private Passageiro[] passageiro;

	public Onibus(String nome, String linha) {
		
		this.nome = nome;
		this.linha = linha;
		this.poltrona = poltrona;
		this.passageiro = new Passageiro[Total_Lugares];
		
	}
	
	public String GetNome() {
		
		return this.nome;
	}
	
	public String GetLinha() {
		
		return this.linha;
	}
	
	public int GetPoltrona() {
		
		return  this.poltrona;
	}
	
	public void MostraVazio() {
		
		System.out.println("Poltronas vazias: \n");
		
		for(this.poltrona = 1; this.poltrona<Total_Lugares; this.poltrona++) {
			
			if(passageiro[this.poltrona]==null) {
				
				System.out.println(this.poltrona);
			}
		}
	}
	
	public void ListaPassageiros() {
		
		for(this.poltrona = 1; this.poltrona<Total_Lugares; this.poltrona++) {
			
			if(passageiro[this.poltrona] != null) {
			   
				passageiro[this.poltrona].DadosPassageiro();
			}
		}
	}
	
	

	public void InserePassageiro(Passageiro pas, int poltrona) {
		
		this.poltrona = poltrona;
		
		if(this.poltrona > 0 && this.poltrona < Total_Lugares && passageiro[this.poltrona] == null) {
		
		   passageiro[this.poltrona] = pas;
		   		   
		}else if(passageiro[this.poltrona] != null) {
			
			System.out.println("Assento ocupado \n");
	  
	  }else {
		  
		  System.out.println("Número de poltrona inexistente\n");
	  }
	}
	
}
