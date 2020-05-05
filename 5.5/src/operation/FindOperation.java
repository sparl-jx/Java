package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名");
        String name=scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book=bookList.getBook(1);
            if(book.getName().equals(name)) {
                System.out.println("book");
                System.out.println("查找成功");
                return;
            }
        }
    }
}
