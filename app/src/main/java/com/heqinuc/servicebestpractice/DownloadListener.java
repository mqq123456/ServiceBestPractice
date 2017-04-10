package com.heqinuc.servicebestpractice;

/**
 * Created by heqin on 2017/4/9.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCancled();
}
