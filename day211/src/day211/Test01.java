package day211;

class product
{
	String name;
	int price;
}
public class Test01 {
	public static void main(String[] args) {
		product pr= new product();
		pr.name="���ڱ�";
		pr.price=1000;
		
		product[] arr=new product[3];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=new product();
			arr[i].price=10*(i+1);
		}
		
		arr[0].name="�Ӹ���";
		arr[1].name="������";
		arr[2].name="�迹��";
		
		System.out.println("arr[i]");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].name + " : " + arr[i].price);
		}
		System.out.println("temp");
		product temp=arr[1];
		System.out.println(temp.name + " : " + temp.price);
	}

}
