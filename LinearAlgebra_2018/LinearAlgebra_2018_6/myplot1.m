function x = myplot1(a) 
% a(data.txt)의 값을 받아서 그래프를 그리는 함수입니다.

x = load(a); % load명령을 통해서 x에 a(data.txt)의 데이터를 저장합니다.

q = x( : ,1); % q에 x의 1열 전체를 넣어줍니다.
w = x( : ,2); % w에 x의 2열 전체를 넣어줍니다.
e = x( : ,3); % e에 x의 3열 전체를 넣어줍니다.

plot(q, w, q, e, 'm--'), grid; % x축에 q,w y축에 q,e 값을 주어 그래프를 그리고 선의형태를 --(점선) 색을 m으로 설정합니다. 또한 grid를 사용하여 그래프에 격자선을 넣어줍니다.
axis([10, 90, 0, 10]); % x축의 범위를 10~90으로 y축의 범위를 0~10으로 설정합니다.
title('throughput vs. time (20145128 박인근)') % 그래프의 제목을 title안의 내용으로 설정합니다.
xlabel('time(s)') % x축의 이름을 xlabel안의 내용으로 설정합니다.
ylabel('throughput(Mbps)') %y축의 이름을 ylabel안의 내용으로 설정합니다.
legend('up', 'down', 'Location', 'East') % 그래프 안의 각 선의 이름을 설정하고 'East'에 위치하게 합니다.
