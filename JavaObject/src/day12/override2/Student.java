package day12.override2;

public class Student extends Person {

	String studentId;

	String info() {
		return "이름:" +name +", 나이 :"+age+", 학번:"+studentId;
	}
}
