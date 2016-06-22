package com.tamerbarsbay.easyvideoplayer;

/**
 * @author Aidan Follestad (afollestad)
 */
public interface EasyVideoCallback {

    void onPreparing(EasyVideoPlayer player);

    void onPrepared(EasyVideoPlayer player);

    void onBuffering(int percent);

    void onError(EasyVideoPlayer player, Exception e);

    void onCompletion(EasyVideoPlayer player);

    void onLeftAction(EasyVideoPlayer player);

    void onRightAction(EasyVideoPlayer player);

}