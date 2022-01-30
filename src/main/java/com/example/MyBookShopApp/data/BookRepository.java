package com.example.MyBookShopApp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// наследуем JpaRepository (для возможности возвращения List)
public interface BookRepository extends JpaRepository<Book,Integer> {
//    // в JPA repository мы можем определять именнованные методы запроса
//    List<Book> findBooksByAuthor_FirstName(String name);
//
//    // определяем запрос при помощи аннотации query в теле которой прописываем HQL запрос(from Book соответствует запросу SELECT * FROM books)
//    @Query("from Book")
//    List<Book> customFindAllBooks();
}
