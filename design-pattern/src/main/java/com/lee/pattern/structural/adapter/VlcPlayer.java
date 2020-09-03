package com.lee.pattern.structural.adapter;

/**
 * vlc播放器
 *
 * @author lihaiqiang
 * @since 2020/9/3
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
