package task2;

public class Application implements Android, Ios{

	@Override
	public void pause() {
		System.out.println("app paused");
	}

	@Override
	public void play() {
		System.out.println("Play!!");
	}

	@Override
	public void stop() {
		System.out.println("Stop!!");
	}

}
