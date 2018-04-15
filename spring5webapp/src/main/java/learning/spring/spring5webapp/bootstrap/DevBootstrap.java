package learning.spring.spring5webapp.bootstrap;

import learning.spring.spring5webapp.model.Author;
import learning.spring.spring5webapp.model.Book;
import learning.spring.spring5webapp.model.Publisher;
import learning.spring.spring5webapp.repositories.AuthorRepository;
import learning.spring.spring5webapp.repositories.BookRepository;
import learning.spring.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {


    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }


    private void initData(){
        // Kshitiz
        Author kshitiz = new Author("Kshitiz","Lohia");
        Publisher harper = new Publisher("Harper Collins", "123, Sec3");
        publisherRepository.save(harper);

        Book helloWorld = new Book("Hello World","1234",harper);
        kshitiz.getBooks().add(helloWorld);
        helloWorld.getAuthors().add(kshitiz);

        authorRepository.save(kshitiz);
        bookRepository.save(helloWorld);



        // Tannika
        Author tannika = new Author("Tannika","Aggarwal");
        Book helloWorld2 = new Book("Hello World2","321121",harper);
        tannika.getBooks().add(helloWorld2);
        authorRepository.save(tannika);
        bookRepository.save(helloWorld2);

    }


}
