package dev.ohate.wynncraft4j.api;

import dev.ohate.wynncraft4j.http.WynncraftHttpClient;
import dev.ohate.wynncraft4j.model.search.SearchResult;

public class SearchAPI extends API {

    /**
     * Constructs a new API instance with the specified HTTP client.
     *
     * @param client The HTTP client used to make requests.
     */
    public SearchAPI(WynncraftHttpClient client) {
        super(client);
    }

    /**
     * Performs a search using the provided query string and returns a SearchResult.
     * Player results are limited to 20 entries and guilds results to 50.
     *
     * @param query the search query string.
     * @return a SearchResult containing the results of the query.
     */
    public SearchResult searchQuery(String query) {
        return get(SearchResult.class, "search/" + query);
    }

}
