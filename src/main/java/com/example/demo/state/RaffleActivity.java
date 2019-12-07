package com.example.demo.state;

public class RaffleActivity {
   //State 表示活动当前的状态
	State state = null;
	int count =0;
	
	State noRafflleState = new NoRaffleState(this);
	State canRaffleState  = new CanRaffleState(this);
	
	State dispenseState = new DispenseState(this);
	State dispenseOutState = new DispenseOutState(this);
			
	//1.初始化当前的状态为noRafflleState,即不能抽奖的状态
	public RaffleActivity(int count) {
		this.state = getNoRafflleState();
		this.count = count;
	}
      //扣分，调用当前状态的reduceMoney方法
	 public void reduceMoney() {
		 state.reduceMoney();
	 }
   
	 //抽奖
	 public void raffle() {
		 //如果当前的状态为抽奖成功
		 if(state.raffle()) {
			 //领取奖品
			 state.dispensePrize();
		 }
	 }
	 
	public void setState(State state) {
		this.state = state;
	}

    //每领一次奖品，count--
	public int getCount() {
		int curCount = count;
		count--;
		return curCount;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public State getNoRafflleState() {
		return noRafflleState;
	}


	public void setNoRafflleState(State noRafflleState) {
		this.noRafflleState = noRafflleState;
	}


	public State getCanRaffleState() {
		return canRaffleState;
	}


	public void setCanRaffleState(State canRaffleState) {
		this.canRaffleState = canRaffleState;
	}


	public State getDispenseState() {
		return dispenseState;
	}


	public void setDispenseState(State dispenseState) {
		this.dispenseState = dispenseState;
	}


	public State getDispenseOutState() {
		return dispenseOutState;
	}


	public void setDispenseOutState(State dispenseOutState) {
		this.dispenseOutState = dispenseOutState;
	}


	public State getState() {
		return state;
	}
	
	
}
