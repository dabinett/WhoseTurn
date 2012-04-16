package edu.unlv.cs.whoseturn.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UsersServiceAsync {
	void usersServer(AsyncCallback<String> callback)
			throws IllegalArgumentException;
	
	void isLoggedIn(AsyncCallback<Boolean> callback)
			throws IllegalArgumentException;
	
	void getLoginURL(String location, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	
	void getUsername(AsyncCallback<String> callback)
			throws IllegalArgumentException;
	
	void getLogoutURL(String location, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}