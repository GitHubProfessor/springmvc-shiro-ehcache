package com.qd.entity;

import org.springframework.stereotype.Component;

@Component
public class AgentClientVo {
	
	private String userbrowser;
	private String useros;
	private String ip;

	public String getUserbrowser() {
		return userbrowser;
	}

	public void setUserbrowser(String userbrowser) {
		this.userbrowser = userbrowser;
	}

	public String getUseros() {
		return useros;
	}

	public void setUseros(String useros) {
		this.useros = useros;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
