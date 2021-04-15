
public class ListNode { //ListNode Ŭ���� �Դϴ�.

	private Object data; //ListNode Ŭ���������� ��밡���� ���� data �� �����մϴ�.
	private ListNode link; //ListNode Ŭ���������� ��밡���� ListNode�� ���� link�� �����մϴ�.
	
	public ListNode(){ //ListNode�� data�� link�� ��� null���� �޼��� �Դϴ�.
		data = null; //data�� null���� �־��ݴϴ�.
		link = null; //link�� null���� �־��ݴϴ�.
	}

	public ListNode(Object data){ //ListNode�� data���� �����ϴ� �޼��� �Դϴ�.
		data = data; //data�� ���Ե� data���� �־��ݴϴ�.
		link = null; //link�� null���� �־��ݴϴ�.
	}

	public Object getData() { //data�� getter�޼��� �Դϴ�.
		return data; // data�� ���� �Ű������� ��ȯ�� �ݴϴ�.
	}

	public void setData(Object data) { //data�� setter�޼��� �Դϴ�.
		this.data = data; //data�� ���� �Ű����� �Դϴ�.
	}

	public ListNode getLink() { //link�� getter�޼��� �Դϴ�.
		return link; //link�� ���� �Ű������� ��ȯ�� �ݴϴ�.
	}

	public void setLink(ListNode link) { //link�� setter�޼��� �Դϴ�.
		this.link = link; //link�� ���� �Ű����� �Դϴ�.
	}
	
}