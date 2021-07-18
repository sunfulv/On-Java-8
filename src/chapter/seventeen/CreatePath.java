package chapter.seventeen;

import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author fulv
 * @desc 展示如何利用创建Path对象来表示文件或者目录的路径
 */
public class CreatePath {
    public static void main(String[] args) throws IOException {
        //传入各级目录字符串来构建Path对象
        System.out.println("----------直接传入绝对路径对应的目录字符串---------------");
        Path filePath = Paths.get("E:", "练手项目", "java学习", "On java 8", "src", "chapter",
                "seventeen", "第十七章_文件读写.md");
        System.out.println("当前程序运行的操作系统环境: " + System.getProperty("os.name"));
        System.out.println("文件路径为: " + filePath.toString());
        System.out.println("文件名为: " + filePath.getFileName());
        System.out.println("文件的绝对路径: " + filePath.toAbsolutePath());

        //传入URI来创建Path对象
        System.out.println("-----------------传入相对路径来创建Path对象-----------");
        Path p = Paths.get("On java 8.iml");
        System.out.println("文件的路径为: " + p.toString());
        System.out.println("文件的绝对路径为: " + p.toAbsolutePath());
        System.out.println("文件的真实路径: " + p.toRealPath());
        System.out.println("文件的URI为: " + p.toUri());
        //利用p的父目录创建Path对象
        System.out.println("--------------------传入文件的父目录来创建Path对象----------");
        Path dirPath = p.toAbsolutePath().getParent();
        System.out.println("目录路径为: " + dirPath.toString());
        System.out.println("是否是文件路径: " + Files.isRegularFile(dirPath));
        System.out.println("是否是目录路径: " + Files.isDirectory(dirPath));

        //将Path对象对应的路径分割成各个目录部分
        System.out.println("---------------输出文件路径的各个组成部分------------------");
        for (int i = 0; i < filePath.getNameCount(); i++) {
            System.out.println("文件路径的第" + i + "部分为: " + filePath.getName(i));
        }

        //Path类实现了Iterator接口，所以可以使用forEach来遍历
        for (Path part : filePath) {
            System.out.println(part);
        }

    }
}
