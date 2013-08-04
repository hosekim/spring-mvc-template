package com.orangemako.spring.service;

import com.orangemako.spring.domain.Item;
import com.orangemako.spring.dao.ItemDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Item service class.
 *
 * @author Kevin Leong
 */
@Service
public class ItemService {
    private static final Logger LOG = LoggerFactory.getLogger(ItemService.class);

    ItemDao itemDao;

    /**
     * Returns all items.
     * @return
     */
    public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    /**
     * Retrieves an item by it's ID
     *
     * @param itemId
     * @return
     */
    public Item getById(int itemId) {
        return itemDao.getById(itemId);
    }

    /**
     * Gets all items that are less than the specified price.
     *
     * @param price
     */
    public List<Item> getItemsLessThanPrice(double price) {
        return itemDao.getItemsLessThanPrice(price);
    }

    /**
     * Inserts an item.
     *
     * @param item
     * @return Number of records added.  Should be 1 on a successful insert.
     */
    public int insertItem(Item item) {
        return itemDao.insertItem(item);
    }
}
