public class Main {
    public static void BubbleSort(int[] dizi) {
        //dizi içinde gezeceğiz
        //2 tane for açacağız ilk for döngüsü tur sayısını gösterecek 2. for dizi içerisinde gezdirecek
        //bir adet temp değeri atayacağız çünkü dizi içerisinde eleman değiştirmesi yaparken elemenın kaybolmaması için
        //j nin son değerini dizi.length - i - 1 tanımlamamızın sebebi her seferinde tümüne bakmasın bir öncekine baksın öyle yazdırsın diye

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length - 1 - i; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    int temp = dizi[j]; //çünkü dizinin i. elemanı j + 1 i ile aynı elemandır ve bu elemana atama yaptığımız zaman kaybolmasını istemiyoruz
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }

        }


    }

    public static void Yazdir(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "    ");
        }


    }


    public static void main(String[] args) {
        int[] array = {6, 4, 3, 5, 7, 9, 2};
        System.out.println("Sıralamadan Önce : ");
        System.out.println();
        Yazdir(array);
        System.out.println();

        BubbleSort(array);
        System.out.println("Sıralamadan Sonra: ");


        Yazdir(array);


    }


}