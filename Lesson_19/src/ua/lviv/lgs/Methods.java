package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods { 
	
	public static void serialize(File files, Employee employee) throws IOException {

		OutputStream OutPut_Stream = new FileOutputStream(files);
		
		ObjectOutputStream Obj_OutPut_Stream = new ObjectOutputStream(OutPut_Stream);
		Obj_OutPut_Stream.writeObject(employee);
		Obj_OutPut_Stream.close();
	
	}

public static Serializable deserealize(File files) throws IOException, ClassNotFoundException {
		
		InputStream Input_Stream = new FileInputStream(files);
		
		ObjectInputStream Obj_Input_Stream = new ObjectInputStream(Input_Stream);
		Serializable employee = (Serializable) Obj_Input_Stream.readObject();
		Obj_Input_Stream.close();
		Input_Stream.close();
		return employee;
		
	}
}
