package com.zdx;

import java.util.Scanner;

public class Power {

	public static void method(int m){
        //0 �� 1 ����2��0�η���1�η� ����������ײ� ������С�� �����Ķ�������������ɵ�
        if(m == 0){
            System.out.print("2(0)");
        }else if(m == 1){
            System.out.print("2");
        }else{
            //����0 �� 1 ������������С�Ļ���
            //ֱ�ӻ�ȡ�����ƴ�
            String binary = Integer.toBinaryString(m);
            int length = binary.length();
            for(int i = 0;i < length;i++){
                //���� 137 �õ� 10001001 ���ұ߿�ʼ 0��3��7��Ϊ '1'������0 3 7��������Ҫ�ҵĴη�
                if(binary.charAt(i) == '1'){
                    //������Ǽ��η� Ϊɶд��ô���� ��Ϊ��ѭ���Ǵ���߿�ʼ�� ��������Ҫ���ұ߿�ʼ��
                    int power = length - i - 1;
                    //�����0�η�����1�η� ����������������� �ö��� ��Ϊ�����Ѿ�����С�� ���治������2()��
                    boolean flag = power != 0 && power != 1;
                    if(flag){
                        System.out.print("2(");
                    }
                    //�ݹ�
                    method(power);
                    if(flag){
                        System.out.print(")");
                    }
                    //���һ���η����ܼ� + ����Ϊ����û��
                    if(i != binary.lastIndexOf('1')){
                        System.out.print("+");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        method(n);
    }
}
