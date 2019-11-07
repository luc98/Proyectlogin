package com.example.handlingformsubmission;

public class usuario {
			private String usuario;
			private String pass;
			public String getUsuario() {
				return usuario;
			}
			public void setUsuario(String usuario) {
				this.usuario = usuario;
			}
			public String getPass() {
				return pass;
			}
			public void setPass(String pass) {
				this.pass = pass;
			}
			public usuario() {}
			public usuario(String usuario, String pass) {
				this.usuario=usuario;
				this.pass=pass;
			}
}
