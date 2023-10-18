/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package celilcavus.yemekHaneApp.Interfaces;

import java.util.List;

/**
 *
 * @author Celil
 * @param <T>
 */
public interface IRepository<T> {
    void Add(T item);
    void Update(T item);
    void Delete(T item);
    List<T> GetAll();
    T GetById(int id);
}
