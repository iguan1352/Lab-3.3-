
public class inPlaceSorts {
	public static void main(String[] args)
	{
		/*int[] testList = {4, 5, 2, 7, 1, -6};
		insertionSort(testList);
		for(int i = 0; i < testList.length; i++)
		{
			System.out.println(testList[i]);
		}*/
		
		/*double[] testList2 = {4, 5, 2, 7, 1, -6};
		selectionSort(testList2);
		for(int i = 0; i < testList2.length; i++)
		{
			System.out.println(testList2[i]);
		}*/
		
		String[] testList3 = {"best", "apple", "ever", "eaten"};
		bubbleSort(testList3);
		for(int i = 0; i < testList3.length; i++)
		{
			System.out.println(testList3[i]);
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
		int value = 0;
		double min = 0;
		int minPos = 0;
		while(value != list1.length)
		{
			for(int i = 0; i < list1.length; i++)
			{
				double swap;
				for(int j = i + 1; j < list1.length; j++)
				{
					if(list1[i] > list1[j] && list1[j-1] > list1[j])
					{
						min = list1[j];
						minPos = j;
					}
				}
				if(list1[value] > min)
				{
					swap = list1[value];
					list1[value] = min;
					list1[minPos] = swap;
					value++;
				}	
			}
		}
	}
	
	public static void bubbleSort(String[] list1)
	{
		boolean swap = false;
		while(!swap)
		{
			int numSwaps = 0;
			for(int i = 0; i < list1.length-1; i++)
			{
				String value;
				if(list1[i].compareTo("list1[i+1]") < 0)
				{
					value = list1[i+1];
					list1[i+1] = list1[i];
					list1[i] = value;
					numSwaps++;
				}
					
			}
			if(numSwaps == 0)
			{
				swap = true;
			}
		}
	}
}
