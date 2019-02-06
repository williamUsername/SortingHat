import java.util.Arrays;

public class SortingHat {
	
	public static void main(String[] agrs) 
	{
		int howMany = 10000;
		//int [ ] nums = getRandom(howMany);
		int [ ] nums0 = getAscendingOrder(howMany);
		int [ ] nums1 = nums0.clone();	
		
		int [] nums2 = getRandom(howMany);
		
		int [ ] nums3 = getDecendingOrder(howMany);
		
		
		//SelectionSort sSort = new SelectionSort(nums0, "Selection Sort");
		//doTiming(sSort);
		//System.out.println(sSort);
		
		
		BubbleSort bSort = new BubbleSort(nums2, "Bubble Sort");
		doTiming(bSort);
		System.out.println(bSort);
		
		
		InsertionSort iSS = new InsertionSort(nums2, "Insertion Sort");
		doTiming(iSS);
		System.out.println(iSS);
		
		//InsertionSort iSS2 = new InsertionSort(nums3, "Insertion Sort bad");
		//doTiming(iSS2);
		//System.out.println(iSS2);

		
		
	}
		
		
		
		public static void doTiming(PapaSort s)
		{
			long start = System.currentTimeMillis();
			long start2 = System.nanoTime();
			
			s.executeAlgorithm();
			
			
			
			long end = System.currentTimeMillis();
			long end2 = System.nanoTime();
			long theTime = end - start;
			long theTime2 = end2 - start2;

			
			if(s.getLength() <=100)
				{
					System.out.println("the time is " + theTime2 + " nanosecond(s)");
				}else
				{
					System.out.println("the time is " + theTime + " milisecond(s)");
				}
			

			
		}
//
//		//System.out.println(sSort);
//		
//		sSort.executeAlgorithm();
//		System.out.println(sSort);
//		bSort.executeAlgorithm();
//
//		
//		
//		for(int i = 0; i < nums.length; i++)
//		{
//			sSort.swap(i, howMany-1-i);
//		}
//		
	
	public static int[] getRandom(int n)
	{
		int [ ] nList = new int[n];
		 
		for(int i = 0; i < nList.length; i ++)
		{
			nList[i] = (int)(Math.random() * 1000);
			
		}
		
		return nList;
	}
	
	
	public static int[] getAscendingOrder(int n)
	{
		int [ ] nList = new int[n];

		for( int i = 0; i < nList.length; i++) 
		{
			nList[i] = i+1;
		}
		return nList;
	}
	
	public static int[] getDecendingOrder(int n)
	{
		int [ ] nList = new int[n];

		for( int i = 0; i < nList.length; i++) 
		{
			nList[i] = nList.length - i;
		}
		return nList;
	}
}
