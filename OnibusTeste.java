package onibus;

public class OnibusTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Passageiro p1 = new Passageiro("Alberto", "cpf666");
		Passageiro p2 = new Passageiro("Asdrubal", "Rg444555");
		Passageiro p3 = new Passageiro("Luis Manuel", "Cpf359");
		Passageiro p4 = new Passageiro("Maria Joana", "Rg8585");
		Passageiro p5 = new Passageiro("Roberto", "Cpf889966");
		
		Onibus o1 = new Onibus("Cometa", "Minas Gerais");
		
		o1.InserePassageiro(p1, 3);
		o1.InserePassageiro(p2, 14);
		o1.InserePassageiro(p3, 30);
		o1.InserePassageiro(p4, 25);
		o1.InserePassageiro(p5, 42);
		
		o1.ListaPassageiros();
		
		o1.MostraVazio();
				

	}

}
