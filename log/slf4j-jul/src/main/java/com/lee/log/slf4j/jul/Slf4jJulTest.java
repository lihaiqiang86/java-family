package com.lee.log.slf4j.jul;

import java.io.InputStream;
import java.util.logging.LogManager;

/**
 * @author lihaiqiang
 * @since 2020/11/30
 */
public class Slf4jJulTest {

    public static void main(String[] args) throws Exception {
        // 读取自定义配置文件
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("logging.properties");
        // 获取日志管理器对象
        LogManager logManager = LogManager.getLogManager();
        // 通过日志管理器加载配置文件
        logManager.readConfiguration(in);

        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();
        person.speak();
        student.speak();
        teacher.speak();
    }
}
