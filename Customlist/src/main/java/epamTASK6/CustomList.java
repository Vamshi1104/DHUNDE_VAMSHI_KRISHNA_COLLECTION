package epamTASK6;
import java.util.Arrays;

public class CustomList<T> 
{
	private Object[] array;
	private static final int default_capacity=10;
	private int currsize=0;
	
	public CustomList()
	{
		array=new Object[default_capacity];
	}
	
	private void increaseSize()
	{
		array=Arrays.copyOf(array,array.length*2);
	}
	
	public T get(int index)
	{
		if(index<0||index>=currsize)
			throw new IndexOutOfBoundsException("for index: "+index);
		
		return (T)(array[index]);
	}
	
	public void add(T element)
	{
		if(currsize==array.length)
		{
			increaseSize();
		}
		array[currsize++]=element;
	}
	
	public int size()
	{
		return currsize;
	}
	
	public T remove(int index)
	{
		if(index<0||index>=currsize)
			throw new IndexOutOfBoundsException("for index: "+index);
		
		T elem=(T)(array[index]);
		
		for(int i=index;i<array.length-1;i++)
		{
			array[i]=array[i+1];
			
		}
		currsize--;
		return elem;
	}
	public boolean removeElement(T element)
	{
		boolean flag=false;
		for(int i=0;i<currsize;i++)
		{
			if(array[i].toString().equals(element.toString()))
			{
				flag=true;
				remove(i);
			}
		}
		return flag;
	}
	
	public void print()
	{
		System.out.print("[");
		for(int i=0;i<currsize;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
		
	}
	
}
