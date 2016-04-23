package br.unifor.cct.cc.logica.pratica;

/**
 * 
 * @author Everton Guimaraes
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
		int[]matricula={1020, 1042, 1112, 1132, 1152, 1201, 1213, 1232, 1256, 1271};  
		String[]nome={"Ailton", "Marlos", "Rebeca", "Marco", "Jane", "Pedro", "Raquel", "Paulo", "Vitor", "Mara"};
		double[][]notas={{7.5, 8.9, 6.5}, {8.2, 7.3, 9.4}, {10.0, 9.6, 7.1}, {6.8, 7.5, 8.1}, {8.8, 7.4, 9.2},
						 {8.3, 7.9, 9.0}, {7.2, 8.7, 9.8}, {8.3, 7.7, 8.9}, {7.8, 7.7, 8.5}, {8.0, 7.0, 9.0}};
		int matri;
		imprimirtabela(matricula, nome, notas);
		imprimirmedia(nome, notas);
		do{
		System.out.println("Informe uma matricula");
		matri=scanner.nextInt();
		if(matriexistencia(matricula, matri)==true){
			for (int i = 0; i < matricula.length; i++) {
				if(procuraluno(matricula, matri)==i){
					System.out.println(nome[i]+""+medianotas(notas)[i]);
				}
			}
		}else{
			System.out.println("Matricula inválida");
		}
		}while(matri!=0);
	}
		static void imprimirtabela(int[]matricula, String[]nome, double[][]notas){
		for(int i=0;i<nome.length;i++){
			System.out.printf("%d %s \t", matricula[i], nome[i]);
			for(int j=0;j<3;j++){
				System.out.printf("%2.2f \t", notas[i][j]);
				if(j/2==1){
					System.out.printf("\n");
				}
			}
		}
		}
		
		static double[] medianotas(double[][]notas){
			double[] media=new double[10];
			int i;
			for(i=0;i<10;i++){
				media[i]=(notas[i][0]+notas[i][1]+notas[i][2])/3;
}
			return media;
}
		static void imprimirmedia(String[]nome, double[][]notas){
			for (int i = 0; i < 10; i++) {
				System.out.println(nome[i]+"      "+medianotas(notas)[i]);
			}
		}
		static boolean matriexistencia(int matricula[], int matri){
			boolean a=true;
			for(int i=0;i<matricula.length;i++){
				if (matricula[i]==matri){
					a=true;
				}else{
					if(i==9&&(matri!=matricula[i])){
					a=false;
					}
				}
			}
			return a;
}
		static int procuraluno(int matricula[], int matri){
			int j=0;
			if(matriexistencia(matricula, matri)==true){
				for (int i=0; i < matricula.length; i++) {
					if(matri==matricula[i]){
						j=i;
					}
				}
			}else{
				j=-1;
			}
			return j;
		}
}
	}

}
