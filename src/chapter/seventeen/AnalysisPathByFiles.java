package chapter.seventeen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author fulv
 * @desc 使用Files工具类分析Path对象的一些特性
 */
public class AnalysisPathByFiles {
    private static void say(String id, Object result) {
        System.out.println(id + ": " + result.toString());
    }

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("E:\\练手项目\\java学习\\On java 8\\src\\chapter\\seventeen\\第十七章_文件读写.md");

        //分析filePath的一些属性
        say("路径是否存在", Files.exists(filePath));
        say("是否是目录", Files.isDirectory(filePath));
        say("是否是可执行的", Files.isExecutable(filePath));
        say("是否是可读的", Files.isReadable(filePath));
        say("是否是可写的", Files.isWritable(filePath));
        say("文件的大小", Files.size(filePath));
        say("上次的修改时间", Files.getLastModifiedTime(filePath));
        say("文件的存储磁盘分区", Files.getFileStore(filePath));
    }
}
