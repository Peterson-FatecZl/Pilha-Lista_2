package view;

import controller.FatController;

public class Principal {

	public static void main(String[] args) throws Exception {
		FatController fatController = new FatController();

		int entrada = 5;
		
		System.out.println(fatController.Fatorial(entrada));
	}

}
