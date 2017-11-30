package fileWorks;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EX_OIStream implements Serializable {
	
	ObjectInputStream oi =null;
	ObjectOutputStream oo =null;
	
	public void EcrieObject() {
		try {
			oo = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("hatemBenTayeb"))));
			
			oo.writeObject(new Hatem_Ben_Tayeb("hatem","ben tayeb",22));
			
			oo.close();
		} catch (IOException e) {
			
		}
	}
	
	
	
	public void LireObject() {
		try {
			oi = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("hatemBenTayeb"))));
			
			System.out.println( ((Hatem_Ben_Tayeb) (oi.readObject()) ).toString());
			
			oi.close();
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			
		}
	}

}
