package anydoor;
import java.util.*;
/*
 * create doors at any size,color,material or function
 * ver1
 * written by elfzuo
 * 2013.10.16
 */

//����anyDoor�ӿڣ�ֻ��ע��ʾ�Ź��ܵĲ�����
interface anyDoor {
	public void displayfunction();
}
//��װһ������ŵ����Եĳ�����
public abstract class Door{
	private double width;//�ŵĿ��
	private double high;//�ŵĸ߶�
	private String color;//�ŵ���ɫ
	private String material;//�ŵĲ���
	Door(){
		//ʵ���޲ι��캯������������ʹ��
		width = 1.2;//Ĭ���޲�ʱ�ŵĿ�Ϊ1.2m
		high = 2.5;//Ĭ���޲�ʱ�ŵĸ߶�Ϊ2.5m
	}
	Door(double width,double high,String color,String material){
		//ʵ�ִ��εĹ��캯������������ʹ��
		this.width = width;
		this.high = high;
	}
	abstract void openDoor();//�������󷽷������ű���
	abstract void closeDoor();//�������󷽷������ű��ر�
	void setWidth(double width){
		//�����ŵĿ��
		this.width = width;
	}
	void setHigh(double high){
		//�����ŵĸ߶�
		this.high = high;
	}
	void setColor(String color){
		//�����ŵĸ߶�
		this.color = color;
	}
	void setMaterial(String material){
		//�����ŵĸ߶�
		this.material = material;
	}
	double getHigh(){
		//��ȡ�ŵĸ߶�
		return high;
	}
	double getWidth(){
		//��ȡ�ŵĿ��
		return width;
	}
	String getColor(){
		//��ȡ�ŵ���ɫ
		return color;
	}
	String getMaterial(){
		//��ȡ�ŵĲ���
		return material;
	}
	
}
class thiefproofDoor extends Door implements anyDoor{
	//��������̳�Door�ಢ��ʵ��anyDoor�ӿ�
	thiefproofDoor(){
		//ʹ�ø����޲ι��췽��
		super();
	}
	thiefproofDoor(double width, double high, String color, String material) {
		//ʹ�ø�����ι��췽��
		super(width, high, color, material);
	}
	
	@Override
	public void displayfunction() {
		//��д�ӿڷ���
		System.out.println("������");
	}

	@Override
	void openDoor() {
		//��д������󷽷�
		System.out.println("�������Ѵ�");
		
	}

	@Override
	void closeDoor() {
		//��д������󷽷�
		System.out.println("�������ѹر�");
		
	}
	
}
class waterproofDoor extends Door implements anyDoor{
	//��ˮ����̳�Door�ಢ��ʵ��anyDoor�ӿ�
	waterproofDoor(){
		//ʹ�ø����޲ι��췽��
		super();
	}
	
	waterproofDoor(double width, double high, String color, String material) {
		//ʹ�ø�����ι��췽��
		super(width, high, color, material);
	}

	@Override
	public void displayfunction() {
		//��д�ӿڷ���
		System.out.println("��ˮ��");
	}

	@Override
	void openDoor() {
		// ��д������󷽷�
		System.out.println("��ˮ���Ѵ�");
		
	}

	@Override
	void closeDoor() {
		// ��д������󷽷�
		System.out.println("��ˮ���ѹر�");
		
	}
	
}
class bulletproofDoor extends Door implements anyDoor{
	//��������̳�Door�ಢ��ʵ��anyDoor�ӿ�
	bulletproofDoor(){
		//ʹ�ø����޲ι��췽��
		super();
	}
	bulletproofDoor(double width, double high, String color, String material) {
		//ʹ�ø�����ι��췽��
		super(width, high, color, material);
	}

	@Override
	public void displayfunction() {
		// ��д�ӿڷ���
		System.out.println("������");
	}

	@Override
	void openDoor() {
		// ��д������󷽷�
		System.out.println("�������Ѵ�");
		
	}

	@Override
	void closeDoor() {
		// ��д������󷽷�
		System.out.println("�������ѹر�");
		
	}
	
}
class fireproofDoor extends Door implements anyDoor{
	//�����ż̳�Door�ಢ��ʵ��anyDoor�ӿ�
	fireproofDoor(){
		//ʹ�ø����޲ι��췽��
		super();
	}
	fireproofDoor(double width, double high, String color, String material) {
		//ʹ�ø�����ι��췽��
		super(width, high, color, material);
	}

	@Override
	public void displayfunction() {
		// ��д�ӿڷ���
		System.out.println("������");
	}

	@Override
	void openDoor() {
		// ��д������󷽷�
		System.out.println("�������Ѵ�");
		
	}

	@Override
	void closeDoor() {
		// ��д������󷽷�
		System.out.println("�������ѹر�");
		
	}
	
}
class rustproofDoor extends Door implements anyDoor{
	//�����ż̳�Door�ಢ��ʵ��anyDoor�ӿ�
	rustproofDoor(){
		//ʹ�ø����޲ι��췽��
		super();
	}
	rustproofDoor(double width, double high, String color, String material) {
		//ʹ�ø�����ι��췽��
		super(width, high, color, material);
	}

	@Override
	public void displayfunction() {
		// ��д�ӿڷ���
		System.out.println("������");
	}

	@Override
	void openDoor() {
		// ��д������󷽷�
		System.out.println("�������Ѵ�");
		
	}

	@Override
	void closeDoor() {
		// ��д������󷽷�
		System.out.println("�������ѹر�");
		
	}
}
//��װ�����û�ѡ��˵�����
class userdisplay{
	//����ѡ��˵�
	 Door functionselect(){
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("***        ��������Ҫ�����Ĺ���                     ***");
		System.out.println("***          (����0�˳�)            ***");
		System.out.println("***          1: ������                                 ***");
		System.out.println("***          2: ��ˮ��                                 ***");
		System.out.println("***          3: ������                                 ***");
		System.out.println("***          4: ������                                 ***");
		System.out.println("***          5: ������                                 ***");
		System.out.println("*************************************");
		System.out.println("*************************************");
	    Scanner select = new Scanner(System.in);//�ȴ��û�����ѡ��
	    int i = select.nextInt();
	    Door door = null;
	    switch(i){//�����û�ѡ�����ɲ�ͬ����
	    case 1:
	    	door = new thiefproofDoor();
	    	System.out.println("�����ɷ�����");
	    	break;
	    case 2:
	    	door = new waterproofDoor();
	    	System.out.println("�����ɷ�ˮ��");
	    	break;
	    case 3:
	    	door = new bulletproofDoor();
	    	System.out.println("�����ɷ�����");
	    	break;
	    case 4:
	    	door = new fireproofDoor();
	    	System.out.println("�����ɷ�����");
	    	break;
	    case 5:
	    	door = new rustproofDoor();
	    	System.out.println("�����ɷ�����");
	    	break;
	    }
	    return door;//�����ɵ��ŷ���
	}
	 
	 //��С���ò˵���������1������Ĭ�ϲ���������2��Ҫ���û��������
	 void sizeselect(Door door){
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("***          ��������Ҫ��������                    ***");
		System.out.println("***                               ***");
		System.out.println("***      1:   ����Ĭ�ϲ�������                     ***");
		System.out.println("*** (Ĭ�Ͽ�1.2m,��2.5m,��ɫ��ɫ,����ľ��)***");
		System.out.println("***                               ***");
		System.out.println("***      2:   ���������������                     ***");
		System.out.println("***                               ***");
		System.out.println("*************************************");
		System.out.println("*************************************");
	    Scanner select = new Scanner(System.in);
	    int i = select.nextInt();
	    switch(i){
	    case 1:
	    	//����ʵ��ʱ���޲ι��캯��������Ĭ�Ͽ�ֵ1.2��Ĭ�ϸ�ֵ2.5
	    	System.out.println("�����ÿ�Ϊ1.2m,��Ϊ2.5m");
	    	break;
	    case 2:
	    	//Ҫ���û�������
	    	System.out.println("�����ŵĿ�");
	    	Scanner scanner = new Scanner(System.in);
	    	//���ô����door�Ŀ�Ϊ�û�����ֵ
	    	door.setWidth(scanner.nextDouble());
	    	//Ҫ���û�����߶�
	    	System.out.println("�����ŵĸ�");
	    	scanner = new Scanner(System.in);
	    	//���ô����door�ĸ�Ϊ�û�����ֵ
	    	door.setHigh(scanner.nextDouble());
	    	//��ʾ�����õĿ�Ⱥ͸߶�
	    	System.out.println("�����ÿ�Ϊ:"+door.getWidth()+" ��Ϊ:"+door.getHigh());
	    	break;
	    }
	}
	 //������ɫ�˵�
	 void colorselect(Door door){
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("***        ��������Ҫ��������ɫ                     ***");
		System.out.println("***          (����0�˳�)            ***");
		System.out.println("***          1: ��ɫ                                    ***");
		System.out.println("***          2: ��ɫ                                    ***");
		System.out.println("***          3: ��ɫ                                    ***");
		System.out.println("***          4: ��ɫ                                    ***");
		System.out.println("***          5: ��ɫ                                    ***");
		System.out.println("*************************************");
		System.out.println("*************************************");
	    Scanner select = new Scanner(System.in);
	    int i = select.nextInt();
	    switch(i){//���ݲ�ͬ���û�ѡ�񽫴����door����ɫֵ����Ϊ��ͬ�ַ���
	    case 1:
	    	door.setColor(new String("��ɫ"));
	    	System.out.println("��������ɫΪ"+door.getColor());
	    	break;
	    case 2:
	    	door.setColor(new String("��ɫ"));
	    	System.out.println("��������ɫΪ"+door.getColor());
	    	break;
	    case 3:
	    	door.setColor(new String("��ɫ"));
	    	System.out.println("��������ɫΪ"+door.getColor());
	    	break;
	    case 4:
	    	door.setColor(new String("��ɫ"));
	    	System.out.println("��������ɫΪ"+door.getColor());
	    	break;
	    case 5:
	    	door.setColor(new String("��ɫ"));
	    	System.out.println("��������ɫΪ"+door.getColor());
	    	break;
	    }
	}
	 //�������ò˵�
	 void materialselect(Door door){
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("***        ��������Ҫ�����Ĳ���                     ***");
		System.out.println("***          (����0�˳�)            ***");
		System.out.println("***          1: ������                                 ***");
		System.out.println("***                               ***");
		System.out.println("***          2: ľ����                                 ***");
		System.out.println("***                               ***");
		System.out.println("***          3: ������                                 ***");
		System.out.println("*************************************");
		System.out.println("*************************************");
	    Scanner select = new Scanner(System.in);
	    int i = select.nextInt();
	    switch(i){//���ݲ�ͬ���û�ѡ�񽫴����door�Ĳ�������Ϊ��ͬ�ַ���
	    case 1:
	    	door.setMaterial(new String("����"));
	    	System.out.println("�������ŵĲ���Ϊ"+door.getMaterial());
	    	break;
	    case 2:
	    	door.setMaterial(new String("ľ��"));
	    	System.out.println("�������ŵĲ���Ϊ"+door.getMaterial());
	    	break;
	    case 3:
	    	door.setMaterial(new String("����"));
	    	System.out.println("�������ŵĲ���Ϊ"+door.getMaterial());
	    	break;
	    	
	    }
	}
     
}