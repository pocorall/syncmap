package net.pocorall.syncmap;

import com.sun.deploy.panel.UpdatePanel;
import org.json.JSONObject;

public class Message {
	public static final int CONNECTION_BROKEN = 0;
	public static final int UPDATE = 1;
	public static final int DELETE = 2;

	private int type = UPDATE;

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	private long timestamp;

	public JSONObject toJson() {

	}
}
