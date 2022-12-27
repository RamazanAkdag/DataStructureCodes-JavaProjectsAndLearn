public class bagliListe {
    public dugum head = null;

    public void elemanEkle(int veri) {
        dugum newDugum = new dugum(veri);
        if (head == null) {
            head = newDugum;
        } else {
            if (newDugum.data < head.data) {
                newDugum.next = head;
                head = newDugum;

            } else if (newDugum.data == head.data) {
                newDugum.next = head;
                head = newDugum;

            } else {
                dugum temp = head;
                while (temp.next != null) {
                    if (temp.next.data < newDugum.data) {
                        temp = temp.next;
                    } else {
                        newDugum.next = temp.next;
                        temp.next = newDugum;
                        return;
                    }
                }
                temp.next = newDugum;
                return;
            }
        }
    }

    public void yazListe() {
        if (head == null) {
            System.out.println("liste bos");
        } else {
            dugum temp = head;
            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
