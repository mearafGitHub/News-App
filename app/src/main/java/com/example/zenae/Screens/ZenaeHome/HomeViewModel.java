package com.example.zenae.Screens.ZenaeHome;

import androidx.lifecycle.ViewModel;

import com.example.zenae.R;

import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends ViewModel {
List<News> newsList;


    public List<News> fakeNewsData() {
        newsList = new ArrayList<>();

        newsList.add("Brexit","Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", "04/11,2019", R.drawable.ic_undraw_newspaper_k72w);


        return newsList;

    }
}
