import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class TestMain {

    public  static User login() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=scanner.nextLine();
        System.out.println("请输入身份：1.管理员  2.普通用户");
        int choice=scanner.nextInt();
        if(choice==1) {
            return new Admin(name);
        } else {
            return new NormalUser(name);
        }

    }

    public static void main(String[] args) {
        BookList bookList=new BookList();  //准备书籍
        User user=login();   //登录
        while(true) {
            user.menu();

            int choice = user.menu();  //选择调用方法

            user.doOperation(bookList, choice);
        }
    }


}
