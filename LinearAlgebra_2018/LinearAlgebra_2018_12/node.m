function node
%�������� ��ġ�� AP�� Station�� �Ÿ��� ���Ͽ� ���۷��� ���� �� ��ü ���۷��� ���ϴ� ���α׷��Դϴ�.


transpossible = 0; %���� ���� ���� ���� �����ϴ� �����Դϴ�.
count = 0; %���� ������ station�� ������ ���ϴ� �����Դϴ�.
transsum = 0; %���� ������ station�� ���۷��� ���ϴ� �����Դϴ�.
n = input('Station count input : '); %�����ϰ� ���� station�� ������ �Է¹޽��ϴ�.
transmitable = [5,n]; %��� �����͸� ��Ÿ�� ����Դϴ�.

x = randi([-100,100],1,1); %x������ ������ -100���� 100���� �������� �����մϴ�.
y = randi([-100,100],1,1); %y������ ������ -100���� 100���� �������� �����մϴ�.
ap = [x,y]; %ap�� ��ġ�� x,y��ǥ�� �����մϴ�.
fprintf('\nAp location : (%d,%d)\n\n',x,y); %ap�� ��ġ ��ǥ�� ����մϴ�.

format bank; %�Ҽ��� �ι�° �ڸ������� ����ϱ����� �Լ��Դϴ�.

for i = 1 : n % 1���� �Է¹��� n ���� �ݺ��ϴ� �ݺ����Դϴ�.
    xstation = randi([-100,100],1,1); %station�� x���� -100���� 100���� �������� �����մϴ�.
    ystation = randi([-100,100],1,1); %station�� y���� -100���� 100���� �������� �����մϴ�.
    
    transmitable(1,i) = xstation; % 1�� 1���� station�� x�� ��ǥ�� �����մϴ�.
    transmitable(2,i) = ystation; % 2�� 1���� station�� y�� ��ǥ�� �����մϴ�.
    
    distancex = power(x - xstation, 2); %ap�� x��ǥ���� station�� x��ǥ�� �� ���� 2������ ���� �����մϴ�.
    distancey = power(y - ystation, 2); %ap�� y��ǥ���� station�� y��ǥ�� �� ���� 2������ ���� �����մϴ�.
    distance = sqrt(distancex + distancey); %����� x��ǥ y��ǥ�� ���� ���� ��Ʈ���� �����մϴ�.
    trans = 1/distance*100; %���۷��� ���ϴ� �������� 1/�Ÿ�*100 �� ����� �������ݴϴ�.
    
     if trans < 1 %���۷��� 1���� �������
        transpossible = 0; %���� ���� ���� ���� 0���� �����մϴ�.
     else %���۷��� 1���� Ŭ��� 
        transpossible = 1; %���� ���� ���� ���� 1�� �����մϴ�.
        count = count + 1; %���� ������ station�� ������ 1�� �����ݴϴ�.
        transsum = transsum + trans; %���� ������ station�� ���۷��� ���մϴ�.
    end
     
    transmitable(3,i) = distance; %3�� 1���� �Ÿ����� �����մϴ�.
    transmitable(4,i) = trans; %4�� 1���� ���۷��� �����մϴ�.
    transmitable(5,i) = transpossible; %5�� 1���� ���� ���� ���θ� �����մϴ�.
    
    fprintf('%d)Station location : (%d,%d)\n',i,xstation,ystation); %station�� x,y��ǥ�� ����մϴ�.
    fprintf('Ap distance : %f\n\n',distance); %����� �Ÿ����� ����մϴ�.
    
end 
fprintf('total throughput : %f\n',transsum); %���� ������ station�� ���۷��� ���� ���� ����մϴ�.
fprintf('Transmitable node : %d\n',count); %���� ������ station�� ������ ����մϴ�.
disp(transmitable); %��� �����͸� ��Ÿ���� ����� ����մϴ�.


