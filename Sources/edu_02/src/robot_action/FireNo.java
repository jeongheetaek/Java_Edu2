package robot_action;

public class FireNo implements FireAction {
//fire에서 선언이 되어있는데 (interface)는 꼭 사용해줘야 한다. (FireAction에 있는 fire 사용해야함)
	
	@Override
	public void fire() {
		System.out.println("미사일 발사 기능 없음");
	}

}
