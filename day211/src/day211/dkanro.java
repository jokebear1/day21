package day211;

import java.util.Random;
import java.util.Scanner;

class Ex08
{
	Scanner sc=new Scanner(System.in);
	Random ran=new Random();
	String name="";
	
	int[] score= {92, 38, 87, 100,11};
	int[] ids= {1001, 1002, 1003, 1004, 1005};
	
	
	
	void choice1()
	{
		System.out.println("������ ����: ");
		for(int i=0; i<score.length; i++)
		{
			System.out.println(score[i]+ " ");
		}
		System.out.println();
	}
	
	
	void choice2()
	{
		int f=0;
		for(int i=0; i<score.length; i++)
		{
			if(f<score[i])
			{
				f=score[i];
			}
		}
		System.out.println("������ ���� �����л�: "+f);
	}
	
	
	void choice3()
	{
		int s=score[0];
		for(int i=0; i<score.length; i++)
		{
			if(s>score[i])
			{
				s=score[i];
			}
		}
		System.out.println("������ ���� ���� �л�: "+s);
	}
	
	
	void choice4()
	{
		int idx=-1;
		System.out.print("�й��� �Է��Ͻÿ�: ");
		int id=sc.nextInt();
		for(int i=0; i<score.length; i++)
		{
			if(id==ids[i])
			{
				idx=i;
			}
		}
		System.out.print(id +"�л��� ������ ");
		if(idx==1)
		{
			System.out.println("���礤��");
		}
		else
		{
			for(int i=0; i<ids.length; i++)
			{
				if(ids[i]==id)
				{
					System.out.println(score[i]+"���Դϴ�");
				}
			}
		}
	}
	
	
	
	
	
}

public class dkanro {
	public static void main(String[] args) {
		Ex08 e=new Ex08();
		Scanner sc=new Scanner(System.in);
		
		e.name="�ް� IT ����б�";
		while(true)
		{
			System.out.println("==="+e.name+"===");
			System.out.println("1. ������ ����Ȯ��");
			System.out.println("2. 1���л� ����Ȯ��");
			System.out.println("3. �õ��л� ����Ȯ��");
			System.out.println("4 (�й��� �Է¹޾�)����Ȯ��");
			System.out.println("5. �����ϱ�");
			
			System.out.println("�޴�����: ");
			int sel= sc.nextInt();
			
			if(sel==1)
			{
				e.choice1();
			}
			else if(sel==2)
			{
				e.choice2();
			}
			else if(sel==3)
			{
				e.choice3();
			}
			else if(sel==4)
			{
				e.choice4();
			}
					
		}
	}

}
