package com.hkarabakla;

import com.hkarabakla.services.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.hkarabakla");
        appContext.refresh();

        AddressService addressService = (AddressService) appContext.getBean("addressService");
        addressService.addressOperations();

        UserService userService = (UserService) appContext.getBean("userService");
        userService.userOperations();

        CategoryService categoryService = (CategoryService) appContext.getBean("categoryService");
        categoryService.categoryOperations();

        OrdersService ordersService = (OrdersService) appContext.getBean("ordersService");
        ordersService.ordersOperations();

        BookService bookService = (BookService) appContext.getBean("bookService");
        bookService.bookOperations();

        AuthorService authorService = (AuthorService) appContext.getBean("authorService");
        authorService.authorOperations();

        appContext.close();
    }
}
