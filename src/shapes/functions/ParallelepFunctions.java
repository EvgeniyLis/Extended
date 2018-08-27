package shapes.functions;

import java.util.Scanner;

import shapes.model.Parallelepiped;

public class ParallelepFunctions {
	Parallelepiped[] parallelepipeds;
	Parallelepiped temp;
	
	public ParallelepFunctions() {
		createArray();
	}
	
	public void outArray() {
		for (int i = 0; i < parallelepipeds.length; i++) {
			System.out.println(parallelepipeds[i]);
		}
	}
	
	public void createArray() {
		int count;
		System.out.println("Enter the count of parallelepipeds");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		parallelepipeds=new Parallelepiped[count];
		for (int i = 0; i < parallelepipeds.length; i++) {
			System.out.println("Enter three sides of "+(i+1)+" parallelepiped");
			int a=input.nextInt();
			int b=input.nextInt();
			int c=input.nextInt();
			parallelepipeds[i]=new Parallelepiped(a, b, c);
		}
	}	
	
	public int VolumeMoreThanSquare() {
		int count=0;
		for (int i = 0; i < parallelepipeds.length; i++) {
			if (parallelepipeds[i].getVolume()>parallelepipeds[i].getSquare()) {
				count++;
			}
		}
		return count;
	}
	
	public int SquareMoreThanVolume() {
		int count=0;
		for (int i = 0; i < parallelepipeds.length; i++) {
			if (parallelepipeds[i].getSquare()>parallelepipeds[i].getVolume()) {
				count++;
			}
		}
		return count;
	}
	
	//сортировка по увеличению объемов
	public void sortVolumeUp() {
		for (int border = 0; border < parallelepipeds.length-1; border++) {
			for (int i = 0; i < parallelepipeds.length-border-1; i++) {
				if (parallelepipeds[i].getVolume()>parallelepipeds[i+1].getVolume()) {
					temp=parallelepipeds[i];
					parallelepipeds[i]=parallelepipeds[i+1];
					parallelepipeds[i+1]=temp;
				}
			}
		}
	}
	//сортировка по уменьшению площадей
	public void sortSquareDown() {
		for (int border = 0; border < parallelepipeds.length-1; border++) {
			for (int i = 0; i < parallelepipeds.length-border-1; i++) {
				if (parallelepipeds[i].getSquare()<parallelepipeds[i+1].getSquare()) {
					temp=parallelepipeds[i];
					parallelepipeds[i]=parallelepipeds[i+1];
					parallelepipeds[i+1]=temp;
				}
			}
		}
	}
}
