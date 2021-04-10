function en = hillEncry(x,key);
%입력받은 문자열을 암호화 하기 위한 함수입니다.

table = ['a' : 'z']; %table에 a부터 z까지 알파벳 순서대로 정렬해서 배열의 형태로 넣습니다.
plain = []; %plain이라는 배열을 생성합니다.

for n = 1 : length(x) %n은 1부터 전달받은 x의 길이까지 반복하는 반복문입니다.
    plain(n) = find(table == x(n))-1; %plain배열에 입력받은 문자의 x의 n번째랑 table의 값이랑 같은값을 찾아서 넣어줍니다.
end

plain = plain'; %plain 행렬을 전치합니다.
en = mod(key*plain,26); %en에 key값*평문을 26으로 나눈 나머지 값(암호문)을 넣어줍니다.