package PruebaHilos;

public class SumArray {

	private int sum;
	
	synchronized int sumArray (int nums[]) {
		sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum+= i;
			System.out.println("Total acumulado de "+ Thread.currentThread().getName()+ "es " +sum);
			
			try {
				Thread.sleep(10);
				
			}catch (InterruptedException exc) {
				System.out.println("Hilo interrumpido");
			}
		}
		return sum;
	}
	
	
	
}
