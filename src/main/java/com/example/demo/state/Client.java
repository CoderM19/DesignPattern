package com.example.demo.state;

public class Client {
   
	public static void main(String[] args) {
		//设置奖品为1
		RaffleActivity activity = new RaffleActivity(1);
		
		for(int i=0;i<3;i++) {
			System.out.println("第"+(i+1)+"次抽奖");
			
			//参加抽奖，第一步点击扣除积分
			activity.reduceMoney();
			
			//第二步抽奖
			activity.raffle();
			
		}
	}
}
