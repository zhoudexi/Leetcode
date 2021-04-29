package com.zdx;

import java.util.Scanner;

public class Power {

	public static void method(int m){
        //0 和 1 代表2的0次方和1次方 这两个算最底层 不能再小了 其他的都是由这两个组成的
        if(m == 0){
            System.out.print("2(0)");
        }else if(m == 1){
            System.out.print("2");
        }else{
            //除了0 和 1 其他都能再往小的化解
            //直接获取二进制串
            String binary = Integer.toBinaryString(m);
            int length = binary.length();
            for(int i = 0;i < length;i++){
                //比如 137 得到 10001001 从右边开始 0、3、7都为 '1'，而这0 3 7就是我们要找的次方
                if(binary.charAt(i) == '1'){
                    //这个就是几次方 为啥写这么啰嗦 因为我循环是从左边开始的 但二进制要从右边开始看
                    int power = length - i - 1;
                    //如果是0次方或者1次方 那下面两个不能输出 好懂的 因为它们已经是最小的 外面不能再套2()了
                    boolean flag = power != 0 && power != 1;
                    if(flag){
                        System.out.print("2(");
                    }
                    //递归
                    method(power);
                    if(flag){
                        System.out.print(")");
                    }
                    //最后一个次方不能加 + ，因为后面没了
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
