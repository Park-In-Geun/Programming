package quiz1;

public class OurClassTest {
	public static void main(String[] args){
		Student std[] = new Student[4];
		
		std[0] = new Student(90);
		std[1] = new Student("benny",50);
		std[2] = new Student("daniel",20);
		std[3] = new Student("jhon",80);
		
		
		OurClass oca = new OurClass(std);
		System.out.println("�ְ� ���� �л� : " + oca.getMaxScoreName());
		System.out.println("���� ���� �л� : " + oca.getMinScoreName());
		System.out.println("��ü �л� �� = " + Student.getStdcount());
	}
}
