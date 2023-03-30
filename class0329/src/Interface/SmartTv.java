package Interface;

public class SmartTv extends Television implements Searchable {
	@Override
	public void turnOn() {
		System.out.println("SmartTV를 켭니다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > MAX_VOLUUE) {
			this.volume = MAX_VOLUUE;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재볼륨 : "+ this.volume);
	
}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"을 검색합니다");
	}
}
