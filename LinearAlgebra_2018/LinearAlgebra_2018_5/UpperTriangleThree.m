function x = UpperTriangleThree(a)
%3x3 ����� �Է� �޾Ƽ� �࿬���� ���� ��ﰢ��� U�� �����ϴ� �Լ��Դϴ�.

a(2,: ) = a(2,: ) - (a(2,1)./a(1,1)).*a(1,: );
%a�� 2����ü = a�� 2����ü���� (a(2,1)./a(1,1)).*a(1, : ) = (4./2).*(��Į���)a�� 1����ü��
%�����ذ� ���ݴϴ�. ���� a�� 2���� [4 -6 0] - [2*2 1*2 1*2] = [0 -8 -2] ���˴ϴ�.
a(3,: ) = a(3,: ) - (a(3,1)./a(1,1)).*a(1,: );
%a�� 3����ü = a�� 3����ü���� (a(3,1)./a(1,1)).*a(1, : ) = (-2./2).*(��Į���)a�� 1����ü��
%�����ذ� ���ݴϴ�. ���� a�� 3���� [-2 7 2] - [2*-1 1*-1 1*-1] = [0 8 3] ���˴ϴ�.
a(3,: ) = a(3,: ) - (a(3,2)./a(2,2)).*a(2,: );
%a�� 3����ü = a�� 3����ü���� (a(3,2)./a(2,2)).*a(2, : ) = (8./-8).*(��Į���)a�� 2����ü��
%�����ذ� ���ݴϴ�. ���� a�� 3���� [0 8 3] - [0/-1 -8/-1 -2/-1] = [0 0 1] ���˴ϴ�.
x = a;
%x���ٰ� ����� a���� �־��ݴϴ�.
disp(x);
%x�� ������ݴϴ�.