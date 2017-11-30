package fileWorks;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX_FIStream {

	FileInputStream fi = null;
	FileOutputStream fo = null;
	BufferedInputStream bi = null;
	BufferedOutputStream bo = null;
	int octet;

	public void LireFichier_Lente() {
		try {
			fi = new FileInputStream(new File("/home/hatembt/eclipse-workspace/fileWorks/src/HT_L_FIS"));
			while (true) {
				octet = fi.read();

				if (octet == -1) {
					break;
				}
				System.out.println("" + octet);
			}

		} catch (FileNotFoundException e) {
			System.out.println("fichier introuvable !!");
		} catch (IOException e) {
			System.out.println("Erreur I/O !!");

		} finally {
			try {
				fi.close();
			} catch (IOException e) {

				System.out.println("Erreur I/O !!");

			}
		}

	}

	
	public void LireFichier_Rapide() {

		try {
			bi = new BufferedInputStream(
					new FileInputStream(new File("/home/hatembt/eclipse-workspace/fileWorks/src/HT_L_FIS")));

			while (true) {
				octet = bi.read();

				if (octet == -1) {
					break;
				}
				System.out.println("" + octet);
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("fichier introuvable !!");

		} catch (IOException e) {
			System.out.println("Erreur I/O !!");

		} finally {
			try {
				bi.close();
			} catch (IOException e) {
				System.out.println("Erreur I/O !!");

			}
		}

	}

	public void EcrireFichier_lente() {
		try {
			fo = new FileOutputStream(new File("H_sortie_L"));
			fi = new FileInputStream(new File("/home/hatembt/eclipse-workspace/fileWorks/src/HT_L_FIS"));
			while (true) {
				octet = fi.read();

				if (octet == -1) {
					break;
				}
				fo.write(octet);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("fichier introuvable !!");

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				fo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

	public void EcrireFichier_Rapide() {
		try {
			bo =  new BufferedOutputStream(new FileOutputStream(new File("HT_sortie_R")));
			bi = new BufferedInputStream(
					new FileInputStream(
						new File("/home/hatembt/eclipse-workspace/fileWorks/src/HT_L_FIS")));
			

			while (true) {
				octet = bi.read();

				if (octet == -1) {
					break;
				}
//				System.out.println("" + octet);
				bo.write(octet);
			}
		} catch (FileNotFoundException e) {
			System.out.println("fichier introuvable !!");

		} catch (IOException e) {
			System.out.println("Erreur I/O !!");

		} finally {
			try {
				bo.close();
				bi.close();
			} catch (IOException e) {
				System.out.println("Erreur I/O !!");

			}
		}


	}
}
