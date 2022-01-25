package com.springCore;

import org.springframework.beans.factory.annotation.Required;

public class Question5 {
	private String msg;
	private int msgID;
	
	private Q5Resource recEg;
	public int getMsgID() {
		return msgID;
	}
	public void setMsgID(int msgID) {
		this.msgID = msgID;
	}
	public String getMsg() {
		return msg;
	}
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}	

}
