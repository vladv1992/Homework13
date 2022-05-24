package ro.fasttraclit.Lab13.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
     private  final String name;
     private final String city;
     private final RestaurantType type;
     private final  int rating;

     public Restaurant(String name, String city, RestaurantType type, int rating){
          this.name = name;
          this.city = city;
          this.type = type;
          this.rating = rating;
     }
     public RestaurantType getType(){
         return type;
     }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type=" + type +
                ", rating=" + rating +
                '}';
    }

    public static List<Restaurant> allRestaurant(RestaurantType type, List<Restaurant> restaurants){
       List<Restaurant> result = new ArrayList<>();
         for (Restaurant restaurant : restaurants) {
             if(restaurant.getType().equals(type)) {
                 result.add(restaurant);
             }
         }
         return result;
     }

     public static void main(String [] args){
          List<Restaurant> restaurants = new ArrayList<>();
              restaurants.add(new Restaurant("Barbarosa","Baia Mare", RestaurantType.MEDITERANEEAN, 4));
              restaurants.add(new Restaurant("La cucina","Baia Mare", RestaurantType.GREEK, 4));
              restaurants.add(new Restaurant("Mesopaotamia","Baia Mare", RestaurantType.ROMANIAN, 4));
              restaurants.add(new Restaurant("Lake","Baia Mare", RestaurantType.FUSION, 4));

              System.out.println(allRestaurant(RestaurantType.GREEK, restaurants));

           Map<String, RestaurantType> restaurantNameType = new HashMap<>();
           restaurantNameType.put("Barbarosa",RestaurantType.MEDITERANEEAN);
           restaurantNameType.put("La cucina",RestaurantType.GREEK);
           restaurantNameType.put("Mesopotamia",RestaurantType.ROMANIAN);
           restaurantNameType.put("Lake",RestaurantType.FUSION);

           for (Map.Entry<String, RestaurantType> m : restaurantNameType.entrySet()){
               System.out.println(m.getKey() + " -> " + m.getValue());
           }
         System.out.println(restaurantNameType);
           
     }

}
