package shapes.main;

import shapes.functions.ParallelepFunctions;

public class ParallelMain {

	public static void main(String[] args) {
		ParallelepFunctions parallelFunc=new ParallelepFunctions();
		System.out.println("The count of parall which volume more than square is : "+parallelFunc.VolumeMoreThanSquare());
		System.out.println("The count of parall which square more than volume is : "+parallelFunc.SquareMoreThanVolume());
		System.out.println("Parall before sorting are :");
		parallelFunc.outArray();
		parallelFunc.sortVolumeUp();
		System.out.println("Parall after sorting volume UP :");
		parallelFunc.outArray();
		parallelFunc.sortSquareDown();
		System.out.println("Parall after sorting square DOWN :");
		parallelFunc.outArray();
}
}