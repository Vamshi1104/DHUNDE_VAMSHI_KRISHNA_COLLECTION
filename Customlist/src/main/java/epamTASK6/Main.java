package epamTASK6;

public class Main {
	public static void main(String[] args)
	{
		CustomList<String> names=new CustomList<String>();
		names.add("Vamshi");
		names.add("Krishna");
		names.add("Dhunde");
		names.add("EPAM");
		names.print();
		System.out.println(names.get(2));
		names.remove(3);
		names.removeElement("Dhunde");
		names.print();
		System.out.println(names.size());
	}
}
