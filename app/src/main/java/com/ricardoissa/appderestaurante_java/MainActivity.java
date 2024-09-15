package com.ricardoissa.appderestaurante_java;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ricardoissa.appderestaurante_java.adpter.FoodAdapter;
import com.ricardoissa.appderestaurante_java.databinding.ActivityMainBinding;
import com.ricardoissa.appderestaurante_java.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;

private FoodAdapter foodAdapter;

private ArrayList<Food> foodList =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter =  new FoodAdapter(foodList,this);
        recyclerViewFood.setAdapter(foodAdapter);
       getFood();

    }
    private void getFood(){

        Food food1 = new Food(
    R.drawable.food1,
                "Food 1 ",
                "Porção de batatas fritas douradas e crocantes, servidas quentinhas e temperadas com sal na medida certa.",
                "$ 30.00"

        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "Food 2 ",
                "Delicados rolinhos de arroz temperado, recheados com peixe fresco, vegetais e algas, preparados com perfeição.",
                "$ 80.00"

        );
        foodList.add(food2);


        Food food3 = new Food(
                R.drawable.food3,
                "Food 3 ",
                "Corte suculento de carne grelhada no ponto certo, temperada com especiarias para realçar o sabor. Servida quente, macia e cheia de sabor, perfeita para uma refeição completa e satisfatória..",
                "$ 75.00"

        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "Food 4 ",
                "Prato delicioso composto por arroz soltinho, batatas douradas e crocantes, acompanhado de um filé de frango grelhado, macio e bem temperado. Uma refeição leve e saborosa, ideal para o dia a dia.",
                "$ 70.00"

        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "Food 5 ",
                "Massa al dente, servida com um molho caseiro de tomate fresco, levemente temperado com ervas. Simples, saboroso e perfeito para quem aprecia uma refeição clássica e reconfortante.",
                "$ 45.00"

        );
        foodList.add(food5);
    }
}