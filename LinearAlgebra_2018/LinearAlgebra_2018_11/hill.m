function hill
%힐 암호는 2차 세계대전 때 이용된 암호로, 평문 n개의 문자를 n개의 암호 문자로 대치하는 것이고, 행렬을 이용한 암호이다.
%힐 암호에서 영문을 암호화 하려면 각 영문에 따른 숫자가 정해져 있어서 숫자화 할 수 있다.

key = [3, 1;2, 1]; % 평문을 암호화, 복호화 하기 위한 key값(이 때 ad-bc=1) 입니다.

n = input('input string : ','s'); %문자열을 입력받습니다.

if mod(length(n),2) == 1 %문자열의 길이를 2로 나눴을때 나머지가 1일 경우를 확인합니다.
    n(length(n) +1 ) = 'z'; %조건이 맞을 경우 문자열의 마지막에 문자 'z'를 추가해줍니다.
end 

a = length(n); %a에다가 입력받은 문자열 n의 길이의 값을 저장합니다.
table = 'a' : 'z'; %a부터 z까지 알파벳 순서대로 정렬해서 table에 넣습니다.

for i = 1:2:a %i는 1부터 입력받은 문자열 n의 길이까지 2씩 끊어서 증가시키는 반복문입니다.
    x = n(i); %x에다가 문자열 n의 첫번째 문자를 넣습니다.
    y = n(i+1); %y에다가 문자열 n의 두번째 문자를 넣습니다.
    temp = [x,y]; %temp에다가 x.y값을 넣습니다.
    
    en = hillEncry(temp, key); %temp값과 key값을 hillEncry함수에 보내서 나온 값을 en에 넣습니다.
    disp('Encryption'); %''안의 내용을 출력합니다.
    disp(table(round(en(1))+1)) %암호화된 첫번 째 단어를 반올림 함수 round를 사용해서 출력합니다.
    disp(table(round(en(2))+1)) %암호화된 두번 째 단어를 반올림 함수 round를 사용해서 출력합니다.
    de = hillDecry(en, key); %en값과 key값을 hillDecry함수에 보내서 나온 값을 de에 넣습니다.
    disp('Decryption'); %''안의 내용을 출력합니다.
    disp(table(round(de(1))+1)) %복호화된 첫번 째 단어를 반올림 함수 round를 사용해서 출력합니다.
    disp(table(round(de(2))+1)) %복호화된 두번 째 단어를 반올림 함수 round를 사용해서 출력합니다.
    
end


    

