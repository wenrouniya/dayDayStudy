package com.wenrou.exception.morecatch;

public class test1 {
    public static void main(String[] args) {

        try{
            int i=1;
            int j=0;
           int k=i/j;
        }catch (RuntimeException ee){
            ee.printStackTrace();
            System.out.println("捕获RuntinmeException");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("捕获Exception异常");

        }finally {
            System.out.println("程序运行结束");
        }
    }
}
