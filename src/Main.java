public class Main {

    public static void main(String[] args) {

        final ListsOfClothesFactory sizeXS = new ListsOfClothesFactory();
        final ListsOfClothesFactory sizeS = new ListsOfClothesFactory();
        final ListsOfClothesFactory sizeM = new ListsOfClothesFactory();
        final ListsOfClothesFactory imported = new ListsOfClothesFactory();
        final ListsOfClothesFactory damaged = new ListsOfClothesFactory();

        for (int i = 0; i < 1000000; i++) {
            sizeXS.makeClothes("XS", "T-Shirt", true, true);
            sizeS.makeClothes("S", "T-Shirt", true, true);
            sizeM.makeClothes("M", "T-Shirt", true, true);
            imported.makeClothes("M", "T-Shirt", true, true);
            damaged.makeClothes("M", "T-Shirt", false, true);

        }
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
