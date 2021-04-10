function node
%랜덤으로 배치된 AP와 Station의 거리를 구하여 전송량을 측정 후 전체 전송량을 구하는 프로그램입니다.


transpossible = 0; %전송 가능 여부 값을 저장하는 변수입니다.
count = 0; %전송 가능한 station의 개수를 구하는 변수입니다.
transsum = 0; %전송 가능한 station의 전송량을 더하는 변수입니다.
n = input('Station count input : '); %생성하고 싶은 station의 개수를 입력받습니다.
transmitable = [5,n]; %모든 데이터를 나타낼 행렬입니다.

x = randi([-100,100],1,1); %x축으로 범위를 -100에서 100까지 랜덤으로 저장합니다.
y = randi([-100,100],1,1); %y축으로 범위를 -100에서 100까지 랜덤으로 저장합니다.
ap = [x,y]; %ap의 위치를 x,y좌표로 저장합니다.
fprintf('\nAp location : (%d,%d)\n\n',x,y); %ap의 위치 좌표를 출력합니다.

format bank; %소수점 두번째 자리까지만 출력하기위한 함수입니다.

for i = 1 : n % 1부터 입력받은 n 까지 반복하는 반복문입니다.
    xstation = randi([-100,100],1,1); %station의 x축을 -100에서 100까지 랜덤으로 저장합니다.
    ystation = randi([-100,100],1,1); %station의 y축을 -100에서 100까지 랜덤으로 저장합니다.
    
    transmitable(1,i) = xstation; % 1행 1열에 station의 x축 좌표를 저장합니다.
    transmitable(2,i) = ystation; % 2행 1열에 station의 y축 좌표를 저장합니다.
    
    distancex = power(x - xstation, 2); %ap의 x좌표에서 station의 x좌표를 뺀 값을 2제곱한 값을 저장합니다.
    distancey = power(y - ystation, 2); %ap의 y좌표에서 station의 y좌표를 뺀 값을 2제곱한 값을 저장합니다.
    distance = sqrt(distancex + distancey); %계산한 x좌표 y좌표를 더한 값의 루트값을 저장합니다.
    trans = 1/distance*100; %전송량을 구하는 공식으로 1/거리*100 을 계산후 저장해줍니다.
    
     if trans < 1 %전송량이 1보다 작을경우
        transpossible = 0; %전송 가능 여부 값을 0으로 저장합니다.
     else %전송량이 1보다 클경우 
        transpossible = 1; %전송 가능 여부 값을 1로 저장합니다.
        count = count + 1; %전송 가능한 station의 개수를 1씩 더해줍니다.
        transsum = transsum + trans; %전송 가능한 station의 전송량을 더합니다.
    end
     
    transmitable(3,i) = distance; %3행 1열에 거리값을 저장합니다.
    transmitable(4,i) = trans; %4행 1열에 전송량을 저장합니다.
    transmitable(5,i) = transpossible; %5행 1열에 전송 가능 여부를 저장합니다.
    
    fprintf('%d)Station location : (%d,%d)\n',i,xstation,ystation); %station의 x,y좌표를 출력합니다.
    fprintf('Ap distance : %f\n\n',distance); %계산한 거리값을 출력합니다.
    
end 
fprintf('total throughput : %f\n',transsum); %전송 가능한 station의 전송량을 더한 값을 출력합니다.
fprintf('Transmitable node : %d\n',count); %전송 가능한 station의 개수를 출력합니다.
disp(transmitable); %모든 데이터를 나타내는 행렬을 출력합니다.


