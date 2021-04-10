function x = myplot2()
%그래프를 그리기 위한 함수입니다.

x = 0 : 0.1 : 2*pi; % x는 0 부터 2pi까지 0.1간격으로 설정합니다.
y = sin(x); % y는 sin(x)의 값으로 설정합니다.
z = cos(x); % z는 cos(x)의 값으로 설정합니다.
subplot(2, 1, 1); % 그래프를 두개로 나눕니다 그리고 첫번째 그래프 설정입니다.
plot(x, y), grid; % x,y 로 그래프를 그리고 grid로 격자선을 설정합니다.
title('sine (20145128 박인근)'); %그래프의 제목을 title안의 내용으로 설정합니다.
legend('sine', 'Location', 'NorthEast'); % 그래프 안의 선의 이름을 설정하고 'NorthEast'에 위치하게 합니다.
axis([0, 2*pi, -1, 1]); % x축의 범위를 0에서 2pi까지, y축의 범위를 -1에서 1까지로 설정합니다.
ylabel('sin(x)'); % y축의 이름을 sin(x)로 합니다.
subplot(2, 1, 2); % 그래프를 두개로 나눕니다 그리고 두번째 그래프 설정입니다.
plot(x, z, 'g'), grid; % x,y 로 그래프를 그리고 색을 g로 주고 grid로 격자선을 설정합니다.
title('cosine (20145128 박인근)'); %그래프의 제목을 title안의 내용으로 설정합니다.
legend('cosine', 'Location', 'SouthEast'); % 그래프 안의 선의 이름을 설정하고 'SouthEast'에 위치하게 합니다.
axis([0, 2*pi, -1, 1]); % x축의 범위를 0에서 2pi까지, y축의 범위를 -1에서 1까지로 설정합니다.
ylabel('cos(x)'); % y축의 이름을 cos(x)로 합니다.
