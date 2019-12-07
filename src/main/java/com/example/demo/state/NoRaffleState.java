package com.example.demo.state;
/**
 * 不能抽奖的状态
 * @author Administrator
 *
 */
public class NoRaffleState implements State{
     //初始化时传入活动引用，扣除积分后改变其状态
	 RaffleActivity activity;
	
	
	public NoRaffleState(RaffleActivity activity) {
		super();
		this.activity = activity;
	}
    
	//当前状态可以扣积分
	@Override
	public void reduceMoney() {
		System.out.println("扣除50积分成功，您可以抽奖了");
		activity.setState(activity.getCanRaffleState());
	}

	@Override
	public boolean raffle() {
		System.out.println("扣了积分才能抽奖");
		return false;
	}

	@Override
	public void dispensePrize() {
		System.out.println("不能发放奖品");
	}

}
