package model;

public class Stack {

	No top;
	
	public Stack() {//constructor
		top = null;
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int value) {
		No newElement = new No();
		newElement.dado = value;
		newElement.proximo = top;
		top = newElement;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int value = top.dado;
		top = top.proximo;
		return value;
	}
	
	public int top() throws Exception{
		if (isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int valor = top.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No aux = top;
			while(aux != null) {
				cont ++;
				aux = aux.proximo;
			}
		}
		return cont;
	}
	
}
