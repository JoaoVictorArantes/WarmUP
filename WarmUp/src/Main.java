import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);			
		
		System.out.println("Qual exercicio você está querendo acessar?");
		
		
		int exercicio = scanner.nextInt();
		
		switch (exercicio) {
		
		case 1:
			
			int tabuada[][] = new int[10][10];
		
			for (int i = 0; i < tabuada.length; i++) {
				for (int j = 0; j < tabuada.length; j++) {
					tabuada[i][j] = i+j;
				}
				
			}
					
			for (int i = 0 ;i < tabuada.length; i++) {
				for (int j = 0; j < tabuada[i].length; j++) {
					System.out.print(tabuada[i][j] + " ");
				}
				
				System.out.println("");
			}
		
		break;
		
		case 2:
			
			int lista[] = new int [10];
			int primos[] = new int[10];
			
			System.out.println("Digite 10 numeros");
			
			for (int i = 0; i < lista.length; i++) {
				lista[i] = scanner.nextInt(10);
				
				
					if (i%2==0) {
						primos[i] = lista[i];
					}								
			}	
			
				for (int i = 0; i < primos.length; i++) {
					System.out.println(primos[i]);
				}
		
		break;
			
		case 3:
			
			String carro[] = {"Kwid","Onix","Argo","HB20","Logan"};
			
			int consumo[] = {15,17,13,16,14};
			
			int consumoMaior = 0;
			int posicao = 0;
			int consumo1000;
			
			for (int i = 0; i < consumo.length; i++) {
				
				if (consumoMaior < consumo[i]) {
					consumoMaior = consumo[i];
					posicao = i;
				}
				
			}
			
			System.out.println("O carro mais econômico é: " + carro[posicao] + "\nQue faz: "+ consumoMaior + "KM/L" );
			
			//int contador = 0;
			for (int i = 0; i < carro.length; i++) {
				
				consumo1000 = (1000 / consumo[i]);				
				System.out.println("O carro "+ carro[i] + " gasta " + consumo1000 + " litros a cada 1000 KM");
				
			}
			
		break;
		
		case 4:
			
			int dinheiro[] = new int[9];
			int ValorRoubo = 0;
			
			System.out.println("Qual o valor que o bandido confesso roubou?");
			int Ladrao1 = scanner.nextInt();
			
			
			for (int i = 0; i < dinheiro.length; i++) {
				System.out.println("Digite o valor "+ (i+1));
				dinheiro[i] = scanner.nextInt();
			}
			
			for (int i = 0; i < dinheiro.length; i++) {
				if ((dinheiro[i]%10==0) && (dinheiro[i]>= Ladrao1)) {
					ValorRoubo = dinheiro[i] + ValorRoubo;
				}
			}
			
			System.out.println("O valor roubado foi: R$"+ (ValorRoubo+Ladrao1) +",00" );
			
			
		break;
		
		case 5:
			
			int valor[] = new int[5];
			boolean usos[] = {false, false,false ,false, false};
			
			int num;
			char alterar;
			
			for (int i = 0; i < valor.length; i++) {
				System.out.println("Digite o valor para a posição"+ (i+1));
				valor[i] = scanner.nextInt();
			}
			
			do {
				
			System.out.println("Você deseja mudar algum valor?");
			alterar = scanner.next().charAt(0);
			
			if (alterar == 's') {
				
				System.out.println("Qual posição você deseja mudar?");
				int aux = scanner.nextInt();
															
					if (usos[aux] == false) {
						System.out.println("Digite o valor novo para a posição: ");
						num = scanner.nextInt();
						valor[aux] = num;
						usos[aux] = true;

						System.out.println("O numero agora é: " + valor[aux]);
						
					} else {
						System.out.println("O valor não pode ser alterado novamente");
					}
					
					//System.out.println(usos[aux] + " " + valor[aux]);
			}
			} while(alterar != 'n');
			
		break;

		default:
			
			break;
		
		}
		
		
		
		scanner.close();

	}

}
