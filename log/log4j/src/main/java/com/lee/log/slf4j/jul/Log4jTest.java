package com.lee.log.slf4j.jul;

/**
 * @author lihaiqiang
 * @since 2020/11/30
 */
public class Log4jTest {

    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();
        person.speak();
        student.speak();
        teacher.speak();
    }
}
