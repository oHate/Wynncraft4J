package dev.ohate.wynncraft4j.api;

import com.google.gson.reflect.TypeToken;
import dev.ohate.wynncraft4j.http.HTTPQueryParams;
import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.item.Item;
import dev.ohate.wynncraft4j.model.item.PagedItemDatabase;
import dev.ohate.wynncraft4j.model.item.query.ItemQuery;

import java.lang.reflect.Type;
import java.util.Map;

public class ItemAPI extends API {

    private static final Type ITEM_MAP_TYPE = new TypeToken<Map<String, Item>>() {}.getType();

    public ItemAPI(WynncraftHttpClient client) {
        super(client);
    }

    public PagedItemDatabase getPagedItemDatabase() {
        return getPagedItemDatabase(1);
    }

    public PagedItemDatabase getPagedItemDatabase(int page) {
        return get(PagedItemDatabase.class, "item/database",
                HTTPQueryParams.create().add("page", page));
    }

    public Map<String, Item> getItemDatabase() {
        return get(ITEM_MAP_TYPE, "item/database",
                HTTPQueryParams.create().add("fullResult", "True"));
    }

    public Map<String, Item> searchItem(ItemQuery query) {
        return post(ITEM_MAP_TYPE, "item/search", query.toString());
    }

    public Map<String, Item> searchItem(String query) {
        return get(ITEM_MAP_TYPE, "item/search/" + query);
    }

//    public ItemMetadata getItemMetadata() {
//        https://api.wynncraft.com/v3/item/metadata
//    }

}
