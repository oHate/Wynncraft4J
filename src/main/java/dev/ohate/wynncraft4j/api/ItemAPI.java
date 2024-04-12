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

    private static final Type ITEM_MAP_TYPE = new TypeToken<Map<String, Item>>() {}.getType();

    public ItemAPI(WynncraftHttpClient client) {
        super(client);
    }

    public PagedItemsResult getPagedItemDatabase() {
        return getPagedItemDatabase(1);
    }

    public PagedItemsResult getPagedItemDatabase(int page) {
        return get(PagedItemsResult.class, "item/database",
                HTTPQueryParams.create().add("page", page));
    }

    public Map<String, Item> getItemDatabase() {
        return get(ITEM_MAP_TYPE, "item/database",
                HTTPQueryParams.create().add("fullResult"));
    }

    public PagedItemsResult getPagedItems(ItemQuery query) {
        return getPagedItems(query, 1);
    }

    public PagedItemsResult getPagedItems(ItemQuery query, int page) {
        return post(PagedItemsResult.class, "item/search", query.toString(),
                HTTPQueryParams.create().add("page", page));
    }

    public Map<String, Item> getItems(ItemQuery query) {
        return post(ITEM_MAP_TYPE, "item/search", query.toString(),
                HTTPQueryParams.create().add("fullResult"));
    }

    public Map<String, Item> getItems(String query) {
        return get(ITEM_MAP_TYPE, "item/search/" + query);
    }

    public ItemMeta getItemMeta() {
        return get(ItemMeta.class, "item/metadata");
    }

}
