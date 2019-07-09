package ch06;

public class VolumeEx {

	public static void main(String[] args) {
		Volume[] vol = new Volume[3];
		
		vol[0] = new TV();
		vol[1] = new Audio();
		vol[2] = new Speaker();
		
		for( Volume v : vol) {
			v.volumeUp();
			v.volumeDown();
			if( v instanceof TV) {
				((TV)v).play();
			}
		}

	}

}
