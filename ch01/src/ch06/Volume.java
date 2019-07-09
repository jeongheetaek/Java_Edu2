package ch06;

public interface Volume {
	void volumeUp();
	void volumeDown();
}

class TV implements Volume{
	public void volumeUp() {
		System.out.println("Tv 소리 올리기");
	}
	public void volumeDown() {
		System.out.println("tv 소리 줄이기");
	}
	public void play() {
		System.out.println("tv 화면을 본다.");
	}
	
}

class Audio implements Volume{
	public void volumeUp() {
		System.out.println("오디오 볼륨 올리기");
	}
	public void volumeDown() {
		System.out.println("오디오 볼륨 줄이기");
	}
}

class Speaker implements Volume{
	public void volumeUp() {
		System.out.println("스피커 볼륨 올리기");
	}
	public void volumeDown() {
		System.out.println("스피커 볼륨 줄이기");
	}
}