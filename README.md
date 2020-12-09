# studend-choose-couse-shiyan2  
实验目的  

初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法 ；  
掌握面向对象的类设计方法（属性、方法）；  
掌握类的继承用法，通过构造方法实例化对象；  
学会使用super()，用于实例化子类；  
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  

业务要求 
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  

对象示例：	人员（编号、姓名、性别）  
教师（编号、姓名、性别、所授课程、）  
			学生（编号、姓名、性别、所选课程   
			课程（编号、课程名称、上课地点、时间、授课教师）  
      
实验要求  
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。  
核心代码
核心代码是basic，basic作为父类承担着核心代码的工作。
public class basic {
	String name;
	int number;
	String sex;
	String cours;
	basic(){}
	basic(String name,int number,String sex,String cours ){
	this.name=name;
	this.number=number;
	this.sex=sex;
	this.cours=cours;	
}  
其他的几个类继承父类。     
思维导图  
https://github.com/WZC2019310192/studend-choose-couse-shiyan3/blob/main/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20201025225659.jpg  
运行结果
https://github.com/WZC2019310192/studend-choose-couse-shiyan3/blob/main/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20201025225147.png  
实验体会  
这次试验主要练习的是父类的运用。通过建立一个父类，几个子类。让子类继承父类达成实验目的。这次实验对于我来说还是有一定的困难。难点在于不知道如何开头，思维结构不够明确。<br/>
在同学的帮助下，完成了实验。在这过程中。他们给予我很大的帮助。没有他们的帮助。但凭我一人是很难的完成这个实验。


      
