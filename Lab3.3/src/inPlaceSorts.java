
public class inPlaceSorts {
	public static void main(String[] args)
	{
		int[] testList = {4, 5, 2, 7, 1, -6};
		insertionSort(testList);
		for(int i = 0; i < testList.length; i++)
		{
			System.out.println(testList[i]);
		}
		
	}
	
	public static void insertionSort(int[] list1)
	{
		//int index = 0;
		boolean swap = false;
		while(!swap)
		{
			int numSwaps = 0;
			for(int i = 0; i < list1.length; i++)
			{
				for(int j = i + 1; j < list1.length; j++)
				{
					int value;
					if(list1[i] > list1[j])
					{
						value = list1[j];
						list1[j] = list1[i];
						list1[i] = value;
						numSwaps++;
					}
					
				}
			}
			if(numSwaps == 0)
			{
				swap = true;
			}
		}
	}
	
	public static void selectionSort(double[] list1)
	{
		int swap = 0;
		for(int i = 0; i < list1.length-1; i++)
		{
			
		}
	}
	
	public static void bubbleSort(String[] list1)
	{
		
	}
}
