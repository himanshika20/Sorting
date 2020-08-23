import java.util.Scanner;
public class insertionSort 
{
	static public int a[];
	insertionSort(int n)
	{
		a=new int[n];
	}
	public void sort(int a[])
	{
		int swap=0;
		int key;
		for(int i=0;i<a.length-1;i++)
		{
			key=a[i+1];
			for(int j=i;j>=0;j--)
			{
				if(key<a[j])
				{
					swap++;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("number of swaps are "+swap);
		
	}
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	insertionSort ns=new insertionSort(n);
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	ns.sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}
}
