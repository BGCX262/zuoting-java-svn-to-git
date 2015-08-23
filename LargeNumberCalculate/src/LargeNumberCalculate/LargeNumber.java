package LargeNumberCalculate;
/*
 * the calculation between two positive large numbers
 * ver1
 * written by elfzuo
 * 2013.9.17
 */
/******************************************************************/
public class LargeNumber {	//��ɴ������ļӷ�
	
	boolean compare(int[] a, int[] b){//�жϱ������Ƿ���ڼ���
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>b[i])
			{
				return true;
			}
		}
		return false;
	}
	void printarray(int[] a){//��ӡ������Ԫ��
		/*
		 * ����a���һ������
		 * ����b�����һ������
		 * ����i���forѭ������
		 * k���ж������һ�����������Ӷ���������Ĵ�����
		 */
		int i = 0;
		int k = 0;
		//�ҵ���һ����Ϊ�������Ԫ���±�k����������ݿ��������Ҫ���������������
		for(i = 0; i<a.length; i++){
			if(a[i] != 0){
				k = i;
				break;
			}//if
		}//for
	    //�������a[i]������
		for(i = k; i<a.length; i++){
			System.out.print(a[i]);
		}//for
	}
/******************************************************************/
	void plus(int[] a, int[] b){
		/*
		 * ����a���һ������
		 * ����b�����һ������
		 * ����c��żӲ�����Ľ��
		 * ����i���forѭ������
		 * ����resultÿһ�μ�¼��Ӧλ����Ӻ�Ľ�����ж��Ƿ��λ
		 */
		int[] c = new int[a.length];
		int result = 0;
		printarray(a);
		System.out.print("����");
		printarray(b);
		System.out.print("����");
		//�������мӷ�����
		//�������±����ֵ��Ҳ���Ǵ����������λ���м���
		//���������±갤����ӣ����жϴ����㣬���λ
		for(int i = a.length-1; i>=0; i--){
			result = a[i] + b[i];
			if(result >= 10){
				c[i] = result % 10;
				a[i-1] = a[i-1] + 1;
			}//if
			else{
				c[i] = result;
			}//else
		}//for
		printarray(c);
		System.out.println();
	}//plus function


/******************************************************************/
	public void sub(int[] a, int[] b){//��ɼ�������
		/*
		 * ����a��ű�����
		 * ����b��ż���
		 * ����c��ż�������Ľ��
		 * ����i���forѭ������
		 * ����resultÿһ�μ�¼��Ӧλ�������Ľ�����ж��Ƿ��λ
		 */
		int[] c = new int[a.length];
		int result = 0;
		printarray(a);
		System.out.print("��ȥ");
		printarray(b);
	    System.out.print("����");
	    //System.out.println(compare(a,b));
	    //������������ڼ�������������ļ�������
	    if(compare(a,b) == true)
	    {
	    	//���������±꣬�������м�������
		    //�������±����Ҳ���Ǵ��������λ��ʼ���м���
		    //���жϽ���Ƿ�С���㣬����һλ��λ
			for(int i = a.length-1; i>0; i--){
				result = a[i] - b[i];
				if(result < 0){
					c[i] = 10 + result;
					a[i-1] = a[i-1] - 1;
				}//if
				else{
					c[i] = result;
				}//else
			}
			printarray(c);
	    }//if compare(a,b) == true
	    
	    //����������ȼ���С�����ü�����ȥ��������������ǰ�����롰-����ʾδ����
	    else if(compare(a,b) == false){
	    	//���������±꣬�������м�������
		    //�������±����Ҳ���Ǵ��������λ��ʼ���м���
		    //���жϽ���Ƿ�С���㣬����һλ��λ
			for(int i = a.length-1; i>0; i--){
				result = b[i] - a[i];
				if(result < 0){
					c[i] = 10 + result;
					a[i-1] = a[i-1] - 1;
				}//if
				else{
					c[i] = result;
				}//else
			}
			
		    System.out.print("-");
			printarray(c);
	    }//else if(compare(a,b)==false)
	    System.out.println();
	}//fun sub
}// class LargeNumber
