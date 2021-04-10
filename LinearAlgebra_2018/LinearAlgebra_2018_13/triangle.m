function triangle
%�������� ��ġ�� ������ ���� ���̸� ���ϴ� ���α׷�

n = input('index count input : ');  %������ ��ǥ�� �� �� ������ �� �Է¹޽��ϴ�.
format bank; %�Ҽ��� �ι�° �ڸ������� ����ϱ����� �Լ��Դϴ�.
max_index = 0; %���̰� ���� ū �迭�� ��� ° �迭���� �����ϱ� ���� �����Դϴ�.
max_area= 0; %���� ū ���̸� �����ϱ� ���� �迭�Դϴ�.

datatable = [8;n]; % 8xn�� ����� �����մϴ�. 

for i = 1 : n % 1���� �Է¹��� n���� �ݺ��ϴ� �ݺ����Դϴ�.
    

first_index_x = randi([-10,10],1,1); %�� ���� ���� ù ��° ���� x,y��ǥ�� -10,10 ������ ���������� �����մϴ�.
first_index_y = randi([-10,10],1,1); %�� ���� ���� ù ��° ���� x,y��ǥ�� -10,10 ������ ���������� �����մϴ�.
second_index_x = randi([-10,10],1,1); %�� ���� ���� �� ��° ���� x,y��ǥ�� -10,10 ������ ���������� �����մϴ�.
second_index_y = randi([-10,10],1,1); %�� ���� ���� �� ��° ���� x,y��ǥ�� -10,10 ������ ���������� �����մϴ�.
third_index_x = randi([-10,10],1,1); %�� ���� ���� �� ��° ���� x,y��ǥ�� -10,10 ������ ���������� �����մϴ�.
third_index_y = randi([-10,10],1,1); %�� ���� ���� �� ��° ���� x,y��ǥ�� -10,10 ������ ���������� �����մϴ�.


first_point = [first_index_x,first_index_y,0]; % ù ��° ���� x,y,z ��ǥ�� �����մϴ�.
second_point = [second_index_x,second_index_y,0]; % �� ��° ���� x,y,z ��ǥ�� �����մϴ�.
third_point = [third_index_x,third_index_y,0]; % �� ��° ���� x,y,z ��ǥ�� �����մϴ�.

a = sqrt((first_index_x - second_index_x)^2 + (first_index_y - second_index_y)^2); %����� ���ϱ� ���� ���� �� �ϳ��� ����� ���� �����մϴ�.
b = sqrt((second_index_x - third_index_x)^2 + (second_index_y - third_index_y)^2); %����� ���ϱ� ���� ���� �� �ϳ��� ����� ���� �����մϴ�.
c = sqrt((third_index_x - first_index_x)^2 + (third_index_y - first_index_y)^2); %����� ���ϱ� ���� ���� �� �ϳ��� ����� ���� �����մϴ�.

s = (a+b+c)/2; % ����� ���ϱ� ���� ������ ��� ���� �����մϴ�.
heron=sqrt(s*(s-a)*(s-b)*(s-c)); % ����� ���ϴ� �����Դϴ�.


v1 = first_point - second_point; %������ ������ �̿��� ���Ŀ��� ����ϱ� ���� �����Դϴ�.
v2 = third_point - first_point; %������ ������ �̿��� ���Ŀ��� ����ϱ� ���� �����Դϴ�.
cv = cross(v1,v2); %������ ���ϴ� �Լ��Դϴ�.
mag = norm(cv); %������ �븧 ������ ���մϴ�.
area = mag / 2; %������ �븧�� ������ 2�ؼ� ���̸� ���մϴ�.


datatable(1,i) = first_index_x; %��� 1�� i���� ù ��° ���� x��ǥ�� �ֽ��ϴ�.
datatable(2,i) = first_index_y %��� 2�� i���� ù ��° ���� y��ǥ�� �ֽ��ϴ�.
datatable(3,i) = second_index_x; %��� 3�� i���� �� ��° ���� x��ǥ�� �ֽ��ϴ�.
datatable(4,i) = second_index_y; %��� 4�� i���� �� ��° ���� y��ǥ�� �ֽ��ϴ�.
datatable(5,i) = third_index_x; %��� 5�� i���� �� ��° ���� x��ǥ�� �ֽ��ϴ�. 
datatable(6,i) = third_index_y; %��� 6�� i���� �� ��° ���� y��ǥ�� �ֽ��ϴ�.
datatable(7,i) = heron; %��� 7�� i���� ����� ���� �ֽ��ϴ�.
datatable(8,i) = area; %��� 8�� i���� ������ �̿��ؼ� ���� ���̸� �ֽ��ϴ�.

if max_area == 0 % ���� ū ���̰� 0�϶�
    max_area = heron; %max_area ������ ����� �ֽ��ϴ�.
    max_index = i; %max_index ������ i ���� �ֽ��ϴ�. (�� ��° ��������)
else 
   if max_area < heron %����� max_area ���� ��к��� ���� ���
      max_area = heron; %max_area ������ ����� �ֽ��ϴ�.
      max_index = i; %max_index ������ i���� �ֽ��ϴ�. (�� ��° ��������)
      end
    end
end

fprintf('\n max_Index : %d',max_index); %���� ū �迭�� �� ��° �迭���� ����մϴ�.
fprintf('\n first point : (%d, %d)', datatable(1,max_index),datatable(2,max_index)); %ù ��° ���� x,y��ǥ�� ����մϴ�. 
fprintf('\n second point : (%d, %d)', datatable(3,max_index),datatable(4,max_index)); %�� ��° ���� x,y��ǥ�� ����մϴ�.
fprintf('\n third point : (%d, %d)', datatable(5,max_index),datatable(6,max_index)); %�� ��° ���� x,y��ǥ�� ����մϴ�.
fprintf('\n Heron : %f',datatable(7,max_index)); %����� ������ݴϴ�.
fprintf('\n External : %f\n', datatable(8,max_index)); %������ �̿��ؼ� ���� ���̸� ����մϴ�.

disp(datatable); %datatable�� ����� ����� ����մϴ�.



    