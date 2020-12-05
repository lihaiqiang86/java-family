package com.lee.log.slf4j.bridge;

/**
 * @author lihaiqiang
 * @since 2020/12/3
 */
public class LogbackTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            Student student = new Student();
            Teacher teacher = new Teacher();
            person.speak("Hello " + i);
            student.speak("Hello " + i);
            teacher.speak("Hello " + i);
        }
    }
}
