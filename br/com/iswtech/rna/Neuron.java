 /**
 * Neurônio convencional para redes neurais artificiais
 * @author	Clayton de Medeiros Vasconcelos
 * @since	31/08/2017
 * @version	1		
 */
package br.com.iswtech.rna;

public class Neuron {
	private double[] InputData;	// Vetor de entrada
	private double OutputValue;	// Saída do neurônio
	private int FunctionType;	// Função 0=Degrau, 1=Degrau Bipolar, 2=Rampa Simetrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica

	// MAIN
	public static void main(String[] args) {
		Neuron n = new Neuron();
		System.out.println(n.funcGaussian(3, 4, 0.4));
	}
	
	/**
	* Construtor 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	*/
	public Neuron() {
		this.FunctionType=0;
		this.OutputValue=0;
	}
	
	/**
	* Construtor 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	*/
	public Neuron(int valFunctionType) {
		this.FunctionType=valFunctionType;
		this.OutputValue=0;
	}
	
	/**
	* Função Degrau
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU	Valor de entrada da função (soma ponderada dos pesos e entradas)
	* @return	Saída do neurônio (0 ou 1)
	*/
	private double funcHardLimiter(double valU){
		double g;
		if(valU<0)
			g = 0.0;
		else
			g = 1.0;
		return g;
	}
	
	/**
	* Função Degrau Bipolar
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU	Valor de entrada da função (soma ponderada dos pesos e entradas)
	* @return	Saída do neurônio (-1 ou 1)
	*/
	private double funcHardLimiterSymmetric(double valU){
		double g;
		if(valU<0)
			g = 1.0;
		else
			g = -1.0;
		return g;
	}
	
	
	/**
	* Função Rampa Simétrica
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU	Valor de entrada da função (soma ponderada dos pesos e entradas)
	* @param	valA	Valor limite. Define o intervalo superior e inferior da saída
	* @return	Saída do neurônio (entre -valA e valA)
	*/	
	private double funcRampSymmetric(double valU, double valA){
		double g;
		if(valU>valA)
			g = valA;
		else if(valU<(-1.0*valA))
			g = (-1.0*valA);
		else
			g = valU;
		return g;
	}
	
	/**
	* Função Gaussiana
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU		Valor de entrada da função (soma ponderada dos pesos e entradas)
	* @param	valC		Valor do centro
	* @param	valSigma	Valor do desvio padrão
	* @return	Saída do neurônio
	*/	
	private double funcGaussian(double valU, double valC, double valSigma){
		double g;
		g = Math.pow(Math.E,-1.0*((Math.pow((valU-valC),2)/(2 * Math.pow(valSigma, 2)))));
		return g;
	}
	
	/**
	* Função Logística
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU		Valor de entrada da função (soma ponderada dos pesos e entradas)
	* @param	valP		Valor do parâmetro de inclinação
	* @return	Saída do neurônio
	*/
	private double funcSigmoid(double valU, double valP){
		double y;
		y = (1.0 / (1.0 + Math.pow(Math.E,(-1.0*valP*valU))));
		return y;
	}

	/**
	* Função Tangente Hiperbólica
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU		Valor de entrada da função (soma ponderada dos pesos e entradas)
	* @param	valP		Valor do parâmetro de inclinação
	* @return	Saída do neurônio
	*/
	private double funcTanh(double valU, double valP){
		double y;
		y = (1.0 / (1.0 + Math.pow(Math.E,(-1.0*valP*valU))));
		y = (Math.pow(Math.E,(1.0*valP*valU)) - Math.pow(Math.E,(-1.0*valP*valU)))/(Math.pow(Math.E,(1.0*valP*valU)) + Math.pow(Math.E,(-1.0*valP*valU)));
		return y;
	}


	/**
	* Método de retorno do tipo de função do neurônio 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	* @return	Tipo de função. Tipos: 0=Degrau(padrão), 1=Degrau Bipolar, 2=Rampa Simétrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica
	*/
	public int getFunctionType() {
		// Tipos: 0=Degrau(padrão), 1=Degrau Bipolar, 2=Rampa Simétrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica
		return this.FunctionType;	
	}
	
	/**
	* Método de retorno do tipo de função do neurônio 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	* @return	Tipo de função. Tipos: 0=Degrau(padrão), 1=Degrau Bipolar, 2=Rampa Simétrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica
	*/
	public String getFunctionTypeString() {
		String Str;
		// Tipos: 0=Degrau(padrão), 1=Degrau Bipolar, 2=Rampa Simétrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica
		switch(this.FunctionType){
		case 0:
			Str="DEGRAU";
			break;
		case 1:
			Str="DEGRAU BIPOLAR";
			break;
		case 2:
			Str="RAMPA SIMÉTRICA";
			break;
		case 3:
			Str="GAUSSIANA";
			break;
		case 4:
			Str="LOGÍSTICA";
			break;		
		case 5:
			Str="TANGENTE HIPERBÓLICA";
			break;
		default:
			Str="DEGRAU";
			break;
		}
		return Str;
	}
	
	/**
	* Método de retorno do tipo de função do neurônio 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	* @return	Tipo de função. Tipos: 0=Degrau(padrão), 1=Degrau Bipolar, 2=Rampa Simétrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica
	*/
	public double getOutputValue() {
		// Tipos: 0=Degrau(padrão), 1=Degrau Bipolar, 2=Rampa Simétrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica
		return this.OutputValue;	
	}
	
	/**
	* Método de configuração do tipo de função do neurônio 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	* @param	valFunctionType	Função. Tipos: 0=Degrau(padrão), 1=Degrau Bipolar, 2=Rampa Simétrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica
	*/
	public void setFunctionType(int valFunctionType) {
		if(valFunctionType>=0 && valFunctionType<=5)
			// Ajusta tipo de função
			// Tipos: 0=Degrau(padrão), 1=Degrau Bipolar, 2=Rampa Simétrica, 3=Gaussiana, 4=Logística e 5=Hiperbólica
			this.FunctionType=valFunctionType;
		else
			// Ajusta tipo de função para Degrau (padrão)
			this.FunctionType=valFunctionType;
	}

}
