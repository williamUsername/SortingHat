
public class BubbleSort extends PapaSort{
	
	public BubbleSort(int [] l, String name)
	{
		super(l, name);
		System.out.println("Bubble Sort with Hieratchy");
	}

	
	private boolean bubbleIt(int end)
	{
		boolean didSwap = false;
		
		for(int i = 0; i < end; i++)
		{
			if(super.getElement(i) > super.getElement(i + 1))
			{
				super.swap(i, i + 1);
				didSwap = true;
			}

			
			
		}
		return didSwap;
	}

	public void executeAlgorithm() 
	{
		boolean notDone = true;
		int bubbleEnd = getList().length - 1;
		do {
			notDone = bubbleIt(bubbleEnd);
			if(notDone)
			{
				bubbleEnd -= 1;
			}
			//System.out.println(this);
		} while (notDone && bubbleEnd >= 1);
		
		bubbleIt(getList().length - 1);
	}
}
