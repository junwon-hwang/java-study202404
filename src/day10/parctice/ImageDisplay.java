package day10.parctice;

public class ImageDisplay extends MediaPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지를 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지를 일시중지 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지를 멈춥니다.");
    }
}
