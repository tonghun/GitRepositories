package spring.properties01;

import java.util.Properties;
import java.util.Set;

public class Prop {
	private Properties pop;

	public Properties getPop() {
		return pop;
	}

	public void setPop(Properties pop) {
		this.pop = pop;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	private Set<String> set;
}
