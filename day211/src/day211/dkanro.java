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
		System.out.println("전교생 성적: ");
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
		System.out.println("성적이 가장 높은학생: "+f);
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
		System.out.println("성적이 가장 낮은 학생: "+s);
	}
	
	
	void choice4()
	{
		int idx=-1;
		System.out.print("학번을 입력하시오: ");
		int id=sc.nextInt();
		for(int i=0; i<score.length; i++)
		{
			if(id==ids[i])
			{
				idx=i;
			}
		}
		System.out.print(id +"학생의 성적은 ");
		if(idx==1)
		{
			System.out.println("존재ㄴㄴ");
		}
		else
		{
			for(int i=0; i<ids.length; i++)
			{
				if(ids[i]==id)
				{
					System.out.println(score[i]+"점입니다");
				}
			}
		}
	}
	
	
	
	
	
}

public class dkanro {
	public static void main(String[] args) {
		Ex08 e=new Ex08();
		Scanner sc=new Scanner(System.in);
		
		e.name="메가 IT 고등학교";
		while(true)
		{
			System.out.println("==="+e.name+"===");
			System.out.println("1. 전교생 성적확인");
			System.out.println("2. 1등학생 성적확인");
			System.out.println("3. 꼴등학생 성적확인");
			System.out.println("4 (학번을 입력받아)성적확인");
			System.out.println("5. 종료하기");
			
			System.out.println("메뉴선택: ");
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
