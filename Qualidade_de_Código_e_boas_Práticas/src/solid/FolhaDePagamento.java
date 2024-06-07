package solid;

public class FolhaDePagamento {
	
	protected Double saldo;
	
	public void calcular(Remuneravel contrato) {
		String remuneracao = contrato.remuneracao();
		System.out.println(remuneracao);
	}
	
	

	

}
