/**
 * 
 *
 * ����һ������ռ���߳�CPU�� n ������������־���ҵ������Ķ�ռʱ�䡣

ÿ����������һ��Ψһ�� Id���� 0 �� n-1���������ܻ�ݹ���û��߱������������á�

��־�Ǿ������¸�ʽ���ַ�����function_id��start_or_end��timestamp�����磺"0:start:0" ��ʾ���� 0 �� 0 ʱ�̿�ʼ���С�"0:end:0" ��ʾ���� 0 �� 0 ʱ�̽�����

�����Ķ�ռʱ�䶨�����ڸ÷����л��ѵ�ʱ�䣬���������������ѵ�ʱ�䲻��ú����Ķ�ռʱ�䡣����Ҫ���ݺ����� Id ����ط���ÿ�������Ķ�ռʱ�䡣

ʾ�� 1:

����:
n = 2
logs = 
["0:start:0",
 "1:start:2",
 "1:end:5",
 "0:end:6"]
���:[3, 4]
˵����
���� 0 ��ʱ�� 0 ��ʼ����ִ����  2��ʱ�䵥λ������ʱ�� 1��
���ں��� 0 ���ú��� 1������ 1 ��ʱ�� 2 ��ʼ��ִ�� 4 ��ʱ�䵥λ�������ʱ�� 5��
���� 0 �ٴ���ʱ�� 6 ��ʼִ�У�����ʱ�� 6 �������У��Ӷ�ִ���� 1 ��ʱ�䵥λ��
���Ժ��� 0 �ܹ���ִ���� 2 +1 =3 ��ʱ�䵥λ������ 1 �ܹ�ִ���� 4 ��ʱ�䵥λ��

˵����

    �������־�����ʱ������򣬶����Ǹ�����־Id����
    ����������ݺ���Id����Ҳ����ζ�����������������Ϊ 0 ��Ԫ���൱�ں��� 0 ��ִ��ʱ�䡣
    ��������������ͬʱ��ʼ�������
    �����������ݹ���ã�ֱ�����н�����
    1 <= n <= 100


 */
/**
 * @author Administrator
 *
 */
package me_636;