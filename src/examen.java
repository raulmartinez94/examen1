import java.util.Scanner;

public class examen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("Ingrese una Calificacion de 1-5 donde 5 es maxima puntuacion");
			Scanner S= new Scanner(System.in);
				System.out.println("Rating for The Amazing Spiderman");
			int Puntuacion;
			System.out.print("Puntuacion: ");
			Puntuacion=S.nextInt();
				System.out.print("Resultado: ");
				
			if (Puntuacion==1)
				{
					System.out.print("Pésima");
				}	
			if (Puntuacion==2)
				{
					System.out.print("Mala");
				}	
			if (Puntuacion==3)
				{
					System.out.print("Regular");
				}	
			if (Puntuacion==4)
				{
					System.out.print("Buena");
				}	
			if (Puntuacion==5)
				{
					System.out.print("Excelente");
				
				}	
			
		}

}
