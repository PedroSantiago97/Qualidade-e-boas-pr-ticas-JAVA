package solid;

public class Main {
	public static void main(String[] args) {
		FolhaDePagamento folhaDePagamento =  new FolhaDePagamento();
		
		
		//As classes serão declaradas com o nome da Interface
		//Após as declarações, os objetos criados tem propriedades
	    //únicas da classe que o instancia.
		//Instanciar com Interface
		Remuneravel contratoCLT = new ContratoCLT();
		Remuneravel contratoPJ = new ContratoPj();
		Remuneravel contratoEstagio = new Estagio();
		
		
		
		folhaDePagamento.calcular(contratoCLT);
		folhaDePagamento.calcular(contratoPJ);
		folhaDePagamento.calcular(contratoEstagio);
		
		
	}

}
