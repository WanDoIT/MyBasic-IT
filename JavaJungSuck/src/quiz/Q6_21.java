package quiz;

public class Q6_21 {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		if(isPowerOn) {
			isPowerOn = false;
		}
	}
	// (1) isPowerOn의 값이 true면 false , false 로 면 true로 바꾼다.
	void volumeUp() {
		if(volume < MAX_VOLUME) {
			volume++;
		}
		// (2) volume MAX_VOLUME 1 . 의 값이 보다 작을 때만 값을 증가시킨다
	}

	void volumeDown() {
		if(volume > MIN_VOLUME) {
			volume--;
		
		// (3) volume MIN_VOLUME 1 . 의 값이 보다 클 때만 값을 감소시킨다
	}
	}
	void channelUp() {

		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		// (4) channel 1 . 의 값을 증가시킨다
	}
	}
	void channelDown() {
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		// (5) channel 1 . 의 값을 감소시킨다

	}
} // class MyTv
}


