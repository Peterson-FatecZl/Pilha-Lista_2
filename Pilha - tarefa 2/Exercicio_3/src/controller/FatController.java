package controller;

import model.Stack;

public class FatController {

	public FatController() {

	}

	public int Fatorial(int valor) throws Exception {
		Stack pilha = new Stack();
		int calc = 1;

		while (valor > 1) {
			pilha.push(valor);
			valor -= 1;
		}
		while (!pilha.isEmpty()) {
			calc *= pilha.pop();
		}
		return calc;
	}
}
