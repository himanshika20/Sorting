import java.util.Scanner;
public class selectionSort 
{
	static public int a[];
	selectionSort(int n)
	{
		a=new int[n];
	}
	public void sort(int a[])
	{
		int swap=0;
	for(int i=0;i<a.length-1;i++)
	{
		int min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		if(min!=i)
		{
			swap++;
	int temp=a[i];
	a[i]=a[min];
	a[min]=temp;
		}
	}
	System.out.println("number of swaps are "+swap);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		selectionSort ss=new selectionSort(n);
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		ss.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}	
}
