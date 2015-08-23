package employee;
/*
 * the encapsulation of the information of the employee
 * ver1
 * written by elfzuo
 * 2013.10.14
 */
public class Employee {
	private String id,name;//编号姓名
	private double wage,bonus;//工资金额，奖金金额
	double taxrate;//税率
	double submoney;//扣除数
	double socialensure;//五险一金金额
	int quickdeduction;//速算扣除数
	Employee(String id,String name){
		//构造函数初始化编号姓名
		if(id!=null && name!=null){
			this.id = id;
			this.name = name;
		}
		else{
			System.out.println("姓名，编号不能为零");
		}
	}
	//获取员工id
	String getId(){
		return id;
	}
	//获取员工姓名
	String getName(){
		return name;
	}
	//获取员工工资金额
	double getWage(){
		return wage;
	}
	//获取员工奖金金额
	double getBonus(){
		return bonus;
	}
	//获取五险一金金额
	double getSocialensure(){
		return socialensure;
	}
	//获取当月扣除数
	double getsubmoney(){
		return submoney;
	}
	//设置员工工资金额
	void setWage(double wage){
		if(wage > 0){
			this.wage = wage;
		}
		else{
			System.out.println("工资金额不能小于零");
		}
	}
	//设置员工奖金金额
	void setBonus(double bonus){
		if(bonus > 0){
			this.bonus = bonus;
		}
		else{
			System.out.println("奖金金额不能小于零");
		}
	}
	//设置员工五险一金金额
	void setSocialensure(double socialensure){
		if(socialensure > 0){
			this.socialensure = socialensure;
		}
		else{
			System.out.println("五险一金金额不能小于零");
		}
	}
	//设置扣除数
	void setSubmoney(double submoney){
		if(submoney > 0){
			this.submoney = submoney;
		}
		else{
			System.out.println("扣除数不能小于零");
		}
	}
	//判断税率和速算扣除数
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
		//计算个人所得税
		System.out.println(this.taxrate);
		System.out.println(this.quickdeduction);
		double result = (wage+bonus-socialensure-submoney)*taxrate-quickdeduction;
		return result;
	}
}
class MainClass{
	public static void main(String[] args){
		//创建Employee类实例e1,初始化编号姓名分别为001,e1
		Employee e1 = new Employee("001","e1");
		//设置奖金金额为1000
		e1.setBonus(1000);
		//设置工资金额为6000
		e1.setWage(6000);
		//设置五险一金金额
		e1.setSocialensure(400);
		//设置扣除数
		e1.setSubmoney(500);
		//获取e1的id并输出
		String id = e1.getId();
		System.out.println("id is "+id);
		//获取e1的姓名并输出
		String name = e1.getName();
		System.out.println("name is "+name);
		//获取e1的工资金额并输出
		double wage = e1.getWage();
		System.out.println("wage is "+wage);
		//获取e1的奖金金额并输出
		double bonus = e1.getBonus();
		System.out.println("bonus is "+bonus);
		//获取e1的五险一金金额并输出
		double socialensure = e1.getSocialensure();
		System.out.println("socialensure is "+socialensure);
		//获取e1的扣除数并输出
		double submoney = e1.getsubmoney();
		System.out.println("submoney is "+submoney);
		//计算个人所得税并输出
		double tax = e1.calculatetax();
		System.out.println("tax is "+tax);
	}
}