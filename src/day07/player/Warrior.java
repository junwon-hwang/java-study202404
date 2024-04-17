package day07.player;

// 하위 클래스 (sub class)
// 상위 클래스로 부터 공통필드와 메서드를 내려받은 클래스
// Warrior (is a) Player == Warrior (extends) Player
// 한개의 부모만 상속 가능 , 다중상속불가 (파이썬 , C+가능)
// 필드와 매서드만 상속
public class Warrior extends Player{

    int rage; // 분노게이지

    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }


    public void dash(Warrior target) {
        System.out.printf("DASH 스킬을 사용합니다.");
    }

    // 오버라이딩: 부모가 물려준 메소드를 고쳐 사용하는 것
    // 규칙 : 부모가 물려준 형태를 유지할 것 (시그니쳐 => 파라미터, 리턴타입, 이름)
    //        접근제한자는 부모보다 more public 할 것!
    //        부모 default => 자식 default , protected, public
    //        부모 public => 자식 public
    @Override // (안전장치) 오버라이딩 룰을 지켰는지 검증해줌
    public void showStatus(){
        super.showStatus();
        System.out.println("# rage: " + this.rage);
    }


}
