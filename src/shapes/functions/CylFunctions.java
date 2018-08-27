package shapes.functions;

import java.util.Scanner;

import shapes.model.Cylindr;

public class CylFunctions {
	Cylindr[] cylindrs;
	Cylindr temp;
	
	public CylFunctions() {
		createArray();
	}
	public void createArray() {
		int count;
		System.out.println("Enter the count of cylindres");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		cylindrs=new Cylindr[count];
		for (int i = 0; i < cylindrs.length; i++) {
			System.out.println("Enter the a, b and height of "+(i+1)+" cylindr");
			int a=input.nextInt();
			int b=input.nextInt();
			int h=input.nextInt();
			cylindrs[i]=new Cylindr(a, b, h);
		}
	}
	public int getCountSmallCyls(double volume) { //расчет количества цилиндров, чей обьем меньше вводимого с консоли значения
		int count=0;
		for (int i = 0; i < cylindrs.length; i++) {
			if (cylindrs[i].getVolume()<volume) {
				count++;
			}
		}
		return count;
	}
	public int getSquareBetweenPar(double s1, double s2) { //расчет кол-ва цилиндров, чьи площади лежат в границах от и до вводимых значений
		int count=0;
		for (int i = 0; i < cylindrs.length; i++) {
			if (cylindrs[i].getSquare()<s2 && cylindrs[i].getSquare()>s1) {
				count++;
			}
		}
		return count; 
	}
	public double averageVolume() { 
		int averageVolume=0;
		for (int i = 0; i < cylindrs.length; i++) {
			averageVolume+=cylindrs[i].getVolume();
		}
		return averageVolume/cylindrs.length;
	}
	public int getCountVolumeLessAverage() { // расчет кол-ва цилиндров чьи объемы меньше объема средего арифметического
		int count=0;
		for (int i = 0; i < cylindrs.length; i++) {
			if (cylindrs[i].getVolume()<averageVolume()) {
				count++;
			}
		}
		return count;
	}
	public void outArray() {
		for (int i = 0; i < cylindrs.length; i++) {
			System.out.println(cylindrs[i]);
		}
	}
	public void sortByHeight() { // сортировка объемов по их высоте
		for (int border = 0; border < cylindrs.length-1; border++) {
			for (int i = 0; i < cylindrs.length-border-1; i++) {
				if (cylindrs[i].getH()>cylindrs[i+1].getH()) {
					temp=cylindrs[i];
					cylindrs[i]=cylindrs[i+1];
					cylindrs[i+1]=temp;
				}
			}
		}
	}
}

