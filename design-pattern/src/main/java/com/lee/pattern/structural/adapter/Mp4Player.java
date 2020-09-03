package com.lee.pattern.structural.adapter;

/**
 * mp4播放器
 *
 * @author lihaiqiang
 * @since 2020/9/3
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
