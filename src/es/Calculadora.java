package es;

/**
 * A classe Calculadora cont�m m�todos para realizar as opera��es aritm�ticas b�sicas com n�meros reais.
 * 
 * <ul>
 * 	<li>somar</li>
 * 	<li>subtrair</li>
 * 	<li>multiplicar</li>
 * 	<li>dividir</li>
 * </ul>
 * 
 * @author AntRob
 *
 */
public class Calculadora {
	
	
	/**
	 * Calcula a soma de dois n�meros reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da soma dos dois operandos
	 */
	public  static double somar( double operando1, double operando2) {
		return operando1 + operando2;
	}
	
	/**
	 * Calcula a subtrac��o de dois n�meros reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da subtrac��o dos dois operandos
	 */
	public  static double subtrair( double operando1, double operando2) {
		return operando1 - operando2;
	}
	
	/**
	 * Calcula a multiplica��o de dois n�meros reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da multiplica��o dos dois operandos
	 */
	public  static double multiplicar( double operando1, double operando2) {
		return operando1 * operando2;
	}
	
	/**
	 * Calcula a divis�o de dois n�meros reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da divis�o dos dois operandos
	 * 		   No caso da divis�o por zero, retorna Infinity e n�o gera qualquer excep��o
	 * 
	 */
	public  static double dividir( double operando1, double operando2) {
		return operando1 / operando2;
	}
	
}
