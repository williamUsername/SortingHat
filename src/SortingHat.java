import java.util.Arrays;

public class SortingHat {
	
	public int howMany = 100000;

	
	public static void main(String[] agrs) 
	{
		int howMany = 10;
		int [ ] nums0 = getAscendingOrder(howMany);
		int [ ] nums2 = getRandom(howMany); 
		int [ ] nums1 = nums2.clone();	
		int [ ] nums3 = getDecendingOrder(howMany);
		int [ ] nums4 = {1, 3, 5, 7, 9, 11, 13, 15, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};
		
		
		MergeSortNR ms = new MergeSortNR(nums2, "MS Non-Recursive:");
		
		doTiming(ms);
		
		MergeSortR msr = new MergeSortR(nums1, "MS Recursive:");
		
		doTiming(msr);
		
		
		
		
		//SelectionSort sSort = new SelectionSort(nums0, "Selection Sort");
		//doTiming(sSort);
		//System.out.println(sSort);
		
		
		//BubbleSort bSort = new BubbleSort(nums2, "Bubble Sort");
		//doTiming(bSort);
		//System.out.println(bSort);
		
		
		//InsertionSort iSS = new InsertionSort(nums2, "Insertion Sort");
		//doTiming(iSS);
		//System.out.println(iSS);
	
		
	}
		
		public static boolean checkList(int[] l)
		{
			for(int i = 0; i <= l.length - 1; i++)
			{
				if(l[i] <= l[i+1])
				{
					return false;
				}
			}
			return true;
		}
		
		public static void doTiming(PapaSort s)
		{
			System.out.println();
			
			if(s.getLength() <= 100)
			{
				System.out.println("before " + s);
			}
			
			
			long start = System.currentTimeMillis();
			long start2 = System.nanoTime();
			
			s.executeAlgorithm();
			
			
			
			long end = System.currentTimeMillis();
			long end2 = System.nanoTime();
			long theTime = end - start;
			long theTime2 = end2 - start2;

			
			if(s.getLength() <=100)
				{
					System.out.println(s.getSortName() +" time is " + theTime2 + " nanosecond(s)");
					System.out.println("After: " + s);
				}else
				{
					System.out.println(s.getSortName() + " time is " + theTime + " milisecond(s)");
				}
			
			if(checkList(s))
			{
				System.out.println("!$");
			} else
			{
				System.out.println("$");
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
	
	private static boolean checkList(PapaSort s) {
			// TODO Auto-generated method stub
			return false;
		}

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
