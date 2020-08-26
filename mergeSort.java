import java.util.*;
public class mergeSort 
{
	static public int a[];
	mergeSort(int n)
	{
		a=new int[n];
	}
	public void partition(int beg,int end , int a[])
	{
		if(beg<end)
		{
			int middle=(beg+end)/2;
			partition(beg,middle,a);
			partition(middle+1,end,a);
			merge(beg,middle,end,a);	
		}
	}
	public void merge(int beg , int middle , int end , int a[])
	{
		int i=beg,j=middle+1;
		int k=beg;
		int b[]=new int[a.length];
		while(i<=middle&&j<=end)
		{
		if(a[i]<a[j])
		{
			b[k]=a[i];
			i++;
		}
		else
		{
			b[k]=a[j];
			j++;
		}
		k++;
		}
			while(j<=end)
			{
				b[k]=a[j];
				j++;
				k++;
			}
			while(i<=middle)
			{
				b[k]=a[i];
				i++;
				k++;
			}
		for(int l=beg;l<=end;l++)
		{
			a[l]=b[l];
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		mergeSort ms=new mergeSort(n);
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int beg=0,end=n-1;
		ms.partition(beg,end,a);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
