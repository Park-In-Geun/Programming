package week3;

public class Prun {
	public void run(){
		Person p = new Person();
		Customer c = new Customer();
		
		System.out.print("--������ �� ���� �� �Է½� Person��ü ������ �޼ҵ�� Ȯ��--\n");
		System.out.print(p.getName());
		System.out.print(p.getAddress());
		System.out.print(p.getTel());
		System.out.print("--������ �� ���� �� �Է½� Customer��ü ������ �޼ҵ�� Ȯ��--\n");
		System.out.print(c.getName());
		System.out.print(c.getAddress());
		System.out.print(c.getTel());
		System.out.print(c.getPnum());
		System.out.print(c.getPm());
		
		System.out.print("--������ �޼ҵ�� ���� ����(Person ��ü)--\n");
		p.setName("���α�");
		p.setAddress("����� ������");
		p.setTel("010-0000-0000");
		System.out.print(p.getName());
		System.out.print(p.getAddress());
		System.out.print(p.getTel());
		
		System.out.print("--������ �޼ҵ�� ���� ����(Customer ��ü)--\n");
		c.setName("�ڱ���");
		c.setAddress("����� ������");
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
		Person p2 = new Person("ȫ�浿", "����� ������", "010-1234-5678");
		Customer c2 = new Customer("128", "840");
		
		System.out.print("--������ �� ���� �Է½� Person��ü ������ �޼ҵ�� Ȯ��--\n");
		System.out.print(p2.getName());
		System.out.print(p2.getAddress());
		System.out.print(p2.getTel());
		System.out.print("--������ �� ���� �Է½� Customer��ü ������ �޼ҵ�� Ȯ��--\n");
		System.out.print(c2.getName());
		System.out.print(c2.getAddress());
		System.out.print(c2.getTel());
		System.out.print(c2.getPnum());
		System.out.print(c2.getPm());
		
		System.out.print("--������ �޼ҵ�� ���� ����(Person ��ü)--\n");
		p2.setName("������");
		p2.setAddress("����� ������");
		p2.setTel("010-1200-3400");
		System.out.print(p2.getName());
		System.out.print(p2.getAddress());
		System.out.print(p2.getTel());
		
		System.out.print("--������ �޼ҵ�� ���� ����(Customer ��ü)--\n");
		c2.setName("������");
		c2.setAddress("����� ������");
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
