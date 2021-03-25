
    public class PaginationHelper {

        private final char[] items;
        private final int itemsPerPage;

        /**
         * PaginationHelper Constructor with parameters
         *
         * @param items        - as char array
         * @param itemsPerPage item count on each page
         */
        public PaginationHelper(char[] items, int itemsPerPage) {
            this.items = items;
            this.itemsPerPage = itemsPerPage;
        }

        /**
         * pageCount() Method returns page count
         *
         * @return int pageCount
         */
        public int pageCount() {
            int pageCount = 0;
            if (itemsPerPage > 0) {
                int rem = items.length % itemsPerPage;
                float div = items.length / itemsPerPage;
                if (rem == 0)
                    pageCount = (int) div;
                else {
                    pageCount = (int) Math.floor(div) + 1;
                }
            }
            return pageCount;
        }

        /**
         * returns entire array's number
         *
         * @return int size of the array
         */
        public int itemCount() {
            return items.length;
        }

        /**
         * returns the number of items on the current page. page_index is zero based.
         * this method should return -1 for pageIndex values that are out of range
         *
         * @param pageIndex int
         * @return int
         */
        public int pageItemCount(int pageIndex) {
            int pageCount = pageCount();
            if (pageIndex < 0 || pageIndex >= pageCount) {
                return -1;
            }
            int rem = items.length % itemsPerPage;
            int pageLength = itemsPerPage;
            if (rem != 0) {
                pageLength = items.length - pageIndex * itemsPerPage;
            }
            return pageLength;
        }

        /**
         * determines what page an item is on. Zero based indexes
         * this method should return -1 for itemIndex values that are out of range
         *
         * @param itemIndex int
         * @return int
         */
        public int pageIndex(int itemIndex) {
            int blockNum = (int) Math.floor(itemIndex / itemsPerPage);
            if (itemIndex < 0 || blockNum >= pageCount()) {
                return -1;
            }
            return blockNum;
        }
    }



