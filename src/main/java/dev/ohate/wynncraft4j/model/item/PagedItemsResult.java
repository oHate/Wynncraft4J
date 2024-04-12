package dev.ohate.wynncraft4j.model.item;

import java.util.Map;

public class PagedItemsResult {

    private Controller controller;
    private Map<String, Item> results;

    public Controller getController() {
        return controller;
    }

    public Map<String, Item> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "PagedItemDatabase{" +
                "controller=" + controller +
                ", results=" + results +
                '}';
    }

    public static class Controller {

        private  int count;
        private int pages;
        private int current;
        private Integer previous;
        private Integer next;

        public int getCount() {
            return count;
        }

        public int getPages() {
            return pages;
        }

        public int getCurrent() {
            return current;
        }

        public Integer getPrevious() {
            return previous;
        }

        public Integer getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Controller{" +
                    "count=" + count +
                    ", pages=" + pages +
                    ", current=" + current +
                    ", previous=" + previous +
                    ", next=" + next +
                    '}';
        }

    }

}
