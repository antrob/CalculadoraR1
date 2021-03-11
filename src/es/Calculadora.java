package es;

/**
 * A classe Calculadora contém métodos para realizar as operações aritméticas básicas com números reais.
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
	 * Calcula a soma de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da soma dos dois operandos
	 */
	public  static double somar( double operando1, double operando2) {
		return operando1 + operando2;
	}
	
	/**
	 * Calcula a subtracção de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da subtracção dos dois operandos
	 */
	public  static double subtrair( double operando1, double operando2) {
		return operando1 - operando2;
	}
	
	/**
	 * Calcula a multiplicação de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da multiplicação dos dois operandos
	 */
	public  static double multiplicar( double operando1, double operando2) {
		return operando1 * operando2;
	}
	
	/**
	 * Calcula a divisão de dois números reais.
	 * 
	 * @param operando1 valor do primeiro operando 
	 * @param operando2 valor do segundo operando 
	 * @return retorna o resultado da divisão dos dois operandos
	 * 		   No caso da divisão por zero, retorna Infinity e não gera qualquer excepção
	 * 
	 */
	public  static double dividir( double operando1, double operando2) {
		return operando1 / operando2;
	}
	
}
