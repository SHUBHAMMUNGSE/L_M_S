package L_M_S.Service;

import L_M_S.Entity.Book;
import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void deleteById(Long id);
    Book borrowBook(Long bookId, Long userId);
    Book returnBook(Long bookId);
}
