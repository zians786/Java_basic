import java.util.*;
public class Triplet
{
	public static void main(String[] args)
	{
		int sum=0;
		int NumberOfTriplets=0;
		int[] a={-1,2,1,-2,1};
		Arrays.sort(a);
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}
	}
}
