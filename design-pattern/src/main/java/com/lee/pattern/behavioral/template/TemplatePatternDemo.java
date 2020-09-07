package com.lee.pattern.behavioral.template;

/**
 * @author lihaiqiang
 * @since 2020/9/7
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
