function x = mystrcmp(a,b)
% 두 개의 문자열을 입력 받아 두 문자열이 같은지를 확인하는 함수입니다.
% 같으면 1을 반환, 다르면 0을 반환합니다.

    x = 1; % if문을 실행하기 위해 x에 초기값 1을 설정해줍니다.

if(length(a) ~= length(b)) %입력받은 a문자열과 b 문자열의 길이를 비교합니다
    x = 0;  %입력받은 a문자열과 b문자열의 길이가 다르면 x 에 0을 넣어줍니다.
else %입력받은 a문자열과 b문자열의 길이가 같은 경우
    for i=1:length(a) % 1부터 a의 길이까지 반복문을 실행합니다.
        if(a(i) ~= b(i)) %a의 첫번째문자부터 i번째 문자까지랑 b의 첫번째 문자부터 i번째 문자까지 다른지 비교합니다.
            x = 0; % 다르면 x에 0을 넣어줍니다.
            
        end %if문을 종료합니다.
    end %반복문을 종료합니다. 
end %if문을 종료합니다.
