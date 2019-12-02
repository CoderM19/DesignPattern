package com.example.demo.command;
/**
 * 创建命令接口
 * @author Administrator
 *
 */
public interface Command {
  
	public void execute();
	
	public void undo();
}
