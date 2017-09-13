import java.util.Random;

public class GeradorAleatorioNomeSobrenome {

	public GeradorAleatorioNomeSobrenome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new GeradorAleatorioNomeSobrenome().gerarNomeAleatorio();
	}
	
	public String gerarNomeAleatorio() {
		String nomes[] = {"Sarah ","Helen","Jestine","Jared","Jean","Charles","Norbert"};
		String SobreNomes[] = {"Bugario","Nudin","Oglo","Athe","Thaingi","Magro","Nithain"};
		
		int nrAleatorio = 0 , nrAleatorio2 = 0;
		Random ramdom = new Random();
		for(int i = 0; i < 20; i++){
			//escolhe uma posição de 0 a 6
			nrAleatorio = ramdom.nextInt(nomes.length);
			nrAleatorio2 = ramdom.nextInt(SobreNomes.length);
			//if(i % 5 == 0)
			//	System.out.println();
			//imprime um resultado aleatório
			//System.out.print(nrAleatorio + "[" + nomes[nrAleatorio]+"] ");
		}
		
		System.out.print( nomes[nrAleatorio] +" "+SobreNomes[nrAleatorio2] );
		return nomes[nrAleatorio] +" "+SobreNomes[nrAleatorio];
	}
		
		

}
