
public class Week_1_2 {
	
	public static void main(String[] args){
		
		LinkedList list = new LinkedList();
		//ListNode Ÿ���� list�� �����ϰ� �ϰ� �ϳ��� ���ο� ListNode�� �ʱ�ȭ �� �ݴϴ�.
		
		list.print(); //list�� ��带 print()�Լ��� �̿��Ͽ� ����մϴ�.
		
		list.addLastNode("AAAA"); 
		//"AAAA"�� data�� ���� ��带 addLastNode()�Լ��� �̿��Ͽ� list�� �������� ��带 �߰��մϴ�.
		
		list.addLastNode("BBBB"); 
		//"BBBB"�� data�� ���� ��带 addLastNode()�Լ��� �̿��Ͽ� list�� �������� ��带 �߰��մϴ�.
		
		list.addLastNode("CCCC"); 
		//"CCCC"�� data�� ���� ��带 addLastNode()�Լ��� �̿��Ͽ� list�� �������� ��带 �߰��մϴ�.
		
		list.print(); //list�� ��带 print()�Լ��� �̿��Ͽ� ����մϴ�.
		list.deleteLastNode(); //deleteLastNode()�� �̿��Ͽ� list�� ������ ��带 �����մϴ�.
		list.print(); //list�� ��带 print()�Լ��� �̿��Ͽ� ����մϴ�.
		System.out.println("AAAA search result : " + list.nodeSearch("AAAA"));
		//nodeSearch�Լ��� ����Ͽ� list�� AAAA��� data�� ���� ��尡 �ִ��� Ȯ���ϰ� ������ �������� ����մϴ�.
		
		System.out.println("CCCC search result : " + list.nodeSearch("CCCC"));
		//nodeSearch�Լ��� ����Ͽ� list�� CCCC��� data�� ���� ��尡 �ִ��� Ȯ���ϰ� ������ �������� ����մϴ�.
		
		list.deleteLastNode(); //deleteLastNode()�� �̿��Ͽ� list�� ������ ��带 �����մϴ�.
		list.deleteLastNode(); //deleteLastNode()�� �̿��Ͽ� list�� ������ ��带 �����մϴ�.
		
		list.print(); //list�� ��带 print()�Լ��� �̿��Ͽ� ����մϴ�.
	}
}