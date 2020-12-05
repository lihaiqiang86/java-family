package com.lee.log.slf4j.bridge;

/**
 * @author lihaiqiang
 * @since 2020/12/3
 */
public class Slf4jBridgeTest {

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            Jcl jcl = new Jcl();
            jcl.speak("Hello " + i);
            //
            Jul jul = new Jul();
            jul.speak("Hello " + i);
            //
            Log4j log4j = new Log4j();
            log4j.speak("Hello " + i);
            //
            Log4j2 log4j2 = new Log4j2();
            log4j2.speak("Hello " + i);
        }
    }
}
