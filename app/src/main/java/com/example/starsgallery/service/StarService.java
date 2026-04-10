package com.example.starsgallery.service;

import com.example.starsgallery.beans.Star;
import com.example.starsgallery.dao.IDao;
import java.util.ArrayList;
import java.util.List;

public class StarService implements IDao<Star> {
    private List<Star> stars;
    private static StarService instance;

    private StarService() {
        stars = new ArrayList<>();
        seed();
    }

    public static StarService getInstance() {
        if (instance == null) instance = new StarService();
        return instance;
    }

    private void seed() {
        stars.add(new Star("Emma Watson", "https://zoomboola.com/images/catalog/2022/1/emma-watson_13.jpg", 4.5f));
        stars.add(new Star("Tom Cruise", "https://s.yimg.com/ny/api/res/1.2/c3KZgZ3Cqv3rW00fX63HKw--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD05MDA-/https://media.zenfs.com/en/insider_articles_922/bd915c23f82b369afff8db611ecbcbb0", 4.2f));
        stars.add(new Star("Scarlett Johansson", "https://m.media-amazon.com/images/M/MV5BMTM3OTUwMDYwNl5BMl5BanBnXkFtZTcwNTUyNzc3Nw@@._V1_FMjpg_UX1000_.jpg", 4.7f));
        stars.add(new Star("Leonardo DiCaprio", "https://cdn.britannica.com/65/227665-050-D74A477E/American-actor-Leonardo-DiCaprio-2016.jpg", 4.8f));
        stars.add(new Star("Bob Odenkirk", "https://extra.ie/wp-content/uploads/2023/02/Bob-Odenkirk-3.jpg", 4.5f));
        stars.add(new Star("Jonathan Banks", "https://th.bing.com/th/id/R.0d4a8884c30467f7f913b84d3cd49e52?rik=6soAPWbVcvZLsw&pid=ImgRaw&r=0", 4.2f));
    }

    @Override public boolean create(Star o) { return stars.add(o); }
    @Override public boolean update(Star o) {
        for (Star s : stars) {
            if (s.getId() == o.getId()) {
                s.setName(o.getName());
                s.setImg(o.getImg());
                s.setRating(o.getRating());
                return true;
            }
        }
        return false;
    }
    @Override public boolean delete(Star o) { return stars.remove(o); }
    @Override public Star findById(int id) {
        for (Star s : stars) if (s.getId() == id) return s;
        return null;
    }
    @Override public List<Star> findAll() { return stars; }
}
