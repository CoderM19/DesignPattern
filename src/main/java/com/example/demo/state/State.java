package com.example.demo.state;
/**
 * 
 * @author Administrator
 *
 */
public interface State {
    
	//扣除积分 -50
	public void reduceMoney();
	
	//
	public boolean raffle();
	
	public void dispensePrize();
}
