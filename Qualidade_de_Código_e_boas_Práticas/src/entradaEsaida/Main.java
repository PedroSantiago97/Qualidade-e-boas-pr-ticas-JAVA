package entradaEsaida;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void lerTecladoEReceberDocumentos() throws IOException {
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Digite os ingredientes da receita do bolo");
		pw.flush();
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		File f = new File("Receita.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));
		
		do {
			bw.write(line);
			bw.newLine();
			// flush(); -> é usado para garantir que todos os dados armazenados em buffers internos sejam escritos no destino final
			bw.flush();
			line = scan.nextLine();
		}while(!(line.equalsIgnoreCase("sair")));
		
		pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());
		
		
		
		//Fechar os fluxos é uma boa prática trabalhando
		//com entrada e sair de dados
		pw.close();
		scan.close();
		bw.close();
		
	}
	
	public static void copiarArquivos() throws IOException{
		try (Scanner scan = new Scanner(System.in)) {
		
		 File f = new File("/Qualidade_de_Código_e_boas_Práticas/Receita.txt");
		 String nomeArquivo = f.getName();
		 
		 BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
		 String line = br.readLine();
		 //nomeArquivo.substring(); => Mostra a string selecionada excluindo tudo que está apos
		 //o parametro String declarado, que nesse caso é o ponto "."
		 String nomeAquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
		 File fcopy = new File(nomeAquivoCopia);
		 
		 BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));
		 
		 do {
			 bw.write(line);
			 bw.newLine();
			 bw.flush();
			 line = br.readLine();
			 
		 }while(!(line==null));
		 
		System.out.printf("Arquivo \"%s\" foi copiado com sucesso!\n", f.getName());
		System.out.println("");
		System.out.printf("Arquivo \"%s\" foi criado com sucesso!\n", fcopy.getName());
		
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Adicione mais coisas ao bolo: ");
		pw.flush();
		
		
		
		
		
		adicionarInfoNoArquivo(fcopy.getName());
		
		
		pw.printf("\n Ok! Tudo certo. Tamanho do aquivo %d bytes.", fcopy.length());
		
		br.close();
		bw.close();
		pw.close();}
	}
	
	public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
		
		do {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}while(!(line.equalsIgnoreCase("fim")));
		
		bw.close();
		br.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		//lerTecladoEReceberDocumentos();
		copiarArquivos();
	}

}
