package shiyan4;

public class Interface {
	
		 public static String toString(Open stu) {
		  return " ѧ������: "+stu.name+" �Ա�: "+stu.number+" ѧ��: "+stu.sex+" ��ѡ�γ�: "+stu.courses;
		 }
		 //��ʾ��ʦ�Ŀγ���Ϣ
		 public static String toChoose(Teacher tea) {
		  return " ��ʦ���: "+tea.number+" ��ʦ����: "+tea.name+" ��ʦ�Ա�: "+tea.sex+" ���̿γ�: "+tea.cours+" �Ͽ�ʱ��:����"+tea.lessontime+" �Ͽεص�:���� "+tea.lessonplace;
		 }
		 public static void main(String args[]) {
		  //ѧ����¼����
		     System.out.println("�����������Լ�ѧ���!");
		     //ѧ����Ϣ
		     Open stu = new Open("ZC","Ů",310192,"");
		     //��ʦ��Ϣ
		     Teacher tea1 = new Teacher(111,"��","","");
		     tea1.setCourse1("��");
		     tea1.setCourse2(3273);
		     tea1.setCourse3("��");
		     tea1.setCourse4("java");
		     
		     Teacher tea2 = new Teacher(002,"","","");
		     tea2.setCourse1("Ǯ");
		     tea2.setCourse2(3784);
		     tea2.setCourse3("Ů");
		     tea2.setCourse4("��ԭ");
		     
		     Teacher tea3 = new Teacher(003,"","","");
		     tea3.setCourse1("��");
		     tea3.setCourse2(3478);
		     tea3.setCourse3("��");
		     tea3.setCourse4("��ɢ");
		     
		     System.out.println(toString(stu));
		     stu.setCourse("java");
		     System.out.println(toChoose(tea1));
		     System.out.println(toChoose(tea2));
		     System.out.println(toChoose(tea3));
		     //System.out.println("�������ʾ��ʼѡ��!");
		     System.out.println(toString(stu));}
		}

