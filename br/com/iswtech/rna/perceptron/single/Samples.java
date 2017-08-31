 /**
 * Classe com a mostra de teste para o treinamento de rna Perceptron de uma camada (1 neurônio)
 * @author	Clayton de Medeiros Vasconcelos
 * @since	31/08/2017
 * @version	1		
 */
package br.com.iswtech.rna.perceptron.single;

public class Samples {
	final int NumSamples = 30;
	double [][] SamplesData;
	double [] OutputRequest;

	public static void main(String[] args) {


	}
	
	 /**
	 * Método de criação das amostras de entrada
	 * @author	Clayton de Medeiros Vasconcelos
	 * @since	31/08/2017	
	 */
	public void carregaSamplesData(){
		// Inicialização do vetor de saídas desejadas tamanho [30]
		OutputRequest = new double[]{-1.0, -1.0, -1.0, 1.0, 1.0, -1.0, 1.0, -1.0, 1.0, 1.0, -1.0, 1.0, -1.0, -1.0, -1.0, -1.0, 1.0, 1.0, 1.0, 1.0, -1.0, 1.0, 1.0, 1.0, 1.0, -1.0, -1.0, 1.0};
		
		// Inicialização do matrix de SamplesData tamanho [30][3]
		SamplesData = new double [30][];
		SamplesData[0] = new double[] {-0,6508, 0,1097, 4.0009};
		SamplesData[1] = new double[] {-1.4492, 0.8896, 4.4005};
		SamplesData[2] = new double[] {2.0850, 0.6876, 12.0710};
		SamplesData[3] = new double[] {0.2626, 1.1476, 7.7985};
		SamplesData[4] = new double[] {0.6418, 1.0234, 7.0427};
		SamplesData[5] = new double[] {0.2569, 0.6730, 8.3265};
		SamplesData[6] = new double[] {1.1155, 0.6043, 7.4446};
		SamplesData[7] = new double[] {0.0914, 0.3399, 7.0677};
		SamplesData[8] = new double[] {0.0121, 0.5256, 4.6316};
		SamplesData[9] = new double[] {-0.0429, 0.4660, 5.4323};
		SamplesData[10] = new double[] {0.4340, 0.6870, 8.2287};
		SamplesData[11] = new double[] {0.2735, 1.0287, 7.1934};
		SamplesData[12] = new double[] {0.4839, 0.4851, 7.4850};
		SamplesData[13] = new double[] {0.4089, -0.1267, 5.5019};
		SamplesData[14] = new double[] {1.4391, 0.1614, 8.5843};
		SamplesData[15] = new double[] {-9.9115, -0.1973, 2.1962};
		SamplesData[16] = new double[] {0.3654, 1.0475, 7.4858};
		SamplesData[17] = new double[] {0.2144, 0.7515, 7.1699};
		SamplesData[18] = new double[] {0.2013, 1.0014, 6.5489};
		SamplesData[19] = new double[] {0.6483, 0.2183, 5.8991};
		SamplesData[20] = new double[] {-0.1174, 0.2242, 7.2435};
		SamplesData[21] = new double[] {-0.7970, 0.8795, 3.8762};
		SamplesData[22] = new double[] {-1.0625, 0.6366, 2.4707};
		SamplesData[23] = new double[] {0.5307, 0.1285, 5.6883};
		SamplesData[24] = new double[] {-1.2200, 0.7777, 1.7252};
		SamplesData[25] = new double[] {0.3957, 0.1076, 5.6623};
		SamplesData[26] = new double[] {-0.1013, 0.5989, 7.1812};
		SamplesData[27] = new double[] {2.4482, 0.9455, 11.2095};
		SamplesData[28] = new double[] {2.0149, 0.6192, 10.9263};
		SamplesData[29] = new double[] {0.2012, 0.2611, 5.4631};
	}

}
