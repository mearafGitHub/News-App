package com.example.zenae.Screens.ZenaeHome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.zenae.R;
import com.example.zenae.Repository.data.News;
import com.example.zenae.framework.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity {

    @BindView(R.id.allNewsRecycler)
    RecyclerView newsRecyclerView;

    public List<News> newses;

    NewsViewAdapter newsViewAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        newses = new ArrayList<>();

        initRecycler();
    }

    private void initRecycler() {

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira",  R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira",  R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira",R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira",  R.drawable.ic_undraw_newspaper_k72w));

        newses.add(new News("Brexit", "Britain apologised! ", "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book.",
                "Algezira", R.drawable.ic_undraw_newspaper_k72w));

        HomeViewModel.fakeNewsData();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        newsRecyclerView.setLayoutManager(linearLayoutManager);
        newsViewAdapter = new NewsViewAdapter(this, newses);
        newsRecyclerView.setAdapter(newsViewAdapter);
    }




}



















/*
*
*
public class HomeActivity extends BaseActivity {

    @BindView(R.id.homeRecyclerView)
    RecyclerView recyclerView;
    private HomeViewModel viewModel;
    private ImagesAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        viewModel = new ViewModelProvider
                .AndroidViewModelFactory(getApplication())
                .create(HomeViewModel.class);
         adapter = new ImagesAdapter(this, new ArrayList<>());
         recyclerView.setAdapter(adapter);

         // access the mutable data
       viewModel.getImages().observe(this, new Observer<List<Image>>() {
           @Override
           public void onChanged(List<Image> images) {
               adapter.setImages(images);
               adapter.notifyDataSetChanged();
           }
       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.homeMenuStatus:
                startActivity(new Intent(this, StatusActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
*/