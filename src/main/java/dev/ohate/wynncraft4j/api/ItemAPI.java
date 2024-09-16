package dev.ohate.wynncraft4j.api;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.item.Item;
import dev.ohate.wynncraft4j.model.item.ItemMeta;
import dev.ohate.wynncraft4j.model.item.PagedItemsResult;
import dev.ohate.wynncraft4j.model.item.query.ItemQuery;

import java.lang.reflect.Type;
import java.util.Map;

public class ItemAPI extends API {

    private static final Type ITEM_MAP_TYPE = new TypeToken<Map<String, Item>>() {
    }.getType();

    /**
     * Constructs a new ItemAPI instance with the specified HTTP client.
     *
     * @param client The HTTP client used to make requests.
     */
    public ItemAPI(WynncraftHttpClient client) {
        super(client);
    }

    /**
     * Retrieves the first page of the item database.
     *
     * @return The result containing a list of items on the first page.
     */
    public PagedItemsResult getPagedItemDatabase() {
        return getPagedItemDatabase(1);
    }

    /**
     * Retrieves a specific page of the item database.
     *
     * @param page The page number to retrieve.
     * @return The result containing a list of items on the specified page.
     */
    public PagedItemsResult getPagedItemDatabase(int page) {
        return get(PagedItemsResult.class, "item/database",
                HTTPQueryParams.create().add("page", page));
    }

    /**
     * Retrieves the full item database as a map.
     *
     * @return A map where the keys are item identifiers and the values are item details.
     */
    public Map<String, Item> getItemDatabase() {
        return get(ITEM_MAP_TYPE, "item/database",
                HTTPQueryParams.create().add("fullResult"));
    }

    /**
     * Searches for items in the database using an {@link ItemQuery}, retrieving the first page of results.
     *
     * @param query The query used to search for items.
     * @return The result containing a list of items matching the query.
     */
    public PagedItemsResult getPagedItems(ItemQuery query) {
        return getPagedItems(query, 1);
    }

    /**
     * Searches for items in the database using an {@link ItemQuery}, retrieving a specific page of results.
     *
     * @param query The query used to search for items.
     * @param page  The page number to retrieve.
     * @return The result containing a list of items matching the query.
     */
    public PagedItemsResult getPagedItems(ItemQuery query, int page) {
        return post(PagedItemsResult.class, "item/search", query.toString(),
                HTTPQueryParams.create().add("page", page));
    }

    /**
     * Searches for items in the database using an {@link ItemQuery}, retrieving the full result as a map.
     *
     * @param query The query used to search for items.
     * @return A map where the keys are item identifiers and the values are item details.
     */
    public Map<String, Item> getItems(ItemQuery query) {
        return post(ITEM_MAP_TYPE, "item/search", query.toString(),
                HTTPQueryParams.create().add("fullResult"));
    }

    /**
     * Searches for items in the database by a query string.
     *
     * @param query The query string used to search for items.
     * @return A map where the keys are item identifiers and the values are item details.
     */
    public Map<String, Item> getItems(String query) {
        return get(ITEM_MAP_TYPE, "item/search/" + query);
    }

    /**
     * Retrieves metadata about items in the Wynncraft API.
     *
     * @return The item metadata.
     */
    public ItemMeta getItemMeta() {
        return get(ItemMeta.class, "item/metadata");
    }

}
