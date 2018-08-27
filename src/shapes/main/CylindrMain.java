package shapes.main;

import java.util.Scanner;

import shapes.functions.CylFunctions;

public class CylindrMain {

	public static void main(String[] args) {
		CylFunctions cylFunction=new CylFunctions();
		System.out.println("Enter the volume for finding the count of cylindre less this volume");
		Scanner input=new Scanner(System.in);
		double volume;
		volume=input.nextDouble();
		System.out.println("Count of cylindres which volume less than "+volume+" is "+cylFunction.getCountSmallCyls(volume));
		System.out.println("Enter the min and max square");
		double s1=0;
		double s2=0;
		s1=input.nextDouble();
		s2=input.nextDouble();
		System.out.println("Count of cylindres between squares "+s1+" and "+s2+"is"+cylFunction.getSquareBetweenPar(s1, s2));
		System.out.println("Count of cylindres which volume less average is "+cylFunction.getCountVolumeLessAverage());
		System.out.println("Source array is :");
		cylFunction.outArray();
		cylFunction.sortByHeight();
		System.out.println("Cylindres after sorting by height are :");
		cylFunction.outArray();
		input.close();
	}

}
