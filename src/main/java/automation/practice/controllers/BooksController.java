package automation.practice.controllers;

import automation.practice.controllers.dto.BookDto;
import java.util.Collections;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("books")
@CrossOrigin
public class BooksController {
  @GetMapping("")
  public BookDto[] getBooks() {

    return new BookDto[] {
      new BookDto("Patterns of Enterprise Application Architecture", "Martin Fowler"),
      new BookDto("Clean Architecture: A Craftsman's Guide to Software Structure and Design", "Robert C. \"Uncle Bob\" Martin"),
      new BookDto("The Art of Computer Programming", "Donald Knuth "),
      new BookDto("CODE: The Hidden Language of Computer Hardware and Software", "Charles Petzold "),
      new BookDto("Agile Software Development: Principles, Patterns, and Practices", "Robert C. \"Uncle Bob\" Martin "),
      new BookDto("Introduction to Algorithms", "Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein "),
      new BookDto("Head First Design Patterns: A Brain-Friendly Guide", "Eric Freeman, Elizabeth Robson, Kathy Sierra, and Bert Bales "),
      new BookDto("Cracking the Coding Interview: 189 Programming Questions and Solutions", "Gayle Laakmann McDowell "),
      new BookDto("Don't Make Me Think: A Common Sense Approach to Web Usability", "Steve Krug"),
      new BookDto("The Clean Coder: A Code of Conduct for Professional Programmers", "Robert C. \"Uncle Bob\" Martin "),
      new BookDto("Soft Skills: The Software Developer's Life Manual", "John Sonmez"),
      new BookDto("Peopleware: Productive Projects and Teams", "Tom DeMarco and Timothy Lister"),
      new BookDto("Programming Pearls", "Jon Bentley "),
      new BookDto("Working Effectively with Legacy Code", "Michael Feathers "),
      new BookDto("The Mythical Man-Month: Essays on Software Engineering", "Frederick P. Brooks"),
      new BookDto("Refactoring: Improving the Design of Existing Code", "Martin Fowler "),
      new BookDto("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, and Ralph Johnson"),
      new BookDto("Code Complete: A Practical Handbook of Software Construction", "Steve McConnell"),
      new BookDto("The Pragmatic Programmer: From Journeyman to Master", "Andrew Hunt and Dave Thomas "),
      new BookDto("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. \"Uncle Bob\" Martin "),
    };
  }
}
