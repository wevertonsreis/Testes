package br.com.student.manager;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(Calculadora.class)
public class CalculadoraBean implements Calculadora {

	@Override
	public double soma(double a, double b) {
		return a + b;
	}

	@Override
	public double subtrai(double a, double b) {
		return a - b;
	}

	@Override
	public double multiplica(double a, double b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		return a / b;
	}

}