
	

public class MergeSortR extends PapaSort {
	
	
	
	
	public MergeSortR(int[] l, String sortName) {
		super(l, sortName);
		// TODO Auto-generated constructor stub
	}
	


	public void executeAlgorithm() 
	{
		mergeSort(0, this.getLength()-1);
		
	}
	
	private void mergeSort(int lStart, int lEnd)
	{
		int lMid = (lStart + lEnd) / 2;
		
		//System.out.println("in mergeSort list length is " + listen);;
	//	System.out.println("in MergeSort list start and end are " +lStart + " " + lEnd);
		
		if(lEnd > lStart)
		{
			mergeSort(lStart, lMid);
			mergeSort( lMid + 1, lEnd);
			
			merge(lStart, lMid, lMid + 1, lEnd);
		}
	}
	
	private void merge(int s1, int e1, int s2, int e2)
	{
		
		int l1 = s1;
		int l2 = s2;
		int [ ] temp = new int[(e1 - s1 + 1) + (e2 - s2 + 1)];
		int tPointer = 0;
		
		while(l1 <= e1 && l2 <= e2)
		{
			if(this.getElement(l1) <= this.getElement(l2)) 
			{
				temp[tPointer] = this.getElement(l1);
				l1++;
			}else
			{
				temp[tPointer] = this.getElement(l2);
				l2++;
			}
			tPointer++;
		}
		
		for(int tp = tPointer; tp < temp.length; tp++)
		{
			if(l1 <= e1)
			{
				temp[tp] = this.getElement(l1);
				l1++;
			}else 
			{
				temp[tp] = this.getElement(l2);
				l2++;
			}
		}
		
		
		
		
		for(int i = s1, t = 0; i <= e2; i++, t++)
		{
			this.setElement(i, temp[t]);
		}
		
	}
	
}
