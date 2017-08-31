package br.com.iswtech.rna.perceptron.single;

public class MAIN {
	double [][] Amostras;
	double [] SaidaDesejada;

	public static void main(String[] args) {


	}
	
	public void carregaAmostras(){
		// Inicialização do vetor de saídas desejadas tamanho [30]
		SaidaDesejada = new double[]{-1.0, -1.0, -1.0, 1.0, 1.0, -1.0, 1.0, -1.0, 1.0, 1.0, -1.0, 1.0, -1.0, -1.0, -1.0, -1.0, 1.0, 1.0, 1.0, 1.0, -1.0, 1.0, 1.0, 1.0, 1.0, -1.0, -1.0, 1.0};
		
		// Inicialização do matrix de amostras tamanho [30][3]
		Amostras = new double [30][];
		Amostras[0] = new double[] {-0,6508, 0,1097, 4.0009};
		Amostras[1] = new double[] {-1.4492, 0.8896, 4.4005};
		Amostras[2] = new double[] {2.0850, 0.6876, 12.0710};
		Amostras[3] = new double[] {0.2626, 1.1476, 7.7985};
		Amostras[4] = new double[] {0.6418, 1.0234, 7.0427};
		Amostras[5] = new double[] {0.2569, 0.6730, 8.3265};
		Amostras[6] = new double[] {1.1155, 0.6043, 7.4446};
		Amostras[7] = new double[] {0.0914, 0.3399, 7.0677};
		Amostras[8] = new double[] {0.0121, 0.5256, 4.6316};
		Amostras[9] = new double[] {-0.0429, 0.4660, 5.4323};
		Amostras[10] = new double[] {0.4340, 0.6870, 8.2287};
		Amostras[11] = new double[] {0.2735, 1.0287, 7.1934};
		Amostras[12] = new double[] {0.4839, 0.4851, 7.4850};
		Amostras[13] = new double[] {0.4089, -0.1267, 5.5019};
		Amostras[14] = new double[] {1.4391, 0.1614, 8.5843};
		Amostras[15] = new double[] {-9.9115, -0.1973, 2.1962};
		Amostras[16] = new double[] {0.3654, 1.0475, 7.4858};
		Amostras[17] = new double[] {0.2144, 0.7515, 7.1699};
		Amostras[18] = new double[] {0.2013, 1.0014, 6.5489};
		Amostras[19] = new double[] {0.6483, 0.2183, 5.8991};
		Amostras[20] = new double[] {-0.1174, 0.2242, 7.2435};
		Amostras[21] = new double[] {-0.7970, 0.8795, 3.8762};
		Amostras[22] = new double[] {-1.0625, 0.6366, 2.4707};
		Amostras[23] = new double[] {0.5307, 0.1285, 5.6883};
		Amostras[24] = new double[] {-1.2200, 0.7777, 1.7252};
		Amostras[25] = new double[] {0.3957, 0.1076, 5.6623};
		Amostras[26] = new double[] {-0.1013, 0.5989, 7.1812};
		Amostras[27] = new double[] {2.4482, 0.9455, 11.2095};
		Amostras[28] = new double[] {2.0149, 0.6192, 10.9263};
		Amostras[29] = new double[] {0.2012, 0.2611, 5.4631};
	}

}
