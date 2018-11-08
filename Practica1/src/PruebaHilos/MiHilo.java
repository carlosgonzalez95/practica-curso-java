package PruebaHilos;

public class MiHilo implements Runnable{

	Thread hilo;
	static SumArray sumA= new SumArray();
	int a[];
	int resp;
	
	MiHilo(String nombre, int nums[]){
		hilo=new Thread (this,nombre);
		a=nums;
	}
	public static MiHilo creaEInicia (String nombre, int nums[]) {
		MiHilo miHilo= new MiHilo(nombre,nums);
		
		miHilo.hilo.start();
		return miHilo;
	}
	
	@Override
	public void run() {
		System.out.println(hilo.getName()+ "iniciando.");
		resp = sumA.sumArray(a);
		System.out.println("Suma para" + hilo.getName() + "es:" +resp );
		System.out.println("hilo" + hilo.getName() + "iniciando.");
		
	}
	

}
