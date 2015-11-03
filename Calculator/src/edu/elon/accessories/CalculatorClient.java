package edu.elon.accessories;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorClient {

	public static void main(String[] args) {
		System.setProperty("java.security.policy", "client.policy");
		System.setSecurityManager(new SecurityManager());
		String url = "rmi://localhost:8080/";
		Evaluator eval = null;
		try{
			Context namingContext = new InitialContext();
			eval = (Evaluator) namingContext.lookup(url+"evaluator");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Calculator calc = new Calculator(eval);
	}

}
