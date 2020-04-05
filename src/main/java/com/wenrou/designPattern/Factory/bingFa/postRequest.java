package com.wenrou.designPattern.Factory.bingFa;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

public class postRequest {

        public void postMethod() throws IOException {
            String path="http://127.0.0.1:8081/placementservice/v2/placement/create";
            URL url =new URL(path);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("POST");//设置请求方式
            //设置请求头
            conn.setRequestProperty("Content-Type","application/json");
            conn.setRequestProperty("Authorization","Bearer YWRuZXR3b3Jrb3NzLDE1ODUzMDU3OTcsZDM2MGFiNmQ5YjQzYzE2Y2JhMDY2YWVjNmZiMjRlNWE1MGNlNjYxMA==");
            conn.setRequestProperty("OPERATOR_ACCOUNT","Bearer rileyhe");



        }

    public void getMethod() throws IOException {
        String path="http://127.0.0.1:8081/placementservice/v1/placement/get?placement_id=7070060029152626";
        URL url =new URL(path);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");//设置请求方式
        //设置请求头
        conn.setRequestProperty("Content-Type","application/json");
        conn.setRequestProperty("Authorization","Bearer YWRuZXR3b3Jrb3NzLDE1ODUzMDU3OTcsZDM2MGFiNmQ5YjQzYzE2Y2JhMDY2YWVjNmZiMjRlNWE1MGNlNjYxMA==");
        conn.setRequestProperty("OPERATOR_ACCOUNT","Bearer rileyhe");
        conn.setDoOutput(true);

        DataOutputStream outStream = new DataOutputStream(conn.getOutputStream());
        outStream.write(1000);
//        try {
//            while ((br.read())!=-1) {
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }





    }


}
