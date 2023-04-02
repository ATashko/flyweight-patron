import java.util.ArrayList;
import java.util.List;

public class ListsOfClothesFactory {

    private static final List<Clothes> listOfClothes = new ArrayList<>();

    public void makeClothes(String size, String type, boolean isNew, boolean international){
        Clothes clothes = ClothesFactory.getClothesMap(size, type, isNew, international);
        listOfClothes.add(clothes);

    }

    public List<Clothes> getClothes() {
        return listOfClothes;
    }

}
