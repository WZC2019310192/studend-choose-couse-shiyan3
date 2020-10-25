package shiyan4;

public class Teacher extends basic{
	public String name;
	public String lessontime;
	public String lessonplace;
 Teacher(int number,String name,String sex,String cours) {
	  super();
	  this.number=number;
	     this.name=name;
	     this.sex=sex;
	     this.cours=cours;
	 }
	 void setCourse1(String name) {
	  this.name=name;
	 }
	 void setCourse2(int number) {
	  this.number=number;
	 }
	 void setCourse3(String sex) {
	  this.sex=sex;
	}
	 void setCourse4(String cours) {
		  this.cours=cours;
		 }
}
