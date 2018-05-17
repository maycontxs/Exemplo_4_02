package laboratorio.com;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
// or  import javax.inject.Named;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user") // @Named("user")
@SessionScoped
public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private String aboutYourself;

	public String getName() {
		return name;
	}

	public void setName(String newValue) {
		name = newValue;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newValue) {
		password = newValue;
	}

	public String getAboutYourself() {
		return aboutYourself;
	}

	public void setAboutYourself(String newValue) {
		aboutYourself = newValue;
	}
}