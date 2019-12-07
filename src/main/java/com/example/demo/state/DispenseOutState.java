package com.example.demo.state;
/**
 * 
 * @author Administrator
 *
 */
public class DispenseOutState implements State{
   
	RaffleActivity activity;
	
	
	public DispenseOutState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void reduceMoney() {
		System.out.println("奖品发完了，请下次再参加");
	}

	@Override
	public boolean raffle() {
		System.out.println("奖品发完了，请下次再参加");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("奖品发完了，请下次再参加");
	}

}
