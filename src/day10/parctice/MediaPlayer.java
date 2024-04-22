package day10.parctice;

import java.util.Arrays;

// 미디어 플레이어 관리 클래스
class MediaPlayer {
    private MediaPlayable[] mediaList;

    public MediaPlayer() {
        this.mediaList = new MediaPlayable[0];
    }

    public void addMedia(MediaPlayable media) {
        // 주어진 media를 mediaList배열에 추가
        MediaPlayable[] temp
                = Arrays.copyOf(mediaList, mediaList.length + 1); // 배열 복사

        temp[temp.length - 1] = media;
        this.mediaList = temp;
    }

    public void playAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.play();
        }
    }

    public void pauseAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.pause();
        }
    }

    public void stopAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.stop();
        }
    }
}