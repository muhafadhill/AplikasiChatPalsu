package id.fadhil.aplikasichat;

/**
 * Created by ASUS on 03/11/2017.
 */

public class ImageHelper {
	public int image[] = {
			R.drawable.profil1,
			R.drawable.profil2,
			R.drawable.profil3,
			R.drawable.profil4,
			R.drawable.profil5,
			R.drawable.profil6,
			R.drawable.profil7,
			R.drawable.profil8,
	};

	public int getImage(int x) {
		int profil = image[x];
		return profil;
	}
}
