import java.util.Scanner;


public class quickSort 
{
	static public int a[];
	quickSort(int n)
	{
		a=new int[n];
	}
	public int sort(int low1 , int high1 , int a[])
	{		
		int temp,temp2;
		int i=low1-1;
		int pivot=a[high1];
		for(int j=low1;j<high1;j++)
		{
			if(a[j]<pivot)
			{
				i=i+1;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp2=a[high1];
		a[high1]=a[i+1];
		a[i+1]=temp2;
		return i+1;
	}
	public void partition(int low , int high , int a[])
	{
		int index;
		if(low<high)
		{
			index=sort(low,high,a);
			partition(low,index-1,a);
			partition(index+1,high,a);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		quickSort qs=new quickSort(n);
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int low=0;
		int high=n-1;
		qs.partition(low , high , a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
