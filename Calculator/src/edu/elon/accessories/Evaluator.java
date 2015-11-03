package edu.elon.accessories;

import java.rmi.*;

public interface Evaluator extends Remote{
	double evaluate(double num1, double num2, String op) throws RemoteException;
}
