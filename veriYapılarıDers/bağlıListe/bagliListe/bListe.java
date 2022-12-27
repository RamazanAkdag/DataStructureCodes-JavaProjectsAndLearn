
public class bListe {
  public listDugum ilk;

  /*
   * public bListe(char yeniCar){
   * listDugum yenDugum = new listDugum();
   * yenDugum.veri = yeniCar;
   * yenDugum.sonraki=ilk;
   * this.ilk = yenDugum;
   * }
   */
  public void basaEkle(String newString) {
    listDugum newDugum = new listDugum();
    newDugum.veri = newString;
    newDugum.sonraki = ilk;
    this.ilk = newDugum;
  }

  public void yazListe() {

    listDugum temp = ilk;
    while (temp.sonraki != null) {
      System.out.println(temp.veri);
      temp = temp.sonraki;
    }
    System.out.println(temp.veri);
  }

  public void sonaEkle(String eklencek) {
    listDugum temp = ilk;
    listDugum newduDugum = new listDugum();
    while (temp.sonraki != null) {
      temp = temp.sonraki;
    }

    newduDugum.veri = eklencek;
    temp.sonraki = newduDugum;

  }

  public void arayaEkle(int index, String eklencek) {
    listDugum temp = ilk;
    int sayac = 1;
    listDugum newDugum = new listDugum();
    newDugum.veri = eklencek;

    while (temp.sonraki != null) {
      if (sayac == index - 1) {
        newDugum.sonraki = temp.sonraki;
        temp.sonraki = newDugum;
      }
      temp = temp.sonraki;
      sayac++;
    }
  }

  public void elemanSil2(int index) {
    listDugum temp = ilk;
    int sayac = 1;
    if (index == 1) {
      ilk = temp.sonraki;
      return;
    }
    while (temp.sonraki != null) {
      if (sayac == index - 1) {
        listDugum temp2 = temp;
        temp2 = temp2.sonraki;
        temp.sonraki = temp2.sonraki;
        return;
      }
      temp = temp.sonraki;
      sayac++;
    }
    if (temp.sonraki == null) {
      temp = null;
    }
  }

}
