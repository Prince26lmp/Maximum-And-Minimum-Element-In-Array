package JavaDSA;

public class MaximumAndMinimumElementsInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,65,79};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
            {
	             max=arr[i];
            }
		}
		
		System.out.println("Maximum Element Is:"+max);
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
            {
	             min=arr[i];
            }
		}
		
		System.out.println("Maximum Element Is:"+min);
	}
}
