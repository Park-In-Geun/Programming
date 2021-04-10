function triangle
%랜덤으로 배치된 세개의 점의 넓이를 구하는 프로그램

n = input('index count input : ');  %세점의 좌표를 몇 개 생성할 지 입력받습니다.
format bank; %소수점 두번째 자리까지만 출력하기위한 함수입니다.
max_index = 0; %넓이가 가장 큰 배열이 몇번 째 배열인지 저장하기 위한 변수입니다.
max_area= 0; %가장 큰 넓이를 저장하기 위한 배열입니다.

datatable = [8;n]; % 8xn의 행렬을 생성합니다. 

for i = 1 : n % 1부터 입력받은 n까지 반복하는 반복문입니다.
    

first_index_x = randi([-10,10],1,1); %세 개의 점중 첫 번째 점의 x,y좌표를 -10,10 범위의 랜덤값으로 저장합니다.
first_index_y = randi([-10,10],1,1); %세 개의 점중 첫 번째 점의 x,y좌표를 -10,10 범위의 랜덤값으로 저장합니다.
second_index_x = randi([-10,10],1,1); %세 개의 점중 두 번째 점의 x,y좌표를 -10,10 범위의 랜덤값으로 저장합니다.
second_index_y = randi([-10,10],1,1); %세 개의 점중 두 번째 점의 x,y좌표를 -10,10 범위의 랜덤값으로 저장합니다.
third_index_x = randi([-10,10],1,1); %세 개의 점중 세 번째 점의 x,y좌표를 -10,10 범위의 랜덤값으로 저장합니다.
third_index_y = randi([-10,10],1,1); %세 개의 점중 세 번째 점의 x,y좌표를 -10,10 범위의 랜덤값으로 저장합니다.


first_point = [first_index_x,first_index_y,0]; % 첫 번째 점의 x,y,z 좌표를 지정합니다.
second_point = [second_index_x,second_index_y,0]; % 두 번째 점의 x,y,z 좌표를 지정합니다.
third_point = [third_index_x,third_index_y,0]; % 세 번째 점의 x,y,z 좌표를 지정합니다.

a = sqrt((first_index_x - second_index_x)^2 + (first_index_y - second_index_y)^2); %헤론을 구하기 위한 변수 중 하나로 계산한 값을 저장합니다.
b = sqrt((second_index_x - third_index_x)^2 + (second_index_y - third_index_y)^2); %헤론을 구하기 위한 변수 중 하나로 계산한 값을 저장합니다.
c = sqrt((third_index_x - first_index_x)^2 + (third_index_y - first_index_y)^2); %헤론을 구하기 위한 변수 중 하나로 계산한 값을 저장합니다.

s = (a+b+c)/2; % 헤론을 구하기 위한 변수로 계산 값을 저장합니다.
heron=sqrt(s*(s-a)*(s-b)*(s-c)); % 헤론을 구하는 공식입니다.


v1 = first_point - second_point; %벡터의 외적을 이용한 공식에서 사용하기 위한 변수입니다.
v2 = third_point - first_point; %벡터의 외적을 이용한 공식에서 사용하기 위한 변수입니다.
cv = cross(v1,v2); %외적을 구하는 함수입니다.
mag = norm(cv); %벡터의 노름 공간을 구합니다.
area = mag / 2; %벡터의 노름을 나누기 2해서 넓이를 구합니다.


datatable(1,i) = first_index_x; %행렬 1행 i열에 첫 번째 점의 x좌표를 넣습니다.
datatable(2,i) = first_index_y %행렬 2행 i열에 첫 번째 점의 y좌표를 넣습니다.
datatable(3,i) = second_index_x; %행렬 3행 i열에 두 번째 점의 x좌표를 넣습니다.
datatable(4,i) = second_index_y; %행렬 4행 i열에 두 번째 점의 y좌표를 넣습니다.
datatable(5,i) = third_index_x; %행렬 5행 i열에 세 번째 점의 x좌표를 넣습니다. 
datatable(6,i) = third_index_y; %행렬 6행 i열에 세 번째 점의 y좌표를 넣습니다.
datatable(7,i) = heron; %행렬 7행 i열에 헤론의 값을 넣습니다.
datatable(8,i) = area; %행렬 8행 i열에 외적을 이용해서 구한 넓이를 넣습니다.

if max_area == 0 % 가장 큰 넓이가 0일때
    max_area = heron; %max_area 변수에 헤론을 넣습니다.
    max_index = i; %max_index 변수에 i 값을 넣습니다. (몇 번째 점들인지)
else 
   if max_area < heron %저장된 max_area 값이 헤론보다 작은 경우
      max_area = heron; %max_area 변수에 헤론을 넣습니다.
      max_index = i; %max_index 변수에 i값을 넣습니다. (몇 번째 점들인지)
      end
    end
end

fprintf('\n max_Index : %d',max_index); %가장 큰 배열이 몇 번째 배열인지 출력합니다.
fprintf('\n first point : (%d, %d)', datatable(1,max_index),datatable(2,max_index)); %첫 번째 점의 x,y좌표를 출력합니다. 
fprintf('\n second point : (%d, %d)', datatable(3,max_index),datatable(4,max_index)); %두 번째 점의 x,y좌표를 출력합니다.
fprintf('\n third point : (%d, %d)', datatable(5,max_index),datatable(6,max_index)); %세 번째 점의 x,y좌표를 출력합니다.
fprintf('\n Heron : %f',datatable(7,max_index)); %헤론을 출력해줍니다.
fprintf('\n External : %f\n', datatable(8,max_index)); %외적을 이용해서 구한 넓이를 출력합니다.

disp(datatable); %datatable에 저장된 행렬을 출력합니다.



    