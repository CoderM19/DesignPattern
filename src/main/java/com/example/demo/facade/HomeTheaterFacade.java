package com.example.demo.facade;

public class HomeTheaterFacade {
    
	//定义各个子系统对象
	private TheaterLight theaterLight;
	private Popcorn popcorn;
	private Stereo stereo;
	private Projector projector;
	private Screen screen;
	private DVDPlayer dvdPlayer;
	
	public HomeTheaterFacade() {
		super();
		this.theaterLight = TheaterLight.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.stereo = Stereo.getInstance();
		this.projector = Projector.getInstance();
		this.screen = Screen.getInstance();
		this.dvdPlayer = DVDPlayer.getInstance();
	}
	
	//操作分成4步
	public void ready() {
		popcorn.on();
		popcorn.play();
		screen.down();
		projector.on();
		stereo.on();
		dvdPlayer.on();
		theaterLight.dim();
	}
	
	public void play() {
		dvdPlayer.play();
	}
	public void pause() {
		dvdPlayer.pause();
	}
	
	public void end() {
		popcorn.off();
		theaterLight.bright();
		screen.up();
		projector.off();
		stereo.off();
		dvdPlayer.off();
	}
	
	public static void main(String[] args) {
		HomeTheaterFacade home=	new HomeTheaterFacade();
		home.ready();
		home.play(); 
		
	}
	
}
