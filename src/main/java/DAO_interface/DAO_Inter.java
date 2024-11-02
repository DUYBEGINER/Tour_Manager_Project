/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO_interface;

import java.util.List;

/**
 *
 * @author Admin
 * @param <T>
 */
public interface DAO_Inter<T> {
    public List<T> getAll() throws Exception;
    public boolean insert(T t) throws Exception;
    public T searchById( String t) throws Exception;
    public boolean update(T t) throws Exception;
    public boolean delete(T t) throws Exception;
    
}
