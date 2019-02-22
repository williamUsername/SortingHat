
public class MergeSortNR extends PapaSort {
	
	
	
	
	public MergeSortNR(int[] l, String sortName) {
		super(l, sortName);
		// TODO Auto-generated constructor stub
	}
	


	public void executeAlgorithm() 
	{
		
		
		//mine
		/*for(int k = 0; k < getLength() - 1; k++)
		{
			for(int i = 0, j = 1; j <= getLength() - 1 ; i+=2, j+=2)
			{
				merge(i,i,j,j);
			}
			for(int i = 1, j = 2; j <= getLength() - 1 ; i+=2, j+=2)
			{
				merge(i,i,j,j);
			}
		} */
		
		
		//NR mr roche
		 for(int j = 1, e=0; Math.pow(2.0, (double)(e)) <= this.getLength(); j*=2, e++)
		{
			for(int i =0; i < this.getLength() - 1; i+= j*2)
			{
				if(i+(j*2)-1 < this.getLength() - 1)
				{
					merge(i, i+j-1, i + j, i+(j*2)-1);
				}else
				{
					merge(i, i+j-1, i + j, this.getLength()-1);
				}
			}
		}
		 		
	}
	
	public void merge(int s1, int e1, int s2, int e2)
	{
		
		int l1 = s1;
		int l2 = s2;
		int [ ] temp = new int[(e1-s1 + 1) + (e2-s2 + 1)];
		int tPointer = 0;
		
		while(l1 <= e1 && l2 <= e2)
		{
			if(this.getElement(l1) < this.getElement(l2)) 
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
