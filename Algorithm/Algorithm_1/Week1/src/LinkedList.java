
public class LinkedList {
	
	private ListNode head; 
	//LinkedListŬ���� ������ ����ϵ��� head�� ListNodeŸ���� ������ �����մϴ�.
	private ListNode p;
	//LinkedListŬ���� ������ ����ϵ��� p�� ListNodeŸ���� ������ �����մϴ�.
	
	public void addLastNode(Object data){ //ListNode�� �������κп� data�� �����ϱ� ���� �Լ��Դϴ�.
		ListNode newNode = new ListNode();
		//ListNode Ÿ���� newNode�� �����ϰ� �ϰ� �ϳ��� ���ο� ListNode�� �ʱ�ȭ �� �ݴϴ�.
		
		newNode.setData(data); //newNode�� �Ű����� data�κп� �Էµ� data�� �־��ݴϴ�.
		newNode.setLink(null); //newNode�� link�κп� null���� �־��ݴϴ�.
		
		if(head == null){ //head�� ���� null���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			head = newNode; //head�� newNode�� ��(data,link)�� �־��ݴϴ�.
			return; //void�� �̹Ƿ� �ƹ��͵� ��ȯ���� �ʽ��ϴ�.
		}
		
		p = head; //p���ٰ� head���� �־��ݴϴ�.
		
		while(p.getLink() != null){ //p�� link�� ���� null�� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			p = p.getLink(); //p���ٰ� p�� link(���� �ּ�)�� �־��ݴϴ�.
		}
		p.setLink(newNode); //p�� link�κп� newNode�� �־��ݴϴ�(����� ����).
	}

	public void deleteLastNode(){ //ListNode�� ������ ��带 �����ϱ� ���� �Լ��Դϴ�.
		
		ListNode del = new ListNode();
		//ListNode Ÿ���� del�� �����ϰ� �ϰ� �ϳ��� ���ο� ListNode�� �ʱ�ȭ �� �ݴϴ�.
		ListNode last = new ListNode();
		//ListNode Ÿ���� last�� �����ϰ� �ϰ� �ϳ��� ���ο� ListNode�� �ʱ�ȭ �� �ݴϴ�.
		
		del = head; //del�� head���� �־��ݴϴ�.
		last = del.getLink(); //last�� head���� ����ִ� del�� link�κп� ������ �ݴϴ�.
		if(head.getLink() == null){
		//head�� link�κ��� null�� ������ ��, ���� ��尡 �����ϴ��� Ȯ���ϴ� ���ǹ� �Դϴ�.

			head = null; //head�� null���� �־��ݴϴ�(��带 ����).
			return; //void�� �̹Ƿ� �ƹ��͵� ��ȯ���� �ʽ��ϴ�.
		}
		else //head�� link�κ��� null���� �ƴ� ���
		{
			while(last.getLink() != null) //last�� link�κ�(���� ���)�� null���� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			{
				del = last; //del���ٰ� last��(��������� data)�� �־��ݴϴ�.
				last  = last.getLink(); //last�� last�� link(last�� ���� ���)�� ���� �� �ݴϴ�.
				
			}
		}
		del.setLink(null); //�ݺ��� ���� �� del�� link�κп� null���� �־��ݴϴ�.
	
	}
	
	public boolean nodeSearch(Object data){ //node���� ã�� ã�� ��� ���� ��ġ�ϴ��� Ȯ���ϴ� �Լ��Դϴ�.
		ListNode search = new ListNode(); //
		//ListNode Ÿ���� search�� �����ϰ� �ϰ� �ϳ��� ���ο� ListNode�� �ʱ�ȭ �� �ݴϴ�.
		search = head; //search�� head���� �־��ݴϴ�.
		
		while(search != null){ //search�� ���� null�� �� �� ����(���� ã�� �� ����) �ݺ��ϴ� �ݺ����Դϴ�.
			if(search.getData() == data) //search�� data�κ��� ã�� data�� ��ġ�ϴ��� Ȯ���ϴ� ���ǹ��Դϴ�. 
				return true;  //true�� ��ȯ �� �ݴϴ�.
			search = search.getLink(); //search�� search���� ��忡 ���� �� �ݴϴ�.
		}
		return false; //���� �ݺ������� ����� ������ �ʾ��� ��� false�� ��ȯ �� �ݴϴ�.
	}
	
	public void print(){ //��忡 ��� �ִ� ���� ����ϴ� �Լ��Դϴ�.
		
		if(head == null){ //head�� ���� null�� ���� ���(��尡 ����� ���)�� Ȯ���ϴ� ���ǹ��Դϴ�.
			System.out.println("===List is Empty==="); //ListNode�� ����ִٰ� ��� �� �ݴϴ�.
		}
		else{ //head�� ���� null�� �ƴҰ��(��尡 ���� ���)
			p = head; //p�� head���� �־��ݴϴ�.
			
			System.out.println("====List Data===="); //ListNode�� data���� ����մϴ�.
			
			while(p != null){ //p�� ���� null�� ���� �� ���� �ݺ��ϴ� �ݺ��� �Դϴ�.
			System.out.println("| data : " + p.getData() + "|"); //p�� data�κ��� ����մϴ�.
			p = p.getLink(); //p�� ���� ��带 ���� �� �ݴϴ�.
			
			if(p == null){ //p�� ���� null�� ������(��带 �� ��� �ߴ���) Ȯ���ϴ� ���ǹ� �Դϴ�.
				System.out.println("================="); //data�� ������ �����ڴٴ� ��¹��Դϴ�.
			}
			}
			}
	}
}