package chapter.seventeen;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author fulv
 * @desc 对Path进行修改，来构建新的Path对象
 */
public class ModifyPath {
    public static void main(String[] args) {
        //获取class所在目录的根目录
        Path base = Paths.get("..", "..", "..").toAbsolutePath().normalize();
        System.out.println("根目录为: " + base.toString());

        //向根目录base尾部填充尾路径，构造出On java 8项目所在的路径对应的Path
        Path projectPath = base.resolve("练手项目").resolve("java学习").resolve("On java 8");
        System.out.println("项目路径: " + projectPath.toString());

        //根据项目路径构造出当前java类的绝对路径
        Path filePath = projectPath.resolve("src").resolve("chapter").resolve("seventeen").resolve("ModifyPath.java");
        System.out.println("构造出的当前java文件所在路径: " + filePath);

        //从filePath中去掉packagePath,构造filePath相对于projectPath的相对路径
        Path fileRelativePath = projectPath.relativize(filePath);
        System.out.println("文件路径相对于项目路径的相对路径: " + fileRelativePath.toString());


    }
}
