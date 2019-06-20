package com.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyProperties {
	String name;
	String version;
	boolean messagingused;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public boolean isMessagingused() {
		return messagingused;
	}
	public void setMessagingused(boolean messagingused) {
		this.messagingused = messagingused;
	}
	@Override
	public String toString() {
		return "MyProperties [name=" + name + ", version=" + version + ", messagingused=" + messagingused + "]";
	}
	
	

}
