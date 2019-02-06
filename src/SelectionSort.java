import java.util.Arrays;

public class SelectionSort extends PapaSort{
	
	
	public SelectionSort(int[] l, String name) 
	{
		super(l, name);
		System.out.println("Selection Sort with Hieratchy");
	}
	
	public void executeAlgorithm()
	{

		for(int i = 0; i < getList().length - 1; i++)
		{
		
			int biggest = getElement(0);
			int bigLoc = 0;

			
			for(int j = 0; j < getList().length - i; j++)
				{
					if(biggest < getElement(j)) 
					{
						biggest = getElement(j);
						bigLoc = j;
					}
				}
			swap(bigLoc, super.getLength() - 1 - i);
	
		}
	
	}
}
	

