package com.phoegel.decorator.analysis;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 从当前文件夹中读取文件为输入流
        InputStream fileInputStream = new FileInputStream("decorator/text.txt");
        // 2 从字节流中读取内容
        // 2.1 定义一个缓冲字节数组
        byte[] buffer = new byte[1024];
        // 2.2 定义读取标志位
        int read;
        // 2.3 循环读取字节到缓冲数组中
        System.out.println("开始输出文件内容");
        while ((read = fileInputStream.read(buffer)) != -1) {
            // 将读取的字节转换为字符串对象
            String str = new String(buffer, 0, read);
            System.out.println(str);
        }
        System.out.println("输出文件结束");
        // 2.4 文件字节流没有 mark/reset （标记/重置）功能
        System.out.println("markSupported:" + fileInputStream.markSupported());
        System.out.println("---------------------");

        // 3. 将字节流包装为缓冲字节流
        InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("decorator/text.txt"));
        // 3.1 缓冲字节流支持 mark、reset （标记/重置）功能
        System.out.println("markSupported:" + bufferedInputStream.markSupported());
        // 3.2 读取第一个字节的数据
        System.out.println((char) bufferedInputStream.read());
        // 3.3 标记当前输入流中的位置
        bufferedInputStream.mark(0);
        // 3.4 读取下三个字节数据
        System.out.println((char) bufferedInputStream.read());
        System.out.println((char) bufferedInputStream.read());
        // 3.5 重置到 2.2.4 中标记的位置
        bufferedInputStream.reset();
        // 3.6 读取下一个字节数据
        System.out.println((char) bufferedInputStream.read());
    }
}
