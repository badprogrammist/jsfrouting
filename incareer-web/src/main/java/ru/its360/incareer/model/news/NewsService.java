/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.its360.incareer.model.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * @organization ITS360
 * @author Ildar Gafarov badprogrammist@gmail.com
 */
@Named
@ApplicationScoped
public class NewsService implements CRUDService<News>,Serializable {
    
    private Map<UUID,News> repository = new HashMap<>();
    
    
    @PostConstruct
    private void init() {
        News n1 = createEmptyEntity();
        n1.setContent("Good news!");
        save(n1);
        News n2 = createEmptyEntity();
        n2.setContent("Bad news!");
        save(n2);
        News n3 = createEmptyEntity();
        n3.setContent("Normal news!");
        save(n3);
    }
    
    
    @Override
    public void save(News news) {
        repository.put(news.getUuid(),news);
    }
    
    @Override
    public List<News> getAll() {
        return new ArrayList<>(repository.values());
    }
    
    @Override
    public News get(UUID uuid) {
        return repository.get(uuid);
    }
    
    @Override
    public News createEmptyEntity() {
        return new News(UUID.randomUUID());
    }
    
}
