
public class InsertionSort extends PapaSort{
	
	public InsertionSort(int [] l, String sortName)
	{
		super(l, sortName);
		
	}
	
	public void executeAlgorithm()
	{
		for(int i = 1; i < this.getLength(); i++)
		{
			int j = i;
			while(j > 0 && super.getElement(j) < super.getElement(j - 1))
			{
				swap(j, j -1);
				j--;
			}
		}
	}

}
