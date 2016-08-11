package builder;

import detail.LogInDetail;

public class LogInDetailBuilder {
	private String email;

	private String pass;
	
	public LogInDetailBuilder(){
	}
	
	public LogInDetailBuilder(String email, String pass){
		this.email = email;
		this.pass = pass;
	}

	public LogInDetailBuilder withEmail(String email) {
		this.email = email;
		return this;
	}

	public LogInDetailBuilder withPass(String pass) {
		this.pass = pass;
		return this;
	}

	public LogInDetail loginbuild() {
		return new LogInDetail(email, pass);
	}

}
