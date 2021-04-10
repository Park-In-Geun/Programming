function de = hillDecry(en, key)
%입력받은 문자열을 복호화 하기 위한 함수입니다.

de = mod(key^-1 * en,26); %de에다가 key의 역행렬 값 * 암호문을 26으로 나눈 나머지 값을 넣어줍니다.
