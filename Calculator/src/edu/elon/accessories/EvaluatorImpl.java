package edu.elon.accessories;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EvaluatorImpl extends UnicastRemoteObject implements Evaluator {

	protected EvaluatorImpl() throws RemoteException {
		//nothing
	}

	@Override
	public double evaluate(double num1, double num2, String op) throws RemoteException {
		double num = 0.0;
		switch(op){
		case "+":
			num = num1+num2;
			break;
		case "-":
			num = num1-num2;
			break;
		case "/":
			num = num1/num2;
			break;
		case "*":
			num = num1*num2;
			break;
		default:
			return 0;
		}
		return num;
	}

}
