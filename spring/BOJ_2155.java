
package spring06;

import java.util.*;
public class BOJ_2155 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int idx=1;	// 1 3 5 7 9 tmp�� ����
		int tmp=1;	// 1 2 5 10 17
		int cnta=0; // �밢�� ����
		int cntb=0;
		int x_a=0;	
		int y_a=0;
		int x_b=0;
		int y_b=0;
		boolean right=true;
		int ans=0;
		
		while(true) {
			if(a>=tmp&&a<=tmp+x_a) {
				break;
			}
			tmp+=idx;
			idx+=2;
			x_a+=2;
			y_a--;
			cnta++;
		}		
		while(tmp!=a) {
			if(right) {
				tmp++;
				x_a--;
				y_a++;
				right=false;
			}
			else {
				tmp++;
				x_a++;
				y_a++;
				right=true;
			}
		}
		if(!right) {
			cnta--;
		}
		idx=1;
		tmp=1;
		right=true;		
		while(true) {
			if(b>=tmp&&b<=tmp+x_b) {
				break;
			}
			tmp+=idx;
			idx+=2;
			x_b+=2;
			y_b--;
			cntb++;
		}
		while(tmp!=b) {
			if(right) {
				tmp++;
				x_b--;
				y_b++;
				right=false;
			}
			else {
				tmp++;
				x_b++;
				y_b++;
				right=true;
			}
		}
		if(!right) {
			cntb--;
		}
		/* ���� 
		2 ���� 14
		2  --> (x,y)=(2,-1), cnt=1
		14 --> (x,y)=(6,1), cnt=3
		ans = x����+y����-cnt���� = 4+2-2 = 4
		3 ���� 12
		3  --> (x,y)=(1,0), cnt=0
		12 --> (x,y)=(6,1), cnt=3
		ans = 5+1-3 = 3 (Ʋ��! ������ 5)
		cnt���� > y������ �� ���� �߻�!
		�� ��� ���Ǵ� �밢���� ������ ��� (���Ǵ´밢�� = �ö󰬴� �������� ���)
		*/
		int diffx=Math.abs(x_a-x_b);
		int diffy=Math.abs(y_a-y_b);
		int diffcnt = Math.abs(cnta-cntb);
		
		int tmpcnt = diffcnt<=diffy?0:(diffcnt-diffy)/2;
	
		ans=diffx+diffy-diffcnt+tmpcnt*2;
		System.out.print(ans);
	}
}
