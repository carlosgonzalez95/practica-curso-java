package Hilos;

import java.util.Set;

public class Heredando extends Thread {

	@Override
	public void run() {
		System.out.println("Ejecutando");
		super.run();

		System.out.println("Dentro de run");
		try {
			
			if (getName().equals("hilo1")) {
				System.out.println("Por fin despierto");
				sleep(3000);
			} else if (getName().equals("hilo3")) {
				System.out.println("Soy".concat(getName()));
				sleep(3000);
			} else {
				System.out.println("Soy otro hilo".concat(getName()));
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Heredando h = new Heredando();
		h.setName("hilo1");
		h.start();

		Heredando h2 = new Heredando();
		h2.setName("hilo2");
		h2.start();
		
		Heredando h3 = new Heredando();
		h3.setName("hilo3");
		h3.start();
		
		System.out.println("Hilos en ejecucion:" +Heredando.activeCount());
		
		Set<Thread> hilos = Heredando.getAllStackTraces().keySet();
		
		for (Thread hilo : hilos) {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append ("\""+hilo.getName());
			sb.append (";");
			sb.append (hilo.getPriority());
			sb.append (";");
			sb.append (hilo.isDaemon());
			sb.append (";");
			sb.append (hilo.getState());
			sb.append (";");
			System.out.println("\t" +sb);
		}
		
		

	}
}
