**SyncMap** is a Java library that provides lightweight JSON object maps for **synchronized client data**.

Suppose you have to write a feature similar to bookmark synchronization of Google Chrome. When a browser added a new bookmark, the browser notify it to a bookmark server. Then the server updates persistent repository(DB) and broadcast the update notification to all the clients listening the user's activity.

**SyncMap** is fit for this requirement. Client uses a SyncMap object as if it is an ordinary Map collection. All the works related to the synchronization is managed behind the scene. 

Let's start with an example client.

## Client example

    Connection conn = ...	// acquiring connection. Will be explained later.
    Map<String,JSONObject> map = conn.getMap("id.pocorall.bookmark");	// getMap() is a bloking operation.
    for(JSONObject obj: map.values()) {
    	System.out.println(obj);
    }
    // put() is a non-blocking op. i.e. the function returns immediately.
    map.put("http://somewhere.com", new JSONObject("{note:\"Favorate site!\"}")); 

## Server example

## Connector example

## Persistent example

## Comparision to an alternative approach

If the client directly accessing remote DB, the client must hit remote DB for every data access which cause some delay due to network latency. client-side database cache will be less helpful because other client can update the data. Moreover, if you write an app for android, unstable wireless connection make the situation worse.

