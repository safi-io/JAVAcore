
package classRandomProjects;
import java.util.HashMap;

class Lib {
    private HashMap<Integer, Boolean> bookDetails;

    Lib() {
        bookDetails = new HashMap<>();
    }

    public void addBook(Integer id) {
        bookDetails.put(id, true);
    }

    public void checkoutBook(Integer id) {
        bookDetails.put(id, false);
    }

    public void returnBook(Integer id) {
        bookDetails.put(id, true);
    }

}

public class library {
    public static void main(String[] args) {
        Lib l1 = new Lib();
        l1.addBook(101);

    }
}
