package com.lee.log.log4j2;

/**
 * @author lihaiqiang
 * @since 2020/11/30
 */
public class Log4j2Test {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            Student student = new Student();
            Teacher teacher = new Teacher();
            person.speak("Hello " + i);
            student.speak("Hello " + i);
            teacher.speak("Hello " + i);
        }
    }
}
