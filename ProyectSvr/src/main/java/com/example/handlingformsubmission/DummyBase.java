package com.example.handlingformsubmission;
import java.util.HashMap;
import java.util.Map;
public class DummyBase {
		private static HashMap<String,String>Miregistro;
			
		  static{
			Miregistro = new HashMap<String,String>();
			Miregistro.put("Lucas", "123");
			Miregistro.put("Junior", "456");
			Miregistro.put("Chile", "789");
			Miregistro.put("Agus", "100");
		}
		  static String traerContent(String key) {
			  return Miregistro.get(key);
		  }
		  
		  static HashMap<String,String> getRegistro(){
			  return Miregistro;
		  }
		  static void setRegistro(usuario usuario){
			  Miregistro.put(usuario.getUsuario(), usuario.getPass());
		  }
		  
		
		
}
