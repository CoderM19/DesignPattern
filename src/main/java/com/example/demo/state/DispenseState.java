package com.example.demo.state;

public class DispenseState implements State{
   
	RaffleActivity activity;
	
	public DispenseState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}

	@Override
	public void reduceMoney() {
		System.out.println("不能扣除积分");
	}

	
	@Override
	public boolean raffle() {
		System.out.println("不能抽奖");
		return false;
	}

	@Override
	public void dispensePrize() {
		if(activity.getCount() >0) {
			System.out.println("恭喜中奖了");
			//改变状态为不能抽奖
			activity.setState(activity.getDispenseOutState());
		}else {
			System.out.println("很遗憾，奖品发送完了");
			//改变状态为奖品发放完毕
			activity.setState(activity.getDispenseOutState());
		}
	}

}
