 /**
 * Neur�nio convencional para redes neurais artificiais
 * @author	Clayton de Medeiros Vasconcelos
 * @since	31/08/2017
 * @version	1		
 */
package br.com.iswtech.rna;

public class Neuron {
	private double[] InputData;	// Vetor de entrada
	private double OutputValue;	// Sa�da do neur�nio
	private int FunctionType;	// Fun��o 0=Degrau, 1=Degrau Bipolar, 2=Rampa Simetrica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica

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
	* Fun��o Degrau
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU	Valor de entrada da fun��o (soma ponderada dos pesos e entradas)
	* @return	Sa�da do neur�nio (0 ou 1)
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
	* Fun��o Degrau Bipolar
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU	Valor de entrada da fun��o (soma ponderada dos pesos e entradas)
	* @return	Sa�da do neur�nio (-1 ou 1)
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
	* Fun��o Rampa Sim�trica
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU	Valor de entrada da fun��o (soma ponderada dos pesos e entradas)
	* @param	valA	Valor limite. Define o intervalo superior e inferior da sa�da
	* @return	Sa�da do neur�nio (entre -valA e valA)
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
	* Fun��o Gaussiana
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU		Valor de entrada da fun��o (soma ponderada dos pesos e entradas)
	* @param	valC		Valor do centro
	* @param	valSigma	Valor do desvio padr�o
	* @return	Sa�da do neur�nio
	*/	
	private double funcGaussian(double valU, double valC, double valSigma){
		double g;
		g = Math.pow(Math.E,-1.0*((Math.pow((valU-valC),2)/(2 * Math.pow(valSigma, 2)))));
		return g;
	}
	
	/**
	* Fun��o Log�stica
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU		Valor de entrada da fun��o (soma ponderada dos pesos e entradas)
	* @param	valP		Valor do par�metro de inclina��o
	* @return	Sa�da do neur�nio
	*/
	private double funcSigmoid(double valU, double valP){
		double y;
		y = (1.0 / (1.0 + Math.pow(Math.E,(-1.0*valP*valU))));
		return y;
	}

	/**
	* Fun��o Tangente Hiperb�lica
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017
	* @param	valU		Valor de entrada da fun��o (soma ponderada dos pesos e entradas)
	* @param	valP		Valor do par�metro de inclina��o
	* @return	Sa�da do neur�nio
	*/
	private double funcTanh(double valU, double valP){
		double y;
		y = (1.0 / (1.0 + Math.pow(Math.E,(-1.0*valP*valU))));
		y = (Math.pow(Math.E,(1.0*valP*valU)) - Math.pow(Math.E,(-1.0*valP*valU)))/(Math.pow(Math.E,(1.0*valP*valU)) + Math.pow(Math.E,(-1.0*valP*valU)));
		return y;
	}


	/**
	* M�todo de retorno do tipo de fun��o do neur�nio 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	* @return	Tipo de fun��o. Tipos: 0=Degrau(padr�o), 1=Degrau Bipolar, 2=Rampa Sim�trica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica
	*/
	public int getFunctionType() {
		// Tipos: 0=Degrau(padr�o), 1=Degrau Bipolar, 2=Rampa Sim�trica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica
		return this.FunctionType;	
	}
	
	/**
	* M�todo de retorno do tipo de fun��o do neur�nio 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	* @return	Tipo de fun��o. Tipos: 0=Degrau(padr�o), 1=Degrau Bipolar, 2=Rampa Sim�trica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica
	*/
	public String getFunctionTypeString() {
		String Str;
		// Tipos: 0=Degrau(padr�o), 1=Degrau Bipolar, 2=Rampa Sim�trica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica
		switch(this.FunctionType){
		case 0:
			Str="DEGRAU";
			break;
		case 1:
			Str="DEGRAU BIPOLAR";
			break;
		case 2:
			Str="RAMPA SIM�TRICA";
			break;
		case 3:
			Str="GAUSSIANA";
			break;
		case 4:
			Str="LOG�STICA";
			break;		
		case 5:
			Str="TANGENTE HIPERB�LICA";
			break;
		default:
			Str="DEGRAU";
			break;
		}
		return Str;
	}
	
	/**
	* M�todo de retorno do tipo de fun��o do neur�nio 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	* @return	Tipo de fun��o. Tipos: 0=Degrau(padr�o), 1=Degrau Bipolar, 2=Rampa Sim�trica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica
	*/
	public double getOutputValue() {
		// Tipos: 0=Degrau(padr�o), 1=Degrau Bipolar, 2=Rampa Sim�trica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica
		return this.OutputValue;	
	}
	
	/**
	* M�todo de configura��o do tipo de fun��o do neur�nio 
	* @author	Clayton de Medeiros Vasconcelos
	* @since	31/08/2017 
	* @param	valFunctionType	Fun��o. Tipos: 0=Degrau(padr�o), 1=Degrau Bipolar, 2=Rampa Sim�trica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica
	*/
	public void setFunctionType(int valFunctionType) {
		if(valFunctionType>=0 && valFunctionType<=5)
			// Ajusta tipo de fun��o
			// Tipos: 0=Degrau(padr�o), 1=Degrau Bipolar, 2=Rampa Sim�trica, 3=Gaussiana, 4=Log�stica e 5=Hiperb�lica
			this.FunctionType=valFunctionType;
		else
			// Ajusta tipo de fun��o para Degrau (padr�o)
			this.FunctionType=valFunctionType;
	}

}
