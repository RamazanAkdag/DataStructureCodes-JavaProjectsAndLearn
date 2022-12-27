
public class test{
    public static void main(String[] args) {
        matematik.alan alan = new matematik.alan();/*statik inner classlardan obje olusturmak istedigimizde matematik classından
        da ayrıca obje olusturmamıza gerek kalmıyor... direk matematik classının icindeki classa . ile ulasaraak obje tanımlayabiliyoruz*/

        alan.daire_alan(5);
    }

}