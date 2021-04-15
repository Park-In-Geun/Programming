function ship
%������ �ٴٿ� ������ �ʰ� �迡 ���������� �����ϴ� simulation�Դϴ�.
%������ ���� ������ �ʴ� ���¿��� ������ ���� �� �踦 ���ؼ� ������,����,�Ʒ��� 3���� �������θ� ���Ѵٰ� �����մϴ�.
%������ �ʱ� ��ǥ�� (0,0)�̰� (0,10), (50,10),(0, 10), (50, 10), (50, -10), (0, -10)���� ������ ��â�� �ִ� ���̰� 
%y��ǥ�� -10 ~ 10 ���̿� �����鼭 x��ǥ�� 51�� �����ϸ� �迡 ���� ���������� ������ 10000���� �ɾ ���� ��â�� �ִ� ��� ���з� ����

rand('state',sum(100*clock)) %�����Ǵ� ���� �ѹ��� �ٲٱ� ���� seed���� �ִ� ������� �Ź� ���� ������ �����ϴ°��� ���� ���� clock�Լ��� ����մϴ�.
success=0; %���� Ƚ���� ����ϱ� ���� ������ 0���� �ʱ�ȭ���ݴϴ�.
fail=0; %���� Ƚ���� ����ϱ� ���� ������ 0���� �ʱ�ȭ���ݴϴ�.
percentage=0; %���� Ȯ���� ����ϱ� ���� ������ 0���� �ʱ�ȭ���ݴϴ�.

n = input('Number of simulation : '); %simulation Ƚ���� �Է¹޽��ϴ�.

for i = 1:n %1���� �Է¹��� n���� �ݺ��ϴ� �ݺ����Դϴ�.
    a = [0,0]; %������ ��ǥ�� 0,0���� �ʱ�ȭ���ݴϴ�.
    walk = 0; %�������� ����ϱ� ���� ������ 0���� �ʱ�ȭ���ݴϴ�.

    while walk < 10000 %10000�� �̻��� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
        r = rand; %r���ٰ� �������� �־��ݴϴ�.
        if r <= 0.6 %������ �������� ���� Ȯ��(60%)�� Ȯ���մϴ�.
            a(1) = a(1) + 1; %������ �������� �ɾ��� �� x��ǥ�� 1�� �����ݴϴ�.
        elseif r > 0.6 && r <=0.8 %���� �������� ���� Ȯ��(20%)�� Ȯ���մϴ�.
            a(2) = a(2) + 1; %���� �������� �ɾ��� �� y��ǥ�� 1�� �����ݴϴ�.
        elseif r > 0.8 && r <=1 %�Ʒ��� �������� ���� Ȯ��(20%)�� Ȯ���մϴ�.
            a(2) = a(2) - 1; %�Ʒ��� �������� ���� Ȯ��(20%)�� Ȯ���մϴ�.
        end %���ǹ��� �����մϴ�.
        
        if a(1) > 50 %x��ǥ�� 50���� ū�� Ȯ���մϴ�.
            if (a(2) < 11 && a(2) > -11) %y��ǥ�� 11���� �۰ų� -11���� ū���� Ȯ���մϴ�.
                 success = success + 1; %����Ƚ���� 1�� �����ݴϴ�.
            else %y��ǥ�� 11���� ũ�ų� -11���� ��������Դϴ�.
                 fail = fail + 1; %���� Ƚ���� 1�� �����ݴϴ�.
            end %���ǹ��� �����մϴ�.
            break; %while �ݺ����� ���߰� �մϴ�.
        end %���ǹ��� �����մϴ�.
        walk = walk + 1; %�������� 1�� �����ݴϴ�.
    end %while �ݺ����� �����մϴ�.
end %for �ݺ����� �����մϴ�.
percentage = success/n; %���� Ȯ���� ����Ƚ���� �Է¹��� Ƚ���� ���� ���� �־��ݴϴ�.

fprintf('success : %d\n',success); %���� Ƚ���� ����մϴ�.
fprintf('fail : %d\n',fail); %���� Ƚ���� ����մϴ�.
fprintf('success percentage : %d %%\n', percentage*100); %���� Ȯ���� ����մϴ�.
        