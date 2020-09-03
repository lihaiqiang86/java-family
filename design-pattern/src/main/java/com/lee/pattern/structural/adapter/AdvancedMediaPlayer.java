package com.lee.pattern.structural.adapter;

/**
 * 高级媒体播放器
 *
 * @author lihaiqiang
 * @since 2020/9/3
 */
public interface AdvancedMediaPlayer {

    void playVlc(String fileName);

    void playMp4(String fileName);
}
