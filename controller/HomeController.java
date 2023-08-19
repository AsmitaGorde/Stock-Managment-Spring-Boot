package org.jspider.springbootwebapp.controller;

import org.jspider.springbootwebapp.book.Book;
import org.jspider.springbootwebapp.featchData.Laptop;
import org.jspider.springbootwebapp.stock.Stock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {
//book class
    List<Book> bookList=new LinkedList<>();
    {
        bookList.add(new Book(101,"java",1000));
        bookList.add(new Book(102,"Spring",2000));
        bookList.add(new Book(103,"J2ee",3000));
    }
    //book class method
    @GetMapping("/book")
    public  String getBook(Model model){
        model.addAttribute("books",bookList);//model reference inside html
        return  "book";//html reference
    }
//for class stocks
List<Stock>stockList=new LinkedList<>();
    {
        stockList.add(new Stock(1,"laptop",1000.00,1002.00));
        stockList.add(new Stock(2,"mobile",2002.00,2000.00));
        stockList.add(new Stock(3,"pen",100.00,102.00));
        stockList.add(new Stock(4,"grocery",3000.00,3002.00));
        stockList.add(new Stock(5,"books",100.00,99.00));
//display stocks
    }@GetMapping("/stock")
    public  String getStock(Model model){
        model.addAttribute("stocks",stockList);
        return "stocks";
    }
//show stock from
    @GetMapping("/showform")
    public  String showStockForm(Model model){
        model.addAttribute("stock",new Stock());
        return "stockform";
    }
    //add stocks
    @PostMapping ("/savestock")
    public String addStockForm(Stock stock){
        stockList.add(stock);
        return "redirect:/stock";
    }


    @GetMapping("/welcome")
    public String getMassage(){
        return "welcome";
    }
//laptop class
    @GetMapping("/laptop")
    public String getValue(Model model){
        Laptop l1= new Laptop("hp",25000);
        model.addAttribute("laptops",l1);
        return "laptop";
    }

}
