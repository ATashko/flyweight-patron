import java.util.HashMap;
import java.util.Map;

public class ClothesFactory {

    static Map<String, Clothes> clothesMap = new HashMap<>();

    public static Clothes getClothesMap(String size,String type, boolean isNew, boolean international){

        String key = "clave:" + size + "," + type + "," + isNew + "," + international;


        if (!clothesMap.containsKey(key)){

            clothesMap.put(key, new Clothes(size,type,isNew, international));

            System.out.println("Prenda creada");


        }else{

            System.out.println("Prenda obtenida");
        }
        return clothesMap.get(key);
    }
}
