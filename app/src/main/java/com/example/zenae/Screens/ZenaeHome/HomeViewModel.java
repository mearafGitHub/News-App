package com.example.zenae.ViewModels;

public class HomeViewModel {
}

/*
* package com.gebeya.misiloch.home;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.gebeya.misiloch.App;
import com.gebeya.misiloch.data.image.Image;
import com.gebeya.misiloch.data.image.ImageDao;
import com.gebeya.misiloch.data.image.ImageDto;
import com.gebeya.misiloch.data.image.ImageServices;
import com.gebeya.misiloch.data.image.ImageTransformer;
import com.gebeya.misiloch.status.ApiStatus;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HomeViewModel extends AndroidViewModel {
    private Retrofit retrofit;
    //for local db store
    private ImageDao imageDao;
    //for broadcasting any changes
    private MutableLiveData<List<Image>> images;



    public HomeViewModel(@NonNull Application application) {
        super(application);

        retrofit = ((App)application).getRetrofit();
        imageDao = ((App)application).getDb().imageDao();
        images = new MutableLiveData<>(new ArrayList<>());
        //1. start loading
        load();
    }

    private void load(){
        //2. check if images are in local db
        List<Image> stored = imageDao.getAll();
        if(stored.isEmpty()){
            downloadImages();
        }
        else{
            images.setValue(stored);
        }
    }

    private void downloadImages(){
            ImageServices  service = retrofit.create(ImageServices.class);
            service.getImages().enqueue(new Callback<List<ImageDto>>() {
                @Override
                public void onResponse(Call<List<ImageDto>> call, Response<List<ImageDto>> response) {
                    List<Image> downloaded =
                            ImageTransformer.fromDtoList(response.body());
                    imageDao.addImages(downloaded);
                    images.setValue(downloaded);
                }

                @Override
                public void onFailure(Call<List<ImageDto>> call, Throwable t) {

                }
            });
    }

    public MutableLiveData<List<Image>> getImages() {
        return images;
    }
}

* */