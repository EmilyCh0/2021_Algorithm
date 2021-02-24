package week7;
import java.util.*;

public class BOJ_1487{
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(); //�ο�
      int [][]arr=new int[n][2]; 
      
      for(int i=0;i<n;i++) {
         for(int j=0;j<2;j++) arr[i][j]=s.nextInt();   
      }

      int [] mon=new int[n];
      int [] tmp=new int[n];
      for(int i=0;i<n;i++) {
         int st=arr[i][0]; //������
         int sum=0;
         
         for(int j=0;j<n;j++) {
            if(arr[j][0]>=st && st-arr[j][1]>=0) {
               //���غ��� ���� ���� => ��ڴ�
               //���ؿ��� ��ۺ� �� ���� 0���� Ŀ����
               sum+= st-arr[j][1];
            }
         }
         mon[i]=sum;
         tmp[i]=mon[i];
      }
      
      Arrays.sort(tmp);
      int max=tmp[n-1]; //�ִ��� ����
      
      int result=0; //������ �ִ��� ������ �������϶� ���� ���� ������ ã�� ���� �ε��� ã��
      int min=-1;
      
      for(int i=0;i<n;i++) {
         if(mon[i]==max) {
            result=i;
            if(min==-1||min>arr[result][0]) {
            	min=arr[result][0];
            }
         }
      }

      if(max==0) {
         System.out.println(0);
      }else {
         System.out.println(min);
      }
      
   }
}
/*
import java.util.*;
public class BOJ_1487 {

   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt(); //�ο�
      int []arr=new int[n]; //���� �޴°�
      int []arr2=new int[n]; //��ۺ� ����
      
      for(int i=0;i<n;i++) {
         int a=s.nextInt();
         int b=s.nextInt();
         arr[i]=a;
         arr2[i]=a-b;
      }
      

      int mon[]=new int [n];
      int tmp[]=new int[n]; //�����Ҷ��
      for(int i=0;i<n;i++) {
         if(arr2[i]<=0) mon[i]=0;
         else {
            mon[i]=arr2[i]*(n-i);
            tmp[i]=mon[i];
         }
      }
      
      Arrays.sort(tmp); //�����ؼ� ���� ū �� ã�� (����)
      
//      for(int i=0;i<n;i++) System.out.print(tmp[i]+ " ");
//      System.out.println();
      
      int max =tmp[n-1]; //�ִ�
      int result=0; //������ �ִ��� ������ �������϶� ���� ���� ������ ã�� ���� �ε��� ã��
      
      for(int i=0;i<n;i++) {
         if(mon[i]==max) {
            result=i;
            break;
         }
      }

      if(max==0) {
         System.out.println(0);
      }else {
         System.out.println(arr2[result]);
      }
   }
}

import java.util.*;
public class BOJ_1487 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int price[] = new int[N];
		int deliv[] = new int[N];
		int adv[] = new int[N];
		for(int i=0;i<N;i++) {
			price[i]=scan.nextInt();
			deliv[i]=scan.nextInt();
			adv[i]=price[i]-deliv[i];
		}
		int max=adv[0];
		int maxIdx=0;
		for(int i=1;i<N;i++) {
			if(adv[i]>max) {
				max=adv[i];
				maxIdx=i;
				continue;
			}
			else if(adv[i]==max&&price[i]<price[maxIdx]) {
				max=adv[i];
				maxIdx=i;
			}
		}
		if(max<0) {
			System.out.print(0);
		}
		else {
			System.out.print(price[maxIdx]);
		}
	}
}

*/