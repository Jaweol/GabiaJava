package chapter05;

public class Example04 {
	
	//총점을 구한 후 평균 리턴하
	public double calculateAverage(int[] array) { //{5,10,15,20,25}
		
		int sum=0;
		for(int i=0; i<array.length; i++) {
		//for(int num:array){
			//sum+=num;
			sum+=array[i];
		}
		System.out.println(sum);
		
		double avg=sum/array.length;
			
		return avg;
		}

	public static void main(String[] args) {
		

		Example04 calculator=new Example04();
		int[] numbers= {5,10,15,20,25};
			double average = calculator.calculateAverage(numbers);
		System.out.println("배열의 평균: " + average);
		

	}

}
