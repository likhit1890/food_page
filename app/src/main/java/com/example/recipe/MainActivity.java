package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerView myrecyclerView1;
    RecyclerViewAdapter myAdapter;
    RecyclerViewAdapter myAdapter1;

    List<Recipes> recipes1;
    List<Recipes> recipes2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes2 = new ArrayList<>();
        recipes1.add(new Recipes("Savory Masala Oatmeal","1 tablespoon oil\n" +
                "1 teaspoon cumin seeds\n" +
                "green chilli pepper(optional)\n" +
                "1 cup onion\n" +
                "1 teaspoon ginger\n" +
                "1 teaspoon garlic\n" +
                "1/2 cup tomato\n" +
                "1.5 cups steel-cut oats\n" +
                "3.5 cups water\n" +
                "2 cups mixed vegetables(carrot, green beans, peas, corn)\n" +
                "1 tablespoon lime juice\n" +
                "1/2 teaspoon ground turmeric\n"+
                "1/2 teaspoon red chilli powder\n"+
                "1/2 teaspoon garam masala\n"+
                "1 teaspoon salt\n","Method",
                "Set the instant pot in sauté mode and let it heat. Then add ghee/oil, along with some cumin seeds, and let them sizzle.\n" +
                        "Then add the green chili, onions, ginger, and garlic. Sauté them well for a few minutes until the onions are translucent.\n" +
                        "Add tomato and spices. Mix well. If you like, you can also add cashews to the masala oats.\n" +
                        "Add tomato and spices. Mix well. If you like, you can also add cashews to the masala oats.\n" +
                        "Now pressure cook mode for 8 minutes at high pressure.  (5 minutes for quick cooking steel-cut oats)\n" +
                        "When the Instant pot beeps, wait for 10 minutes, then release the pressure and open the lid. It is okay to do a natural pressure release too.\n" +
                        "Add a bit of lime juice to the cooked masala oats and mix well.\n" +
                        "Garnish them with fresh cilantro leaves and enjoy with a dollop of yogurt\n",R.drawable.savory_oat_meal));

        recipes1.add(new Recipes("Quimoa Oat Dosa","Organic white Quinoa - A great sub for rice that is high in protein and fiber\n" +
                "Rolled Oats - Adds smooth texture and fiber" +
                "Urad Dal - Adds the traditional earthy dosa taste with creamy texture and proteins" +
                "Chana Dal - Helps make the dosa crispy" ,"Method","\n" +
                "Rinse the quinoa, oats & lentils. Drain out the water and then soak with 3 cups of water for 4 hours. Drain out all the water.\n" +
                "Add soaked and drained quinoa, oats & lentils to the blender and blend with water. The dosa batter consistency will be like pancake batter. Add salt and mix well. Note: You can allow the batter to rest for 20 mins to an hour or start making the dosa’s right away\n" +
                "Preheat a nonstick griddle on low heat. Pour about ⅓ cup of batter and spread it into a thin dosa using the back of the ladle or a measuring cup. Cook on medium heat and once the bottom starts to turn golden brown evenly spread some ghee or oil.\n" +
                "Using a flat spatula start removing the dosa from the outer edges, then gently fold the dosa and serve immediately\n"+
                "Before making the next dosa, lower the heat and wipe the pan using wet paper towels. You can also cut an onion in half and use the flat portion of the onion to rub on the pan. This helps cool down the pan a bit and will allow you to spread the batter thinly and evenly.\n",R.drawable.quimoa_oat_dosa));
        recipes1.add(new Recipes("Vegetable Upma","1 cup rava" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.vegetable_upma));
        recipes1.add(new Recipes("Dalia Khichdi","1 1/4 cups milk" +
                "1 egg" +
                "3 tablespoons butter melted" +
                "1 1/2 cups all-purpose flour" +
                "3 1/2 teaspoons baking powder" +
                "1 teaspoon salt" +
                "1 tablespoon white sugar","Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.dalia_kichidi));
        recipes1.add(new Recipes("Simple Idli Recipe","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely."+
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well.",R.drawable.idli));
        recipes2.add(new Recipes("Oatmeal Peanut Porridge","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                "further saute ½ onion till they turn soft." +
                "additionally add 1 cup tomato pulp and saute well." +
                "keep stirring till the tomato pulp thickens." +
                "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                "saute till the spices gets cooked completely."+
                "add in 3 tbsp water and mix well." +
                "cover and simmer for 5 minutes." +
                "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                "add in cooked pasta and mix gently till the sauce gets coated well.",R.drawable.oatmeal_peanut));
        recipes2.add(new Recipes("Delicious Mango Shake","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely."+
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well.",R.drawable.mango_milkshake));
        recipes2.add(new Recipes("Mixed Veg Whole Wheat Partha","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely."+
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well.",R.drawable.wheat_paratha));
        recipes2.add(new Recipes("Poha","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely."+
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well.",R.drawable.poha));
        recipes2.add(new Recipes("Sprouts Salad","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                        "further saute ½ onion till they turn soft." +
                        "additionally add 1 cup tomato pulp and saute well." +
                        "keep stirring till the tomato pulp thickens." +
                        "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                        "saute till the spices gets cooked completely."+
                        "add in 3 tbsp water and mix well." +
                        "cover and simmer for 5 minutes." +
                        "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                        "add in cooked pasta and mix gently till the sauce gets coated well.",R.drawable.sprouts_salad));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
        myrecyclerView1 = (RecyclerView)findViewById(R.id.recyclerView1_id);
        myAdapter = new RecyclerViewAdapter(this,recipes1);
        myAdapter1 = new RecyclerViewAdapter(this, recipes2);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        myrecyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        myrecyclerView.setAdapter(myAdapter);
        myrecyclerView1.setAdapter(myAdapter1);



    }

}
