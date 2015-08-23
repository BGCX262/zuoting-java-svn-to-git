package employee;
/*
 * the encapsulation of the information of the employee
 * ver1
 * written by elfzuo
 * 2013.10.14
 */
public class Employee {
	private String id,name;//�������
	private double wage,bonus;//���ʽ�������
	double taxrate;//˰��
	double submoney;//�۳���
	double socialensure;//����һ����
	int quickdeduction;//����۳���
	Employee(String id,String name){
		//���캯����ʼ���������
		if(id!=null && name!=null){
			this.id = id;
			this.name = name;
		}
		else{
			System.out.println("��������Ų���Ϊ��");
		}
	}
	//��ȡԱ��id
	String getId(){
		return id;
	}
	//��ȡԱ������
	String getName(){
		return name;
	}
	//��ȡԱ�����ʽ��
	double getWage(){
		return wage;
	}
	//��ȡԱ��������
	double getBonus(){
		return bonus;
	}
	//��ȡ����һ����
	double getSocialensure(){
		return socialensure;
	}
	//��ȡ���¿۳���
	double getsubmoney(){
		return submoney;
	}
	//����Ա�����ʽ��
	void setWage(double wage){
		if(wage > 0){
			this.wage = wage;
		}
		else{
			System.out.println("���ʽ���С����");
		}
	}
	//����Ա��������
	void setBonus(double bonus){
		if(bonus > 0){
			this.bonus = bonus;
		}
		else{
			System.out.println("�������С����");
		}
	}
	//����Ա������һ����
	void setSocialensure(double socialensure){
		if(socialensure > 0){
			this.socialensure = socialensure;
		}
		else{
			System.out.println("����һ�����С����");
		}
	}
	//���ÿ۳���
	void setSubmoney(double submoney){
		if(submoney > 0){
			this.submoney = submoney;
		}
		else{
			System.out.println("�۳�������С����");
		}
	}
	//�ж�˰�ʺ�����۳���
	private void settrandqd(){
		double sum = wage+bonus;
		System.out.println(sum);
		if(sum>=80000){
			this.taxrate = 0.45;
			this.quickdeduction =13505; 
			System.out.println("level 7");
		}
		else if(sum>=55000&&sum<80000){
			this.taxrate = 0.35;
			this.quickdeduction =5505; 
			System.out.println("level 6");
		}
		else if(sum>=35000&&sum<55000){
			this.taxrate = 0.30;
			this.quickdeduction =2755;
			System.out.println("level 5");
		}
		else if(sum>=9000&&sum<35000){
			this.taxrate = 0.25;
			this.quickdeduction =1005;
			System.out.println("level 4");
		}
		else if(sum>=4500&&sum<9000){
			this.taxrate = 0.20;
			this.quickdeduction =555; 
			System.out.println("level 3");
		}
		else if(sum>=1500&&sum<4500){
			this.taxrate = 0.10;
			this.quickdeduction =105; 
			System.out.println("level 2");
		}
		else if(sum>=0&&sum<1500){
			this.taxrate = 0.03;
			this.quickdeduction =0;
			System.out.println("level 1");
		}
	}
	double calculatetax(){
		settrandqd();
		//�����������˰
		System.out.println(this.taxrate);
		System.out.println(this.quickdeduction);
		double result = (wage+bonus-socialensure-submoney)*taxrate-quickdeduction;
		return result;
	}
}
class MainClass{
	public static void main(String[] args){
		//����Employee��ʵ��e1,��ʼ����������ֱ�Ϊ001,e1
		Employee e1 = new Employee("001","e1");
		//���ý�����Ϊ1000
		e1.setBonus(1000);
		//���ù��ʽ��Ϊ6000
		e1.setWage(6000);
		//��������һ����
		e1.setSocialensure(400);
		//���ÿ۳���
		e1.setSubmoney(500);
		//��ȡe1��id�����
		String id = e1.getId();
		System.out.println("id is "+id);
		//��ȡe1�����������
		String name = e1.getName();
		System.out.println("name is "+name);
		//��ȡe1�Ĺ��ʽ����
		double wage = e1.getWage();
		System.out.println("wage is "+wage);
		//��ȡe1�Ľ�������
		double bonus = e1.getBonus();
		System.out.println("bonus is "+bonus);
		//��ȡe1������һ������
		double socialensure = e1.getSocialensure();
		System.out.println("socialensure is "+socialensure);
		//��ȡe1�Ŀ۳��������
		double submoney = e1.getsubmoney();
		System.out.println("submoney is "+submoney);
		//�����������˰�����
		double tax = e1.calculatetax();
		System.out.println("tax is "+tax);
	}
}