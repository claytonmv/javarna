 /**
 * Matriz num�rica
 * @author	Clayton de Medeiros Vasconcelos
 * @since	30/08/2017
 * @version	1		
 */
package br.com.iswtech.rna;

public class Matrix {
	private int Lines, Columns;
	private double MinValue, MaxValue;
	private double[] Data;

	// MAIN
	public static void main(String[] args) {
		Matrix m = new Matrix(5,5);
		m.setValue(0, 0, 1000.5);
		m.setValue(4, 4, 1000.5);
		m.print();
	}
	
	/**
	* Construtor
	* @author	Clayton de Medeiros Vasconcelos
	* @since	30/08/2017
	*/
	public Matrix() {
		this.Lines = 10;
		this.Columns = 10;
		this.MinValue = Double.MIN_VALUE;
		this.MaxValue = Double.MAX_VALUE;
		Data = new double[100];
	}
	
	/**
	* Construtor
	* @author	Clayton de Medeiros Vasconcelos
	* @since	30/08/2017
	* @param	valLines	N�mero de linhas
	* @param	valColumns	N�mero de colunas
	*/
	public Matrix(int valLines, int valColumns) {
		this.Lines = valLines;
		this.Columns = valColumns;
		this.MinValue = Double.MIN_VALUE;
		this.MaxValue = Double.MAX_VALUE;
		Data = new double[valLines*valColumns];
	}
	
	/**
	* M�todo para retorno do n�mero de colunas da matriz
	* @author	Clayton de Medeiros Vasconcelos
	* @since	30/08/2017
	* @return	N�mero de colunas da matriz	
	*/
	public int getColumns(){
		return this.Columns;
	}
	
	/**
	* M�todo para retorno do n�mero de linhas da matriz
	* @author	Clayton de Medeiros Vasconcelos
	* @since	30/08/2017
	* @return	N�mero de colunas da matriz	
	*/
	public int getLines(){
		return this.Lines;
	}
	
	/**
	* M�todo para retorno do valor de um elemento da matriz
	* @author	Clayton de Medeiros Vasconcelos
	* @since	30/08/2017
	* @param	valLine		Linha do elemento da matriz
	* @param	valColumn	Coluna do elemento da matriz
	* @return	Valor do elemento da matriz
	*/
	public double getValue(int valLine, int valColumn){
		// Verifica se linha ou coluna s�o menores que os limites da matriz
		if(valLine < 0 || valColumn < 0) return Double.NaN;
		
		// Verifica se linha ou coluna ultrapassam os limites de tamanho da matriz
		if(valLine >= this.Lines || valColumn >= this.Columns) return Double.NaN;
		
		// Atualiza o valor do elemento da matriz
		return(this.Data[(valLine*this.Lines)+(valColumn)]);
	}
	
	/**
	* M�todo para atualiza��o de elemento da matriz
	* @author	Clayton de Medeiros Vasconcelos
	* @since	30/08/2017
	* @param	valLine		Linha do elemento da matriz
	* @param	valColumn	Coluna do elemento da matriz
	* @param	valData		Valor de atualiza��o do elemento da matriz
	*/
	public void setValue(int valLine, int valColumn, double valData){
		// Verifica se linha ou coluna s�o menores que os limites da matriz
		if(valLine < 0 || valColumn < 0) return;
		
		// Verifica se linha ou coluna ultrapassam os limites de tamanho da matriz
		if(valLine >= this.Lines || valColumn >= this.Columns) return;
		
		// Atualiza o valor do elemento da matriz
		this.Data[(valLine*this.Lines)+(valColumn)]= valData;
	}
	
	/**
	* M�todo para impress�o da matriz
	* @author	Clayton de Medeiros Vasconcelos
	* @since	30/08/2017
	*/
	public void print(){
		System.out.print("Column \t\t");
		// Imprime cabe�alho das colunas
		for(int Z=0; Z < this.Columns; Z++){
			System.out.print(Z + "\t");
		}
		// Salta linha fim de cabe�alho
		System.out.print("\n\n");
		
		// Imprime matriz
		for(int Y=0; Y < this.Lines; Y++){
			// Imprime in�cio da linha
			System.out.print("Line " + Y + "\t|\t");
			// Imprime elementos da linha
			for(int X=0; X < this.Columns; X++){
				System.out.print(this.getValue(X, Y) + "\t");
			}
			// Imprime fim da linha
			System.out.print("|\n");
		}
	}

}
