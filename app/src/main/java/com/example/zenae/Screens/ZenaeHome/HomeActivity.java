package com.example.zenae.Screens.ZenaeHome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.zenae.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.allNewsRecycler)
    RecyclerView newsRecyclerView;


    NewsViewAdapter newsViewAdapter;
    List<News> newses;

    @BindView(R.id.newItemContainer)
    LinearLayout newItemContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        initRecycler();
    }

    private void initRecycler() {
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