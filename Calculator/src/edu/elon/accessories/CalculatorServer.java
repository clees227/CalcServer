package edu.elon.accessories;

import java.rmi.RemoteException;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorServer {

	public static void main(String[] args){
		try{
			System.out.println("Server Starting up");
			Evaluator eval = new EvaluatorImpl();
			Context namingContext = new InitialContext();
			namingContext.bind("rmi:evaluator", eval);
			System.out.println("Waiting for calls");
		}
		catch (Exception e){
			e.printStackTrace();
		}


	}

}
