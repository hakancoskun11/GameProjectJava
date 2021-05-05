package gameProject;

public class MernisControllerManager implements MernisController {

	@Override
	public boolean validatePerson(Gamer gamer) {
		if(this.tcValidate(gamer.nationalId)) {
			System.out.println("Kullanýcý bulundu, giris basarili.");
			return true;
		}
		else {
		System.out.println("Kullanýcý bulunamadý, giris basarýsýz.");
		return false;
		}

	}

	@Override
	public boolean tcValidate(String tc) {
		int teklerToplam = 0;
		int ciftlerToplam= 0;
		for(int x=0; x<=8; x+=2) {
			teklerToplam+= (Integer.valueOf(tc.substring(x, x + 1)));
        }
        for (int x = 1; x <= 7; x += 2) {
            ciftlerToplam+= (Integer.valueOf(tc.substring(x, x + 1)));
        }


        int haneOn = (teklerToplam * 7 - ciftlerToplam) % 10;
        int haneOnBir = (teklerToplam + ciftlerToplam + haneOn)%10;

        return (haneOn == Integer.valueOf(tc.substring(9, 10)) && haneOnBir == Integer.valueOf(tc.substring(10, 11)));
		}

	
}
