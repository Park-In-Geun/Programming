public class BTree { //��ȯ,���ȯ ����Ʈ���� ������ Ŭ�����Դϴ�.
	
	private TreeNode root; //TreeNode�� ���� root�� �����մϴ�.
	
	public BTree(){ //�������Դϴ�.
		this.root = null; //this.root�� null���� �־��ݴϴ�.
	}
	public BTree(BTree left, Object data, BTree right)
	//����Ʈ������ Btree�� left,right ��, �׸��� data���� ���Ե� ����� Btree() �޼����Դϴ�.
	{
		root = new TreeNode(data); //TreeNode�޼��忡 data���� ������ ���ѵ� ���� root(�θ�)�� �ֽ��ϴ�.
		root.setLeft(left.root); //setleft()�޼��忡 left.root�� �ֽ��ϴ�.
		root.setRight(right.root);//setRight()�޼��忡 right.root�� �ֽ��ϴ�.
	}
	public void setRoot(TreeNode root){ this.root = root; }
	//TreeNode�� root�� ���Ե� setter�޼��� setRoot()�� this.root�� ���Ե� root�� �ֽ��ϴ�.
	
	public TreeNode getRoot(){ return this.root; }
	//getter�޼��� getRoot()�� this.root�� ��ȯ�մϴ�.
	
	public boolean isEmpty(){ return root == null; }
	//boolean�� isEmpty()�� root �� null���� �������� ��ȯ�մϴ�.
	
	public BTree leftSubTree(){ //leftSubTree()�޼����Դϴ�.(�����ڽ�)
		BTree leftTree = new BTree(); //Btree�� leftTree ��ü�� �����մϴ�.
		leftTree.root = this.root.getLeft(); //leftTree.root�� this.root�� getLeft() ���� �־��ݴϴ�.
		return leftTree; //leftTree�� ��ȯ�մϴ�.
	} 
	public BTree rightSubTree(){ //rightSubTree()�޼����Դϴ�.(�������ڽ�)
		BTree rightTree = new BTree(); //Btree�� rightTree ��ü�� �����մϴ�.
		rightTree.root = this.root.getRight(); //right.root�� this.root�� getRight() ���� �־��ݴϴ�.
		return rightTree; //rightTree�� ��ȯ�մϴ�.
	}
	public Object getRootData(){ //getRootData()�޼����Դϴ�.(�θ�)
		return this.root.getData(); //this.root�� getData()���� ��ȯ�մϴ�.
	}
	
	public void inorder(){ //���� ��ȸ �޼����Դϴ�.
		B_inorder(root); // B_inorder()�޼��忡 root�� �����մϴ�.
	}
	private void B_inorder(TreeNode T){ //BTreeŬ���� �������� ��밡���� B_inorder()�޼���� TreeNode�� T�� ���Ե˴ϴ�.
		if(T != null){ // T�� ���� null�� �ƴ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			B_inorder(T.getLeft()); //������ ���� ��� B_inorder()�޼��忡 T.getLeft()���� �ֽ��ϴ�.(���� �ڽ� �湮)
			System.out.print(T.getData() + " "); //T.getData()���� ����մϴ�.(�θ� �湮)
			B_inorder(T.getRight()); //B_inorder()�޼��忡 T.getRight()���� �ֽ��ϴ�.(������ �ڽ� �湮)
		}
	}
	public void preorder(){ //���� ��ȸ �޼����Դϴ�.
		B_preorder(root); //B_preorder()�޼��忡 root�� �����մϴ�.
	}
	private void B_preorder(TreeNode T){ //BTreeŬ���� �������� ��밡���� B_preorder�޼���� TreeNode�� T�� ���Ե˴ϴ�.
		if(T != null){ //T�� ���� null�� �ƴ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			System.out.print(T.getData() + " "); //������ ���� ��� T.getData()���� ����մϴ�.(�θ� �湮)
			B_preorder(T.getLeft()); //B_preorder()�޼��忡 T.getLeft()���� �ֽ��ϴ�.(���� �ڽ� �湮)
			B_preorder(T.getRight()); //B_preorder()�޼��忡 T.getRight()���� �ֽ��ϴ�.(������ �ڽ� �湮)
		}
	}
	public void postorder(){ //���� ��ȸ �޼����Դϴ�.
		B_postorder(root); //B_postorder()�޼��忡 root���� �����մϴ�.
	}
	private void B_postorder(TreeNode T){ //BTreeŬ���� �������� ��밡���� B_preorder�޼���� TreeNode�� T�� ���Ե˴ϴ�.
		if(T != null){ //T�� ���� null�� �ƴ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			B_postorder(T.getLeft()); //������ ���� ��� B_postorder()�޼��忡 T.getLeft()���� �ֽ��ϴ�.(���� �ڽ� �湮)
			B_postorder(T.getRight()); //B_postorder()�޼��忡 T.getRight()���� �ֽ��ϴ�.(������ �ڽ� �湮)
			System.out.print(T.getData() + " "); //T.getData()���� ����մϴ�.(�θ� �湮)
		}
	}
	public void iterInorder(){ //���� ���ȸ �޼����Դϴ�.
		Stack iterTree = new Stack(); //Stack�� ��ü iterTree�� �����մϴ�.
		TreeNode p = root; //TreeNode�� p�� �����ϰ� root�� �ֽ��ϴ�.
		
		if(p != null){ // p�� null�� �ƴ��� Ȯ���ϴ� ���ǹ��Դϴ�.
			iterTree.push(p); //������ ���� ��� iterTree ���ÿ� push�޼��带 ����� p���� �����մϴ�.
		}
		
		while(!(iterTree.isEmpty())){ //stack�� ���Ұ� null�� �� ��(�� ��) ���� �ݺ��ϴ� �ݺ����Դϴ�.
			if(p != null){ //p�� ���� null�� ���� ������ Ȯ���ϴ� ���ǹ� �Դϴ�.
				p = iterTree.peek(); //p���ٰ� stack�� top ���Ҹ� �ֽ��ϴ�.
				p = p.getLeft(); //p���ٰ� p.getLeft() ���� �ֽ��ϴ�.(p�� �����ڽ� �湮)
				while(p != null){ //p�� ���� null�� ������ �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
					iterTree.push(p); //stack�� top�� push() �޼��带 �̿��Ͽ� p�� ���� �ֽ��ϴ�.
					p = p.getLeft(); //p���ٰ� p.getLeft() ���� �ֽ��ϴ�.(p�� �����ڽ� �湮)
				} //�ݺ��� ����
			} //���ǹ� ����
		p = iterTree.pop(); //pop() �޼��带 �̿��Ͽ� stack�� top�� ���Ҹ� ������ p�� �־��ݴϴ�.
		System.out.print(p.getData()+ " "); //p.getData()���� ����մϴ�. (�θ� �湮)
		p = p.getRight(); //p�� p.getRight() ���� �ֽ��ϴ�. (p�� ������ �ڽ� �湮)
		if(p != null){ //p�� ���� null�� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			iterTree.push(p); //������ ���� ��� push() �޼��带 �̿��� stack�� top�� p���� �ֽ��ϴ�.
		}
		}
	}
	
	public void iterPreorder(){ //���� ���ȸ �޼����Դϴ�.
		Stack iterTree = new Stack(); //Stack�� ��ü iterTree�� �����մϴ�.
		TreeNode p = root; //TreeNode�� p�� �����ϰ� root�� �־��ݴϴ�.
		
		if(p != null){ //p�� ���� null�� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			iterTree.push(p); //������ ���� ��� push() �޼��带 �̿��� stack�� top�� p���� �ֽ��ϴ�. 
		}
		
		while(!(iterTree.isEmpty())){ //stack�� ���Ұ� null�� �� ��(�� ��) ���� �ݺ��ϴ� �ݺ����Դϴ�. 
			if(p != null){ //p ���� null�� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				p = iterTree.peek(); //p���ٰ� stack�� top�� ���Ҹ� �ֽ��ϴ�.
				System.out.print(p.getData()+ " "); //p.getData()�� ����մϴ�.(�θ� �湮)
				p = p.getLeft(); //p���ٰ� p.getLeft() ���� �ֽ��ϴ�.(p�� ���� �ڽ� �湮)
				while(p != null){ //p�� ���� null�� ������ �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
					System.out.print(p.getData()+ " "); //p.getData()�� ����մϴ�.(�θ� �湮)
					iterTree.push(p); //������ ���� ��� push() �޼��带 �̿��� stack�� top�� p���� �ֽ��ϴ�.
					p = p.getLeft(); //p���ٰ� p.getLeft() ���� �ֽ��ϴ�.(p�� ���� �ڽ� �湮)
				}
			}
		p = iterTree.pop(); //pop() �޼��带 �̿��Ͽ� stack�� top�� ���Ҹ� ������ p�� �־��ݴϴ�.	
		p = p.getRight(); //p�� p.getRight() ���� �ֽ��ϴ�. (p�� ������ �ڽ� �湮)
		if(p != null){ //p�� ���� null�� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			iterTree.push(p); iterTree.push(p); //������ ���� ��� push() �޼��带 �̿��� stack�� top�� p���� �ֽ��ϴ�.
		}
		}
	}
}