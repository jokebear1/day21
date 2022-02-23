package day211;

import java.util.Random;

import day211.Ex07;

class Ex07
{
	Random r=new Random();
	
	void test1(int[] scores) //1
	{
		for(int i=0; i<scores.length; i++)
		{
			int score=r.nextInt(1000)+1;
			scores[i]=score;		
		}
		System.out.println("문제1) 학생들의 성적: ");
		for(int i=0; i<scores.length; i++)
		{
			System.out.print(scores[i]+ " ");
		}
		System.out.println();
	}
	
	
	int test2(int[] scores)//2
	{
		int total=0;
		for(int i=0; i<scores.length; i++)
		{
			System.out.println(scores[i]+" ");
		}
		System.out.println();
		return total;
	}
	
	double test3(int[] scores)//3
	{
		double avg= test2(scores)/(double)scores.length;
		return avg;
	}
	
	int test4(int[] scores)//4
	{
		int count=0;
		for(int i=0; i<scores.length; i++)
		{
			if(scores[i]>=60)
			{
				count++;
			}
		}
		
		return count;
	}
	
	int test5(int[] scores, int idx)//5
	{
		int score=0;
		for(int i=0; i<scores.length; i++)
		{
			if(i==idx)
			{
				score=idx;
			}
		}
		return score;
	}
	
	
	
	int test6(int[] scores, int score)//6
	{
		int idx=-1;
		for(int i=0; i<scores.length; i++)
		{
			if(scores[i]==score)
			{
				idx=i;
			}
		}
		return idx;
	}
	
	
	int test7(int[] ids, int[] scores,int id)
	{
		int score=-1;
		int idx=-1;
		for(int i=0; i<scores.length; i++)
		{
			if(ids[i]==id)
			{
				idx=i;
			}
		}
		return score;
		
	}
			
	
	
	
	

}
public class score {
	public static void main(String[] args) {
		
		Ex07 e=new Ex07();
		
		int[] ids= {1001, 1002, 1003, 1004, 1005};
		int[] scores=new int[5];
		
		//문제1
		e.test1(scores);
		
		//문제2
		int total=e.test2(scores);
		System.out.println("문제2) 전교생의 총점: "+total);
		
		//문제3
		double avg=e.test3(scores);
		System.out.println("문제3) 전교생의 평균: "+avg);
		
		//4
		int count=e.test4(scores);
		System.out.println("문제4) 성적이 6-점 이상 합격생 수: "+count);
		
		//5
		int score=e.test5(scores, 1);
		System.out.println("문제5) 인덱스를 전달받아 성적 리턴: "+score);
		
		//6
		int idx=e.test6(scores, score);
		if(idx==-1)
		{
			System.out.println("존재하지않음");
		}
		else
		{
			System.out.println("문제6) 성적을 전달받아 인덱스 리턴: "+idx);
		}
		
		//7
		score=e.test7(ids, scores, 1000);
		if(score==-1)
		{
			System.out.println("존재하지않음");
		}
		else
		{
			System.out.println("문제7) 학번을 전달받아 성적 리턴: "+score);
		}
	}

}




