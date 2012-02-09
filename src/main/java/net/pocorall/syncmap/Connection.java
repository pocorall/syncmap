package net.pocorall.syncmap;

import net.pocorall.util.S1;
import org.json.JSONObject;

interface Connection {
	void addMessageListener(S1<Message> listener);

	boolean isConnected();

	void sendMessage(Message message);
}