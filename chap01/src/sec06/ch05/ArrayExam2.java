package sec06.ch05;

public class ArrayExam2 {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		for (int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
		
		for (int i=0; i<array.length; i++) {
			System.out.printf("array[%d] : %d\n", i, array[i]);
		}
	}

}
