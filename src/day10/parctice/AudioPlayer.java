package day10.parctice;

public class AudioPlayer extends MediaPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("오디오를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("오디오를 일시중지 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("오디오를 멈춥니다.");
    }
}
