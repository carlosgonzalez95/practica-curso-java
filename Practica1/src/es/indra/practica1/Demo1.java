/**
 * 
 */
package es.indra.practica1;
/**
 * @author josejarizav
 *
 */
public class Demo1 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		String cadena1 = "Hola, soy....";
		String cadena2 = "José Julián";
		
		System.out.println(cadena1 + " " +  cadena2);
		
		StringBuilder sb = new StringBuilder();
		sb.append(cadena1);
		
		sb.append(" ");
		
		sb.append(cadena2);
		
		System.out.println(sb.length());
		System.out.println(sb.toString());
		
		System.out.println(cadena1.equals(cadena2));
		
		System.out.println(cadena1.equals(cadena2) ?  "Verdadero"  : "Falso"   );
		
		System.out.println(cadena1 == cadena2);
		
		
		
		
		Limite <Integer> caja1 = new Limite <>();
		caja1.setT(34);
		System.out.println("Contenido caja 1:"+ caja1);

		
		Limite <String> caja2 = new Limite <>();
		Limite <Integer> caja2String;
	//	caja2String.setT("Hola");
	//	System.out.println("Contenido caja 1:"+ caja1);
		
		

	}

}
