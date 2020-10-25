package shiyan4;

public class Interface {
	
		 public static String toString(Open stu) {
		  return " 学生姓名: "+stu.name+" 性别: "+stu.number+" 学号: "+stu.sex+" 已选课程: "+stu.courses;
		 }
		 //提示教师的课程信息
		 public static String toChoose(Teacher tea) {
		  return " 老师编号: "+tea.number+" 老师姓名: "+tea.name+" 老师性别: "+tea.sex+" 所教课程: "+tea.cours+" 上课时间:暂无"+tea.lessontime+" 上课地点:暂无 "+tea.lessonplace;
		 }
		 public static void main(String args[]) {
		  //学生登录界面
		     System.out.println("请输入姓名以及学号喔!");
		     //学生信息
		     Open stu = new Open("ZC","女",310192,"");
		     //老师信息
		     Teacher tea1 = new Teacher(111,"王","","");
		     tea1.setCourse1("赵");
		     tea1.setCourse2(3273);
		     tea1.setCourse3("男");
		     tea1.setCourse4("java");
		     
		     Teacher tea2 = new Teacher(002,"","","");
		     tea2.setCourse1("钱");
		     tea2.setCourse2(3784);
		     tea2.setCourse3("女");
		     tea2.setCourse4("马原");
		     
		     Teacher tea3 = new Teacher(003,"","","");
		     tea3.setCourse1("孙");
		     tea3.setCourse2(3478);
		     tea3.setCourse3("男");
		     tea3.setCourse4("离散");
		     
		     System.out.println(toString(stu));
		     stu.setCourse("java");
		     System.out.println(toChoose(tea1));
		     System.out.println(toChoose(tea2));
		     System.out.println(toChoose(tea3));
		     //System.out.println("请根据提示开始选课!");
		     System.out.println(toString(stu));}
		}

