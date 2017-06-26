package servletListener;

import java.util.Vector;

public class UserInfoList {
	private static final UserInfoList user = new UserInfoList();
	private Vector<String> vector = null;

	private UserInfoList() {
		this.vector = new Vector<String>();
	}

	public static UserInfoList getInstance() {
		return user;
	}

	public boolean addUserInfo(String user) {
		if (user != null) {
			vector.add(user);
			return true;
		} else
			return false;
	}

	public Vector<String> getList() {
		return vector;
	}

	public void removeUserInfo(String user) {
		if (user != null)
			vector.removeElement(user);
	}
}
