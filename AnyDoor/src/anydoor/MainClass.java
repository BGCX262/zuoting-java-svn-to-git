package anydoor;
/*
 * create doors at any size,color,material or function
 * ver1
 * written by elfzuo
 * 2013.10.16
 */

public class MainClass {
	public static void main(String[] args){
		userdisplay ud = new userdisplay();
		//���������������
		Door door = ud.functionselect();
		//�ӿڻص�
		anyDoor anydoor = (anyDoor) door;
		//ͨ��sizeselectΪdoor���ÿ�Ⱥ͸߶�
		ud.sizeselect(door);
		//ͨ��materialselectΪdoor���ò���
		ud.materialselect(door);
		//ͨ��colorselectΪdoor������ɫ
		ud.colorselect(door);
		//��ȡdoor�ĸ������Բ����
		double width = door.getWidth();
		double high = door.getHigh();
		String color = door.getColor();
		String material = door.getMaterial();
		System.out.print("����һ��"+width+"�׿�,"+high+"�׸ߵ�"+color+material+"��");
		anydoor.displayfunction();
		//����ʵ�ֵĸ���ĳ��󷽷�����
		door.openDoor();
		door.closeDoor();
	}
}
