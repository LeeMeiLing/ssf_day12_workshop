package sg.edu.nus.iss.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import sg.edu.nus.iss.day12_workshop.model.Item;

@Repository
public class ItemRepo {

    private List<Item> itemList;

    public List<Item> getCartItems() {

        itemList = new ArrayList<>(); // instantiate the list here, if instantite outside, it will keep appending the list

        Item itm= new Item();
        itm.setItemName("Louis Vuitton");
        itm.setQuantity(5);
        itemList.add(itm);

        itm= new Item();
        itm.setItemName("Chanel");
        itm.setQuantity(6);
        itemList.add(itm);

        itm= new Item();
        itm.setItemName("Prada");
        itm.setQuantity(10);
        itemList.add(itm);

        itm= new Item();
        itm.setItemName("Hermes");
        itm.setQuantity(15);
        itemList.add(itm);

        itm= new Item();
        itm.setItemName("Bottega");
        itm.setQuantity(5);
        itemList.add(itm);

        return itemList;
    }
}
