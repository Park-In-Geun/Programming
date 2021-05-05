package week3;

public class Prun {
	public void run(){
		Person p = new Person();
		Customer c = new Customer();
		
		System.out.print("--생성할 때 정보 미 입력시 Person객체 접근자 메소드로 확인--\n");
		System.out.print(p.getName());
		System.out.print(p.getAddress());
		System.out.print(p.getTel());
		System.out.print("--생성할 때 정보 미 입력시 Customer객체 접근자 메소드로 확인--\n");
		System.out.print(c.getName());
		System.out.print(c.getAddress());
		System.out.print(c.getTel());
		System.out.print(c.getPnum());
		System.out.print(c.getPm());
		
		System.out.print("--설정자 메소드로 정보 변경(Person 객체)--\n");
		p.setName("박인근");
		p.setAddress("서울시 동동동");
		p.setTel("010-0000-0000");
		System.out.print(p.getName());
		System.out.print(p.getAddress());
		System.out.print(p.getTel());
		
		System.out.print("--설정자 메소드로 정보 변경(Customer 객체)--\n");
		c.setName("박근인");
		c.setAddress("서울시 군군군");
		c.setTel("010-1111-0000");
		c.setPnum("83");
		c.setPm("1224");
		System.out.print(c.getName());
		System.out.print(c.getAddress());
		System.out.print(c.getTel());
		System.out.print(c.getPnum());
		System.out.print(c.getPm());
	}
	
	public void run2(){
		Person p2 = new Person("홍길동", "서울시 동동구", "010-1234-5678");
		Customer c2 = new Customer("128", "840");
		
		System.out.print("--생성할 때 정보 입력시 Person객체 접근자 메소드로 확인--\n");
		System.out.print(p2.getName());
		System.out.print(p2.getAddress());
		System.out.print(p2.getTel());
		System.out.print("--생성할 때 정보 입력시 Customer객체 접근자 메소드로 확인--\n");
		System.out.print(c2.getName());
		System.out.print(c2.getAddress());
		System.out.print(c2.getTel());
		System.out.print(c2.getPnum());
		System.out.print(c2.getPm());
		
		System.out.print("--설정자 메소드로 정보 변경(Person 객체)--\n");
		p2.setName("참조은");
		p2.setAddress("서울시 구구동");
		p2.setTel("010-1200-3400");
		System.out.print(p2.getName());
		System.out.print(p2.getAddress());
		System.out.print(p2.getTel());
		
		System.out.print("--설정자 메소드로 정보 변경(Customer 객체)--\n");
		c2.setName("참나쁜");
		c2.setAddress("서울시 공공시");
		c2.setTel("010-2211-0330");
		c2.setPnum("32");
		c2.setPm("50");
		System.out.print(c2.getName());
		System.out.print(c2.getAddress());
		System.out.print(c2.getTel());
		System.out.print(c2.getPnum());
		System.out.print(c2.getPm());
	}
}
