/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.its360.incareer.model.news;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author Ildar Gafarov badprogrammist@gmail.com
 */
public interface CRUDService<E> {
    public void save(E entity);
    
    public List<E> getAll();
    
    public E get(UUID uuid);
    
    public E createEmptyEntity();
}
