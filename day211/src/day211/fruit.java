package day211;

class Fruit
{
	String name;
	int price;
}
public class fruit {
	public static void main(String[] args) {
		
		int s1=10;
		int s2=20;
		int s3=30;
		int[] arr= {10, 20, 30};
		
		Fruit f1= new Fruit();
		Fruit f2= new Fruit();
		Fruit f3= new Fruit();
		Fruit[] fruits= {new Fruit(), new Fruit(), new Fruit()};
		
		fruits[0].name="¿À·»Áö";
		fruits[0].price=3600;
		
		Fruit[] f=new Fruit[3];
		for(int i=0; i<3; i++)
		{
			f[i]=new Fruit();
		}
		f[0].name="»ç°ú";
		f[0].price=1200;
	}

}
