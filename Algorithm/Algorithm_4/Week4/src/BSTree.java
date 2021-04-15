
public class BSTree { // Ʈ�� Ŭ�����Դϴ�.

	private BSTNode root; //BSTNode�� root ������ �����մϴ�.
	
	public BSTNode search(int key){ //BSTNode search �޼����Դϴ�. key���� �޽��ϴ�.
		BSTNode p; //BSTNode�� p�� �����մϴ�. 
		p = root; //p�� root�� �־��ݴϴ�.
		while(p != null){ //p�� null���� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			if(p.getKey() > key){ //p�� getKey()���� ���Ե� ������ key������ ū �� Ȯ���մϴ�.
				p = p.getLeft(); //������ ������� p�� p�� getLeft() (���� �ڽ�)�� �־��ݴϴ�.
			}
			else if(p.getKey() == key){ //���� ���ǰ� �ٸ� ���� p�� getKey���� ���Ե� ������ key���� ������ Ȯ���մϴ�.
				return p; //������ ������� p���� ��ȯ�մϴ�.
			} 
			else p = p.getRight(); //���� �� ������ ��� �������� ���� ��� p�� p�� getRight() (������ �ڽ�)�� �־��ݴϴ�.
		}
		return p; //p�� ��ȯ���ݴϴ�.
	}
	
	public void insert(int key){ //Ʈ���� ������ key���� �����ϴ� �޼����Դϴ�.
		BSTNode p,q=null; //BSTNode�� p,q �� �����ϰ� q�� null���� �־��ݴϴ�.
		
		p = root; //p�� root���� �־��ݴϴ�.
		while(p != null){ //p�� null���� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			if(key == p.getKey()) return; //key�� p�� getKey() ���� ������ Ȯ���ϰ� ������ ���� ��� �ƹ��͵� ��ȯ���� �ʽ��ϴ�.
			q = p; //q�� p���� �־��ݴϴ�.
			if(key < p.getKey()){ //key�� p�� getKey()������ ������ Ȯ���մϴ�.
				p = p.getLeft(); //p�� p�� getLeft() (���� �ڽ�) �� �־��ݴϴ�.
			}
			else{ //key�� p�� getKey() ������ Ŭ ����Դϴ�.
				p = p.getRight(); //p�� p�� getRight() (������ �ڽ�) �� �־��ݴϴ�.
			}
		}
		BSTNode newNode = new BSTNode(); //BSTNode�� newNode�� �����մϴ�.
		newNode.setKey(key); //newNode�� setKey�� key���� �־��ݴϴ�. (�θ�)
		newNode.setRight(null); //newNode�� setRight�� null���� �־��ݴϴ�. (������ �ڽ�)
		newNode.setLeft(null); //newNode�� setLeft�� null���� �־��ݴϴ�. (���� �ڽ�)
		if(root == null){ root = newNode;} //root�� null���� ������ Ȯ���ϰ� ������ ���� ��� root�� newNode�� �־��ݴϴ�.
		else if(key < q.getKey()){q.setLeft(newNode);;} 
		//q�� getKey���� key������ Ŭ ��츦 Ȯ���ϰ� ������ ���� ��� q.setLeft�� newNode�� �־��ݴϴ�. (q�� ���� �ڽĿ� newNode���� ����)
		else //���� �� ������ ��� �������� ���� ��쿡 �����մϴ�.
			q.setRight(newNode); //q�� setRight�� newNode�� �־��ݴϴ�. (q�� ������ �ڽĿ� newNode���� ����)
		return; //�ƹ��͵� ��ȯ���� �ʽ��ϴ�.
	}
	
	public void delete(int key){ //Ʈ������ ������ key���� �����ϴ� �޼����Դϴ�.
		BSTNode parent=root; //BSTNode�� parent�� �����ϰ� root���� �־��ݴϴ�.
		BSTNode	p=root; //BSTnode�� p�� �����ϰ� root���� �־��ݴϴ�.
		
		boolean isLeftChild = false; //boolean�� isLeftChild�� �����ϰ� false�� �־��ݴϴ�.
		
		while(p.getKey() != key){ //p�� getKey()���� �����Ϸ��� ������ key���� ���� �� ���� �ݺ��ϴ� �ݺ��� �Դϴ�.
			parent = p; //parent�� p�� �־��ݴϴ�.
			if (p.getKey() > key){ //p�� getKey()�� �����Ϸ��� key������ ū�� Ȯ���մϴ�.
				isLeftChild = true; //������ ���� ��� isLeftChild�� true�� �־��ݴϴ�.
				p = p.getLeft(); //p�� p�� getLeft() (���� �ڽ�) �� �־��ݴϴ�.
			}
			else{ //���� ������ ���� ���� ��쿡 �����մϴ�.
				isLeftChild = false; //isLeftChild�� false�� �־��ݴϴ�.
				p = p.getRight(); //p�� p�� getRight() (������ �ڽ�)�� �־��ݴϴ�.
			}
			if (p == null) //p�� null(����� ���)�� ������ Ȯ���մϴ�.
				return; //�ƹ��͵� ��ȯ�� ���� �ʽ��ϴ�.
		}
		
		if((p.getLeft() == null) && (p.getRight() == null)){ 
			//p�� getLeft() (���� �ڽ�)�� null�� ���� p�� getRight() (������ �ڽ�)�� null�� ������ Ȯ���ϴ� ���ǹ� �Դϴ�.
			
			if(p == root) //p�� root�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				root = null; //������ ���� ��� root�� null���� �־��ݴϴ�.
			if(isLeftChild == true) //isLeftChild�� true�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				parent.setLeft(null); //������ ������ parent�� setLeft�� null���� �־��ݴϴ�. (���� �ڽ� ����)
			else //���� ���ǰ� �ٸ� ��쿡 �����մϴ�.
				parent.setRight(null); //parent�� setRight�� null���� �־��ݴϴ�.(������ �ڽ� ����)
		}
		
		else if((p.getRight() == null) || p.getLeft() == null){
			//p�� getRight() (������ �ڽ�) �� p�� getLeft() (���� �ڽ�) �� �ϳ��� null���� Ȯ�� �ϴ� ���ǹ��Դϴ�.
			
			if(p.getRight() == null){ //p�� getRight() (������ �ڽ�)�� null�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				if(p == root) //������ ���� ��� p�� root�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
					root = p.getLeft(); //root�� ���� p�� getLeft() (���� �ڽ�) �� �־��ݴϴ�.
				else if (isLeftChild) //isLeftChild�� true���� false���� Ȯ���ϴ� ���ǹ��Դϴ�.
					parent.setLeft(p.getLeft()); //true�� ��� parent�� setLeft�� p�� getLeft() (���� �ڽ�) �� �־��ݴϴ�.
				else //���� �� ��찡 ��� �ƴ� ��쿡 �����մϴ�.
					parent.setRight(p.getLeft()); //parent�� setRight�� p�� getLeft() (���� �ڽ�) �� �־��ݴϴ�.
			}
			
			else if (p.getLeft() == null){ //p�� getLeft() (���� �ڽ�) �� null�� ������ Ȯ���մϴ�.
				if(p == root) //p�� root�� ������ Ȯ���մϴ�.
					root = p.getRight(); //������ ���� ��� root�� p�� getRight() (������ �ڽ�) �� �־��ݴϴ�.
				else if (isLeftChild) //isLeftChild�� true���� false���� Ȯ���ϴ� ���ǹ��Դϴ�.
					parent.setLeft(p.getRight()); //true�� ��� parent�� setLeft �� p�� getRight() (������ �ڽ�) �� �־��ݴϴ�.
				else //���� �� ��찡 ��� �ƴ� ��쿡 �����մϴ�.
					parent.setRight(p.getRight()); // parent�� setRight �� p�� getRight() (������ �ڽ�) �� �־��ݴϴ�.
			}
		}
		else if(p.getLeft() != null && p.getRight() != null){ 
			//p�� getLeft() (���� �ڽ�) �� p�� getRight() (������ �ڽ�) �� �Ѵ� null �� �ƴ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			
			BSTNode q = minNode(p); //BSTNode�� q�� �����ϰ� minNode �޼��忡 p���� �־� ���� ����� �־��ݴϴ�.
			
			if(p == root) //p�� root�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				root = q; //������ ���� ��� root�� q�� �־��ݴϴ�.
			else if (isLeftChild) //isLeftChild�� true���� false���� Ȯ���ϴ� ���ǹ��Դϴ�.
				parent.setLeft(q); //������ ���� ��� parent�� setLeft�� q�� �־��ݴϴ�.
			else //���� �� ��찡 ��� �ƴ� ��쿡 �����մϴ�.
				parent.setRight(q); //parent�� setRight�� q�� �־��ݴϴ�.
				q.setLeft(p.getLeft()); //q�� setLeft�� p�� getLeft() (���� �ڽ�) �� �־��ݴϴ�.
		}
		return; //�ƹ��͵� ��ȯ���� �ʽ��ϴ�.
	}
	
	private BSTNode minNode(BSTNode deleleBSTNode){ //BSTree Ŭ���� �������� ��� ������ BSTNode�� minNode �޼����Դϴ�. BSTNode�� �� ���Թ޽��ϴ�.
		
		BSTNode min = null; //BSTNode�� min�� �����ϰ� null�� �־��ݴϴ�.
		BSTNode minParent = null; //BSTNode�� minParent�� �����ϰ� null�� �־��ݴϴ�.
		BSTNode q = deleleBSTNode.getRight(); //BSTNode�� q�� �����ϰ� ���Ե� ����� getRight() (������ �ڽ�)�� �־��ݴϴ�.
		while(q != null){ //q�� null�� ������ �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			minParent = min; //minParent�� min�� �־��ݴϴ�. 
			min = q; //min�� q�� �־��ݴϴ�. (���Ե� ����� ������ �ڽ�)
			q = q.getLeft(); //q�� q�� getLeft() (���� �ڽ�) �� �־��ݴϴ�.
		}
		if (min != deleleBSTNode.getRight()){ //min�� ���Ե� ����� getRight() (������ �ڽ�) �� ���� ���� ��츦 Ȯ���ϴ� ���ǹ��Դϴ�.
			minParent.setLeft(min.getRight()); //������ ���� ��� minParent�� setLeft�� min�� getRight() (������ �ڽ�)�� �־��ݴϴ�.
			min.setRight(deleleBSTNode.getRight()); //min�� setRight�� ���Ե� ����� getRight() (������ �ڽ�)�� �־��ݴϴ�.
		}
		return min; //min�� ��ȯ�� �ݴϴ�.
	}
	
	public void print(){ //���� Ŭ�������� Ʈ���� ����ϴ� �޼����Դϴ�.
		printBST(root); //printBST�޼��忡 root�� �����մϴ�.
		System.out.println(); //���� �ٲ��ݴϴ�.
	}
	
	private void printBST(BSTNode root){ //BSTreeŬ���� �������� ��� ������ printBST�޼���� BSTNode�� �� ���Թ޽��ϴ�.
		if (root != null){ // root�� null�� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			System.out.print("<"); //������ ���� ��� < �� ����ϴ� ��¹��Դϴ�.
			printBST(root.getLeft()); //printBST�� root�� getLeft() (���� �ڽ�)�� �����մϴ�.
			System.out.print(root.getKey()); //root�� getKey() (�θ�)�� ����մϴ�.
			printBST(root.getRight()); //printBST�� root�� getRight() (������ �ڽ�)�� �����մϴ�.
			System.out.print(">"); // > �� ����մϴ�.
		}
	}
}
